package com.example.eva1_7_eventos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button btnlnLISTENER, btnPorClaseAnonima;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlnLISTENER = findViewById(R.id.btninListener);
        btnlnLISTENER.setOnClickListener(this);
        Context context = getApplicationContext();
        View.OnClickListener miclickLis = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        btnPorClaseAnonima = findViewById(R.id.btnPorClaseAnonima);

        btnPorClaseAnonima.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "POR CLASE ANONIMA", Toast.LENGTH_SHORT).show();
            }
        });
    }

    //EVENTO CLIC
    public void miclick(View v){
        Toast.makeText(this, "Hola world!!!", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Eventazo por interfaz", Toast.LENGTH_SHORT).show();

    }
}
