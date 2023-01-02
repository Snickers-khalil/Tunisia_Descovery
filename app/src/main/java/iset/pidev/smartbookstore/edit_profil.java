package iset.pidev.smartbookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class edit_profil extends AppCompatActivity {
TextView save,logout;
ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profil);
    save=findViewById(R.id.save);
    save.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(edit_profil.this, Profile.class);
            startActivity(intent);
            Toast.makeText(edit_profil.this,"save avec Succes!!",Toast.LENGTH_SHORT).show();
            SessionManager.logOut();
        }
    });
//        logout=findViewById(R.id.logout_v);
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(edit_profil.this, authentif.class);
//                startActivity(intent);
//                Toast.makeText(edit_profil.this,"Logging out...",Toast.LENGTH_SHORT).show();
//                SessionManager.logOut();
//            }
//        });
        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(edit_profil.this, Profile.class);
                startActivity(intent);
            }
        });
    }
}