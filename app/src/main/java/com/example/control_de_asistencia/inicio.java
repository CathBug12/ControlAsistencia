package com.example.control_de_asistencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class inicio extends AppCompatActivity {
    TextView tv_welcome;
    ImageButton btn_course;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        tv_welcome=(TextView) findViewById(R.id.tv_welcome);
        btn_course = (ImageButton) findViewById(R.id.btn_course);

        String user = getIntent().getStringExtra("user");
        tv_welcome.setText("Bienvenido "+ user);

        btn_course.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Siguiente(v);
            }
        });
    }

    public void Siguiente(View view){
        Intent siguiente = new Intent(this, cursos.class);
        siguiente.putExtra("iduser", getIntent().getStringExtra("iduser"));
        startActivity(siguiente);
    }
}
