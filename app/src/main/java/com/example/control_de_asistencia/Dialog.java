package com.example.control_de_asistencia;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatDialogFragment;

public class Dialog extends AppCompatDialogFragment {

    @Override
    public AlertDialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Términos y Condiciones").setMessage("Todo texto, " +
                "información, datos, gráficos, código fuente, muestras de audio y vídeo, " +
                "marcas y logotivos, y similares, pertenecen al desarrollador de esta Aplicación.")
                .setPositiveButton("Aceptar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}
