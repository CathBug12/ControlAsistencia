package Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.control_de_asistencia.R;

import java.util.ArrayList;

import Model.model_sesion;

public class MyAdapter2 extends ArrayAdapter<model_sesion> {
    Context context;
    int resource;
    ArrayList<model_sesion> alData;

    public MyAdapter2(Context context, int resource, ArrayList<model_sesion> alData){
        super(context, resource, alData);
        this.context= context;
        this.resource=resource;
        this.alData=alData;
    }
    @Override
    public View getView (int position, View convertView, ViewGroup parent){
        LayoutInflater layoutInflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.row2, parent, false);
        TextView cod = (TextView) view.findViewById(R.id.cod);
        TextView estado= (TextView) view.findViewById(R.id.estado);
        TextView fecha=(TextView) view.findViewById(R.id.fecha);
        TextView hinicio=(TextView) view.findViewById(R.id.hinicio);
        TextView hfin=(TextView) view.findViewById(R.id.hfin);

        cod.setText("Sesión "+ String.valueOf(alData.get(position).getCod()));
        estado.setText(alData.get(position).getEstado());
        fecha.setText(alData.get(position).getFecha().toString());
        hinicio.setText(alData.get(position).getHinicio().toString());
        hfin.setText(alData.get(position).getHfin().toString());


        return view;
    }
}
