package iset.pidev.smartbookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class inscrit extends AppCompatActivity {
    Button b;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscrit);
        b=findViewById(R.id.enr);
        e1=findViewById(R.id.nom);
        e2=findViewById(R.id.Prenom);
        e3=findViewById(R.id.cin);
        e4=findViewById(R.id.logiin);
        e5=findViewById(R.id.email);
        e6=findViewById(R.id.pass);
        e7=findViewById(R.id.pass1);
        e8=findViewById(R.id.adresse);
        e9=findViewById(R.id.Telephone);

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences p=getSharedPreferences("MyInf",MODE_PRIVATE);
                SharedPreferences.Editor editor=p.edit();

                String nom=e1.getText().toString();
                editor.putString("n",nom);

                String Prenom=e2.getText().toString();
                editor.putString("pr",Prenom);

                String cin=e3.getText().toString();
                editor.putString("c",cin);

                String logiin=e4.getText().toString();
                editor.putString("l",logiin);

                String Email=e5.getText().toString();
                editor.putString("e",Email);

                String adresse=e8.getText().toString();
                editor.putString("a",adresse);

                String telephone=e9.getText().toString();
                editor.putString("te",telephone);

                String pass=e6.getText().toString();
                editor.putString("p",pass);

                String pass1=e7.getText().toString();
                if (pass1.equals(pass))
                {
                    editor.commit();
                    Intent i=new Intent(inscrit.this,authentif.class);
                    Toast.makeText(inscrit.this,"Inscrit avec Succes",Toast.LENGTH_LONG).show();
                    startActivity(i);
                }else
                    Toast.makeText(inscrit.this,"Verifier Votre mot de pass",Toast.LENGTH_SHORT).show();


            }

        });



    }
}