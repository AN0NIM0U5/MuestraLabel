package com.alb.muestralabel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Debug;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/// Color apps
public class Main3Activity extends AppCompatActivity {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btn1= findViewById(R.id.boton1);
        btn2= findViewById(R.id.boton2);
        btn3= findViewById(R.id.boton3);
        btn4= findViewById(R.id.boton4);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LINEA","btn1");
                Toast.makeText(getApplicationContext(),"colorRojo",Toast.LENGTH_LONG);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LINEA","btn2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LINEA","btn3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("LINEA","btn4");

            }
        });
    }
}
