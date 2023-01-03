package iset.pidev.smartbookstore.View;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import iset.pidev.smartbookstore.R;

public class MainActivity extends AppCompatActivity {
    TextView textError;
    RecyclerView r;
    ProgressDialog pd;
    FloatingActionButton b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        textError=findViewById(R.id.texterror);
        textError.setVisibility(View.INVISIBLE);
        b=findViewById(R.id.btn_add);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this ,AddActivity.class);
                startActivity(i);
            }
        });
        r=findViewById(R.id.recyler);

        r.setLayoutManager(new LinearLayoutManager(this));
        pd = new ProgressDialog(this);
        pd.setMessage("Fetching Livre...");
        pd.setCancelable(false);
        pd.show();

    }
}