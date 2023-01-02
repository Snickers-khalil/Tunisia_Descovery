package iset.pidev.smartbookstore;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends FragmentActivity  implements OnMapReadyCallback {
GoogleMap gmap;
FrameLayout map;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        map=findViewById(R.id.map);
        SupportMapFragment mapFragment=(SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
this.gmap=googleMap;
        LatLng tun=new LatLng( 36.7969
                ,10.1766);
        this.gmap.addMarker(new MarkerOptions().position(tun).title("Bab bhar"));
        this.gmap.moveCamera(CameraUpdateFactory.newLatLng(tun));
    }
}