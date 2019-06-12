package com.alb.muestralabel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;


import org.w3c.dom.Text;

import java.lang.annotation.Target;

public class MainActivity extends AppCompatActivity {
private Button btnEntry;
private TextView textEntry;
private EditText txt;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEntry= findViewById(R.id.boton);
        //txt =(TextView) findViewById(R.id.textoDevuelta);
        textEntry= findViewById(R.id.textoDevuelta);

        cambiaTexto();


    }


    private void cambiaTexto(){


        btnEntry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textEntry.setText("sdhbgsdgd");

            }
        });

        }


    }


