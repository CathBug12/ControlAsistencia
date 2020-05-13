package com.example.control_de_asistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class inicio extends AppCompatActivity {
    TextView tv_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        tv_welcome=(TextView) findViewById(R.id.tv_welcome);

        String user = getIntent().getStringExtra("user");
        tv_welcome.setText("Bienvenido "+ user);
    }
}
