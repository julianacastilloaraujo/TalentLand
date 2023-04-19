package com.example.talentland;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void lanzarPodio(View view){
        Intent i = new Intent(this, Puntuacion.class);
        startActivity(i);
    }
    public void lanzarConsulta(View view){
        Intent a = new Intent(this, Consulta.class);
        startActivity(a);
    }


}