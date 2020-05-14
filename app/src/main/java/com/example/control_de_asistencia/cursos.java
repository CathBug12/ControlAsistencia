package com.example.control_de_asistencia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import Adapters.MyAdapter;

public class cursos extends AppCompatActivity {

    ListView listView;
    String mTitle[] = {"Android: Módulo1", "Márketing Digital: Módulo1", "Diseño Web Responsivo: Módulo1"};
    String mDescription[] ={"Entender los conocimientos básicos de programación móvil en Android: Manifest, Activities, Intents y ListView.",
    "Profundizar en temas de posicionamiento, desarrollo de webs de éxito, CRM, e-mail marketing",
    "Dominar el uso de etiquetas HTML 5 y Bootstrap. Aprender el uso de las propiedades CSS3"};
    int images[]= {R.drawable.i1, R.drawable.i2, R.drawable.i3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cursos);

        listView = findViewById(R.id.lv_courses);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDescription, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Toast.makeText(cursos.this, "Curso", Toast.LENGTH_SHORT).show();
                }
                if(position==1){
                    Toast.makeText(cursos.this, "Curso", Toast.LENGTH_SHORT).show();
                }
                if(position==2){
                    Toast.makeText(cursos.this, "Curso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
