package com.example.control_de_asistencia;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class registro extends AppCompatActivity {
    EditText et_user, et_email, et_passw;
    Button btn_registrar;
    ImageButton btn_info;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        et_user= (EditText) findViewById(R.id.txt_user);
        et_email= (EditText) findViewById(R.id.txt_email);
        et_passw = (EditText) findViewById(R.id.txt_password);
        btn_registrar= (Button) findViewById(R.id.btn_next);
        btn_info= (ImageButton) findViewById(R.id.btn_info);

        btn_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AbrirDialogo();
            }
        });

        btn_registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Guardar(et_user.getText().toString(), et_email.getText().toString(), et_passw.getText().toString());
            }
        });



    }
    public void Guardar(String user, String email, String passw){
        BaseHelper helper = new BaseHelper(this, "Demo", null, 1);
        SQLiteDatabase db = helper.getWritableDatabase();
        try{
            ContentValues c = new ContentValues();
            c.put("USER", user);
            c.put("EMAIL", email);
            c.put("PASS", passw);
            db.insert("PERSONA", null, c);
            db.close();
            Toast.makeText(this, "Registro insertado.", Toast.LENGTH_LONG).show();
        } catch (Exception e){
            Toast.makeText(this, "Error:"+e.getMessage(), Toast.LENGTH_LONG).show();
        }
    }
    public void AbrirDialogo(){
        Dialog dialog = new Dialog();
        dialog.show(getSupportFragmentManager(),"Dialog");
    }
}
