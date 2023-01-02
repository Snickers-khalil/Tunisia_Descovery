package iset.pidev.smartbookstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {
    private final int SPASH_SCREEN_TIMEout=3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // rediriger vers la page suivant apres 3s
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),authentif.class);
                startActivity(i);
                finish();
            }
        }, SPASH_SCREEN_TIMEout);
    }
}