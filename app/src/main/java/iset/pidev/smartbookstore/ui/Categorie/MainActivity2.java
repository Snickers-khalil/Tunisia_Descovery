package iset.pidev.smartbookstore.ui.Categorie;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import iset.pidev.smartbookstore.R;

public class MainActivity2 extends AppCompatActivity {
    private ListView l;
    private DataBaseHelper db;
    private commentaireAdapter adapter;
    private ArrayList<commentaire> listcommentaire;
    private FloatingActionButton btn_add;
    private ImageView edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        l=findViewById(R.id.list_view);
        db=new DataBaseHelper(this);
        int nbcmnt=db.getcommentaireCount();
        if(nbcmnt==0)
            Toast.makeText(this, "Empty database", Toast.LENGTH_SHORT).show();
        else
        {
            listcommentaire=db.getAllcommentaire();
            adapter=new commentaireAdapter(this,listcommentaire);
            l.setAdapter(adapter);
        }
        btn_add=findViewById(R.id.btn_add);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater inflater=LayoutInflater.from(MainActivity2.this);
                View subView=inflater.inflate(R.layout.commentaire_add,null,false);
                EditText n=subView.findViewById(R.id.edit_comme);
                AlertDialog.Builder a=new AlertDialog.Builder(MainActivity2.this);
                a.setTitle("add new commentaire");
                a.setView(subView);
                a.create() ;
                a.setPositiveButton("add", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        String description=n.getText().toString();

                        commentaire s=new commentaire(description);
                        db.addcommentaire(s);
                        finish();
                        startActivity(getIntent());

                    }
                });
                a.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity2.this,"task cancel",Toast.LENGTH_LONG).show();
                    }
                });
                a.show();
            }

        });


    }
}

