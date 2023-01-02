package iset.pidev.smartbookstore.View;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

import iset.pidev.smartbookstore.Adapter.LiverAdapter;
import iset.pidev.smartbookstore.R;
import iset.pidev.smartbookstore.livre.Livre;
import iset.pidev.smartbookstore.retro.ApiInterface;
import iset.pidev.smartbookstore.retro.Apibook;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    TextView textError;
    RecyclerView r;
    ProgressDialog pd;
    List<Livre> LivreList;
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
        try{
            ApiInterface apiService = Apibook.getbook().create(ApiInterface.class);
            Call<List<Livre>> call = apiService.getlivre();
            call.enqueue(new Callback<List<Livre>>() {
                @Override
                public void onResponse(Call<List<Livre>> call, Response<List<Livre>> response) {
                   LivreList=response.body();
                    LiverAdapter adapter=new LiverAdapter(MainActivity.this,LivreList);
                    r.setAdapter(adapter);
                    r.smoothScrollToPosition(0);
                    pd.hide();
                }

                @Override
                public void onFailure(Call<List<Livre>> call, Throwable t) {
                    Log.d("TAG", "Response = " + t.toString());
                    Toast.makeText(MainActivity.this, "Error Fetching Data!", Toast.LENGTH_SHORT).show();
                    textError.setVisibility(View.VISIBLE);
                    pd.hide();
                }
            });

        }catch (Exception e){
            Log.d("Error", e.getMessage());
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }

    }
}