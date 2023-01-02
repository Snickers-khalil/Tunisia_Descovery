package iset.pidev.smartbookstore;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SystemExAdapter extends ArrayAdapter {
    Activity context;
    Integer [] portrait;
    String [] nom;
    String [] detaille;

    public SystemExAdapter(Activity context, Integer[] portrait, String[] nom, String[] detaille) {
        super(context,R.layout.liste,nom);
        this.context = context;
        this.portrait = portrait;
        this.nom = nom;
        this.detaille = detaille;
    }

    @NonNull

    public View getView(int info, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=context.getLayoutInflater();
        View view=layoutInflater.inflate(R.layout.liste,null,true);
        ImageView img = view.findViewById(R.id.image);
        TextView t1 = view.findViewById(R.id.nom);
        TextView t2 = view.findViewById(R.id.description);
        img.setImageResource(portrait[info]);
        t1.setText(nom[info]);
        t2.setText(detaille[info]);

        return view;
    }
}

