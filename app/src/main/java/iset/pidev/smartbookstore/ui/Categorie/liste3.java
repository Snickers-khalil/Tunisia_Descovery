package iset.pidev.smartbookstore.ui.Categorie;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import iset.pidev.smartbookstore.R;

public class liste3 extends AppCompatActivity {
    private Button b1,b2,b3;
    private ImageButton back;
    private Button c1,c2,c3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste3);
        c1=findViewById(R.id.com3);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( liste3.this , MainActivity2.class);
                startActivity(i);
            }
        });
        c2=findViewById(R.id.com2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( liste3.this , MainActivity2.class);
                startActivity(i);
            }
        });
        c3=findViewById(R.id.com3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent( liste3.this , MainActivity2.class);
                startActivity(i);
            }
        });
    }
}