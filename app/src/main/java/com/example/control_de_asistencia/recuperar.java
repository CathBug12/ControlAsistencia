package com.example.control_de_asistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class recuperar extends AppCompatActivity {

    Button btn_recu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar);

        btn_recu=(Button)findViewById(R.id.btn_recu);

        btn_recu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Recuperar(v);
            }
        });
    }
    public  void Registro(View view){
        Intent next = new Intent(this,registro.class);
        startActivity(next);
    }

    public void Recuperar(View view){
        Intent next = new Intent(this,sesion.class);
        startActivity(next);
    }
}
