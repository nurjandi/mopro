package com.example.jandi.tugas1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnMenu = (Button)findViewById(R.id.tombolmenu);
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

}
