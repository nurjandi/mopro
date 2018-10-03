package com.example.jandi.tugas1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class menu_makanan extends AppCompatActivity implements View.OnClickListener{
    private EditText jmlMakanan[] = new EditText[6];
    private int jumlah[] = new int[6];
    private Button hitung;
    private int result;
    private String jml;
    private int loop;
    int harga[] = {10000,15000,11000,8000,10000,12000};
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        jmlMakanan[0] = (EditText)findViewById(R.id.editText1);
        jmlMakanan[1] = (EditText)findViewById(R.id.editText2);
        jmlMakanan[2] = (EditText)findViewById(R.id.editText3);
        jmlMakanan[3] = (EditText)findViewById(R.id.editText4);
        jmlMakanan[4] = (EditText)findViewById(R.id.editText5);
        jmlMakanan[5] = (EditText)findViewById(R.id.editText6);
        hitung = (Button)findViewById(R.id.beli);
        hitung.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(menu_makanan.this, Pesanan.class);
        total = 0;
        loop = 0;
        for(int i=0; i<6; i++){
            jml = jmlMakanan[i].getText().toString();
            if(TextUtils.isEmpty(jml)){
                jumlah[i] = 0;
                loop = loop + 1;
            }
            else{
                jumlah[i] = Integer.parseInt(jml);
                jumlah[i] = jumlah[i] * harga[i];
                total = jumlah[i] + total;
            }
        }
        if(loop==6){
            jmlMakanan[0].setError("Silahkan isi jumlah makanan/minuman");
        }
        else{
            intent.putExtra("jumlah", jumlah);
            intent.putExtra("total", total);
            startActivity(intent);
        }
    }
}
