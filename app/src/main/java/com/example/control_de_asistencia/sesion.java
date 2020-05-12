package com.example.control_de_asistencia;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class sesion extends AppCompatActivity {
    EditText txt_email, txt_password;
    Button btn_iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sesion);

        txt_email = (EditText) findViewById(R.id.txt_email);
        txt_password = (EditText) findViewById(R.id.txt_password);
        btn_iniciar = (Button) findViewById(R.id.btn_iniciar);

        btn_iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InicioSesion(txt_email.getText().toString(), txt_password.getText().toString());
            }
        });

    }

    public void InicioSesion(String email, String password){
        BaseHelper helper = new BaseHelper(this, "Demo", null, 1);
        SQLiteDatabase db = helper.getWritableDatabase();
        String sql = "SELECT ID, USER, EMAIL, PASS FROM PERSONA WHERE EMAIL='"+email+"' AND PASS='"+password+"'";
        Cursor c = db.rawQuery(sql,null);
        if(c.moveToFirst()){
            Toast.makeText(this, "BIENVENIDO."+ c.getString(1),Toast.LENGTH_LONG).show();
            db.close();
        } else{

            Toast.makeText(this, "Credenciales incorrectas.",Toast.LENGTH_LONG).show();
            db.close();
        }


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
