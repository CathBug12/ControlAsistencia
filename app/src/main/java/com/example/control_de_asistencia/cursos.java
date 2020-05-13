package com.example.control_de_asistencia;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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
                if(position==0){
                    Toast.makeText(cursos.this, "Curso", Toast.LENGTH_SHORT).show();
                }
                if(position==0){
                    Toast.makeText(cursos.this, "Curso", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }




    public class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        String rDescription[];
        int rImgs[];
        MyAdapter (Context c, String title[], String description[], int imgs[]){
            super(c, R.layout.row, R.id.textView1,title);
            this.context=c;
            this.rTitle=title;
            this.rDescription= description;
            this.rImgs=imgs;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row,parent,false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.textView1);
            TextView myDescription = row.findViewById(R.id.textView2);

            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDescription.setText(rDescription[position]);

            return row;
        }
    }
}
