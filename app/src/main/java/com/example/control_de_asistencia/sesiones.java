package com.example.control_de_asistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import Adapters.MyAdapter2;
import Model.model_sesion;

public class sesiones extends AppCompatActivity {

    ArrayList<model_sesion> alData;
    ListView listView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesiones);

        textView=(TextView) findViewById(R.id.textView);

        alData=new ArrayList<>();

        String pos= getIntent().getStringExtra("position");
        String curso = getIntent().getStringExtra("curso");

        textView.setText("Curso: "+curso);

        if(pos.equals("0")){
            alData.add(new model_sesion(1,"Finalizado", new Date(2020,9,14), new Time(14,0,0), new Time(19,0,0)));
            alData.add(new model_sesion(2,"Finalizado", new Date(2020,9,15), new Time(9,5,0), new Time(14,0,0)));
            alData.add(new model_sesion(3,"Finalizado", new Date(2020,9,21), new Time(14,0,0), new Time(19,0,0)));
            alData.add(new model_sesion(4,"No realizada", new Date(2020,9,22), new Time(14,2,0), new Time(19,0,0)));
            alData.add(new model_sesion(5,"Finalizado", new Date(2020,9,29), new Time(9,0,0), new Time(14,0,0)));
            alData.add(new model_sesion(6,"Finalizado", new Date(2020,10,4), new Time(14,0,0), new Time(19,0,0)));
            alData.add(new model_sesion(7,"Abierta", new Date(2020,10,5), new Time(9,0,0), new Time(19,0,0)));
        } else if (pos.equals("1")){
            alData.add(new model_sesion(1,"No realizada", new Date(2020,9,16), new Time(14,0,0), new Time(17,0,0)));
            alData.add(new model_sesion(2,"Finalizado", new Date(2020,9,17), new Time(9,0,0), new Time(12,0,0)));
            alData.add(new model_sesion(3,"Finalizada", new Date(2020,9,24), new Time(14,0,0), new Time(17,0,0)));
            alData.add(new model_sesion(4,"Finalizada", new Date(2020,9,26), new Time(9,0,0), new Time(12,0,0)));
        } else if (pos.equals("2")){
            alData.add(new model_sesion(1,"Abierta", new Date(2020,10,12), new Time(14,0,0), new Time(17,0,0)));
        } else{
            Toast.makeText(this, "SESIONES NO REGISTRADAS", Toast.LENGTH_SHORT).show();
        }


        listView = findViewById(R.id.lv_sesiones);


        MyAdapter2 arrayAdapter=new MyAdapter2(this, R.layout.row2, alData);

        listView.setAdapter(arrayAdapter);

    }

}
