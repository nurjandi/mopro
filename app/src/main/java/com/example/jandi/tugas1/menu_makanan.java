package com.example.jandi.tugas1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class menu_makanan extends AppCompatActivity implements View.OnClickListener{
    private TextView txtView[] = new TextView[6];
    private int jumlah[] = new int[6];
    private Button hitung;
    private int result;
    private String m_Text = "";
    private String jml;
    private int loop;
    int harga[] = {10000,15000,11000,8000,10000,12000};
    int total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_makanan);
        hitung = (Button)findViewById(R.id.beli);
        hitung.setOnClickListener(this);
        txtView[0] = (TextView) findViewById(R.id.food1);
        txtView[1] = (TextView) findViewById(R.id.food2);
        txtView[2] = (TextView) findViewById(R.id.food3);
        txtView[3] = (TextView) findViewById(R.id.food4);
        txtView[4] = (TextView) findViewById(R.id.food5);
        txtView[5] = (TextView) findViewById(R.id.food6);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(menu_makanan.this, Pesanan.class);
        total = 0;
        loop = 0;
        for(int i=0; i<6; i++){
            jml = txtView[i].getText().toString();
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
            Toast.makeText(getApplicationContext(), "Ini adalah contoh Toast di Android",Toast.LENGTH_LONG).show();
        }
        else{
            intent.putExtra("jumlah", jumlah);
            intent.putExtra("total", total);
            startActivity(intent);
        }
    }
    public void pesan1(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[0].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
    }
    public void pesan2(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[1].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

    }
    public void pesan3(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[2].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

    }
    public void pesan4(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[3].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

    }
    public void pesan5(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[4].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

    }
    public void pesan6(View v){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Jumlah Makanan");
        final EditText input = new EditText(this);
        input.setInputType(InputType.TYPE_CLASS_NUMBER);
        builder.setView(input);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                m_Text = input.getText().toString();
                txtView[5].setText(m_Text);
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

    }
}
