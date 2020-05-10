package com.example.control_de_asistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);
    }

    public  void Registro(View view){
        Intent next = new Intent(this,registro.class);
        startActivity(next);
    }
    public  void Recuperar(View view){
        Intent next = new Intent(this,recuperar.class);
        startActivity(next);
    }
}
