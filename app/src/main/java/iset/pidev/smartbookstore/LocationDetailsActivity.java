package iset.pidev.smartbookstore;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.List;

import iset.pidev.smartbookstore.entities.LocationModel;

public class LocationDetailsActivity extends AppCompatActivity {
    TextView detailDesc, detailTitle;
    ImageView detailImage;
    RecyclerView recyclerView;
    LatLng lg;
    List<LocationModel> dataList;
   LocationModel androidData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_details);

        detailDesc = findViewById(R.id.desc);
        detailTitle = findViewById(R.id.detailTitle);
        detailImage = findViewById(R.id.detailImage);
       BottomNavigationView nav = findViewById(R.id.bottomNavigationView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            detailDesc.setText(bundle.getInt("Desc"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailTitle.setText(bundle.getString("Title"));
            lg=bundle.getParcelable("lg");
        }


        //menu

nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                Intent intent = new Intent(LocationDetailsActivity.this,LocationDetailsActivity.class);
                intent.putExtra("Desc", bundle.getInt("Desc"));
                intent.putExtra("Image", bundle.getInt("Image"));
                intent.putExtra("Title", bundle.getString("Title"));

               LocationDetailsActivity.this.startActivity(intent);
                return true;
//            case R.id.hotel:
//                Intent i = new Intent(LocationDetailsActivity.this,MapActivity.class);
//                LocationDetailsActivity.this.startActivity(i);
//                return true;
            default:
                break;


        }
        return true;
    }
});
    }




}