package iset.pidev.smartbookstore.ui.Categorie;


import android.app.Activity;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;

import iset.pidev.smartbookstore.R;

class commentaireAdapter extends ArrayAdapter<commentaire> {
    Activity context;
    ArrayList<commentaire> listcommentaire;
    DataBaseHelper db;

    public commentaireAdapter(Activity context, ArrayList<commentaire> listcommentaire) {
        super(context,R.layout.commentaire_liste,listcommentaire );
        this.context = context;
        this.listcommentaire = listcommentaire;
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){

        View view= LayoutInflater.from(context).inflate(R.layout.commentaire_liste,null,false);
        TextView t1=view.findViewById(R.id.text_id);
        TextView t2=view.findViewById(R.id.text_name);
        ImageView im1=view.findViewById(R.id.edit_cmnt);
        ImageView im2=view.findViewById(R.id.delete_cmnt);

        t1.setText(String.valueOf(listcommentaire.get(position).getId()));
        t2.setText(listcommentaire.get(position).getDescription());
        commentaire s=listcommentaire.get(position);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=LayoutInflater.from(context);
                View subView=inflater.inflate(R.layout.commentaire_edit,null,false);
                EditText n=subView.findViewById(R.id.edit_comme);
                n.setText(s.getDescription());
                AlertDialog.Builder a=new AlertDialog.Builder(context);
                a.setTitle("edit commentaire");
                a.setView(subView);
                a.create() ;
                a.setPositiveButton("edit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String description=n.getText().toString();
                        db=new DataBaseHelper(context);
                        db.updatecommentaire(new commentaire(s.getId(),description));
                        context.finish();
                        context.startActivity(context.getIntent());



                    }
                });
                a.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context,"task cancel",Toast.LENGTH_LONG).show();
                    }
                });
                a.show();
            }
        });



        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db=new DataBaseHelper(context);
                db.removecommentaire(s.getId());
                context.finish();
                context.startActivity(context.getIntent());
            }
        });


        return view;

    }



}

