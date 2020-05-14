package Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.control_de_asistencia.R;

public class MyAdapter extends ArrayAdapter<String> {
    Context context;
    String rTitle[];
    String rDescription[];
    int rImgs[];
    public MyAdapter(Context c, String title[], String description[], int imgs[]){
        super(c, R.layout.row, R.id.textView1,title);
        this.context=c;
        this.rTitle=title;
        this.rDescription= description;
        this.rImgs=imgs;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
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