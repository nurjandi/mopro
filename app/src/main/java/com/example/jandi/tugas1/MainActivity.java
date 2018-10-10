package com.example.jandi.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnMenu;
    Button btnPanggil;
    TextView hideText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMenu = (Button) findViewById(R.id.tombolmenu);
        btnPanggil = (Button) findViewById(R.id.panggil);
        hideText = (TextView) findViewById(R.id.tutup);
        btnMenu.setVisibility(View.GONE);
        btnPanggil.setVisibility(View.GONE);
        hideText.setVisibility(View.GONE);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , menu_makanan.class);
                startActivity(intent);
            }
        });
        
    }
    public void panggil(View view) {
        String nomor = "089659095277" ;
        Intent panggil = new Intent(Intent. ACTION_DIAL);
        panggil.setData(Uri. fromParts("tel",nomor,null));
        startActivity(panggil);
    }
    public void textUnHide(View view){
        btnMenu.setVisibility(View.VISIBLE);
        btnPanggil.setVisibility(View.VISIBLE);
        hideText.setVisibility(View.VISIBLE);
    }
    public void textHide(View view){
        btnMenu.setVisibility(View.GONE);
        btnPanggil.setVisibility(View.GONE);
        hideText.setVisibility(View.GONE);
    }

}
