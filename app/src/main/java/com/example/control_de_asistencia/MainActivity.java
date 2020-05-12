package com.example.control_de_asistencia;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Handler;
import android.os.RecoverySystem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {
    ProgressBar p;
    Handler h= new Handler();
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        p=(ProgressBar) findViewById(R.id.progressBar);
        Run();

    }
    public void Run(){
        Thread hilo=new Thread(new Runnable() {
            @Override
            public void run() {
                while(i<=50){
                    h.post(new Runnable() {
                        @Override
                        public void run() {
                            p.setProgress(i);
                        }
                    });
                    try{
                        Thread.sleep(100);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    if(i==50){
                        Intent sig = new Intent(MainActivity.this, sesion.class);
                        startActivity(sig);
                    }
                    i++;
                }
            }
        });
        hilo.start();

    }

}
