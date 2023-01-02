package iset.pidev.smartbookstore;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class Profile extends AppCompatActivity {
    private TextView edite_bn,logout;
    private String mail,pass;
    ImageView back;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

                ProfilFragment profilFragment=new ProfilFragment();
                FragmentManager fm=getSupportFragmentManager();
                FragmentTransaction transaction=fm.beginTransaction();
                transaction.replace(R.id.frag,profilFragment).commit();

//        edite_bn=findViewById(R.id.edit_btn);
//        edite_bn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Profile.this, edit_profil.class);
//                startActivity(i);
//            }
//        });

//       logout=findViewById(R.id.logout_v);
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(Profile.this, authentif.class);
//                startActivity(intent);
//                Toast.makeText(Profile.this,"Logging out...",Toast.LENGTH_SHORT).show();
//                SessionManager.logOut();
//            }
//        });
        back=findViewById(R.id.back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Profile.this, home.class);
                startActivity(intent);
            }
        });
    }

}