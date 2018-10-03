package com.example.jandi.tugas1;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class Pesanan extends AppCompatActivity implements View.OnClickListener{
    private RecyclerView recyclerView;
    private Menu_Adapter adapter;
    private ArrayList<Model_Pesanan> menuArrayList;

    int jumlah[] = new int[6];
    int total;
    TextView totalHarga;
    Button selesai;
    String menu[] = {"Mie Ayam","Mie Sapi","Mie Kambing","Mie Dingin","Mie Dingin OK", "Mie Dingin Banget"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesanan);
        Bundle bundle = getIntent().getExtras();
        jumlah = bundle.getIntArray("jumlah");
        total = bundle.getInt("total");
        menuArrayList = new ArrayList<>();
        for(int i=0; i<6; i++){
            if(jumlah[i]!=0){
                menuArrayList.add(new Model_Pesanan(menu[i],Integer.toString(jumlah[i])));
            }
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new Menu_Adapter(menuArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(Pesanan.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
        totalHarga = (TextView)findViewById(R.id.harga_total);
        totalHarga.setText(Integer.toString(total));
        selesai = (Button)findViewById(R.id.selesai);
        selesai.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Pesanan.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

}
