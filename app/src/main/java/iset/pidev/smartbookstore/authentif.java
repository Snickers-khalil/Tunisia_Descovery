package iset.pidev.smartbookstore;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class authentif extends AppCompatActivity {
    String email;
    EditText t1,t2;
    Button b1,inscrit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_authentif);
        t1=findViewById(R.id.email);
        t2=findViewById(R.id.password);
        b1=findViewById(R.id.connect);
        inscrit=findViewById(R.id.inscritv);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String log =t1.getText().toString() ;
                String pwd =t2.getText().toString();
                SharedPreferences sp=getSharedPreferences("MyInf",MODE_PRIVATE);
                String login=sp.getString("l","");
                String password=sp.getString("p","");

                if (log.equals("") || pwd.equals(""))
                {
                    Toast.makeText(authentif.this,"champs Vide",Toast.LENGTH_SHORT).show();
                }
                else if (!log.equals(login) || !pwd.equals(password)) {
                    Toast.makeText(authentif.this, "Email ou/et mot de pass incorrect!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(authentif.this,home.class);
                    i.putExtra("log",email);
                    startActivity(i);
                }
            }
        });
        inscrit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(authentif.this,inscrit.class);
                intent.putExtra("log",email);
                startActivity(intent);
            }
        });

    }
}