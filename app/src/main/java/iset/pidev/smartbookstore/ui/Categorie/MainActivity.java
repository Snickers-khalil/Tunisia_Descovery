package iset.pidev.smartbookstore.ui.Categorie;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import iset.pidev.smartbookstore.Adapter.RegionAdapter;
import iset.pidev.smartbookstore.R;
import iset.pidev.smartbookstore.entities.RegionModel;
import iset.pidev.smartbookstore.entities.VilleModel;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<RegionModel> dataList;
    RegionAdapter adapter;

    VilleModel ville;
    RegionModel androidData;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);



//RecyclerView
        recyclerView = findViewById(R.id.recyclerView);
        searchView = findViewById(R.id.search);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {
                searchList(newText);
                return true;
            }
        });
        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();
        //Tunis
        List<VilleModel> location= new ArrayList<>();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);

        ville = new VilleModel("La mosquée Zitouna à Tunis",R.string.zitouna,  R.drawable.zitouna);
        location.add(ville);
        androidData = new RegionModel("Tunis",R.string.tunis,  R.drawable.tn,location);
        //Creation des ville

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Bèja",R.string.app_name,  R.drawable.beja,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);

        androidData = new RegionModel("Bizerte",R.string.app_name,  R.drawable.bizerte,location);

        dataList.add(androidData);
        List<VilleModel> location2= new ArrayList<>();

        //kairaouan
        ville = new VilleModel("Les bassins des Aghlabides",R.string.aghlab,  R.drawable.aghlab);
        location2.add(ville);
        ville = new VilleModel("La grande mosquée de Kairouan",R.string.mosqueK,  R.drawable.mosquek);
        location2.add(ville);
        ville = new VilleModel("La maison du Bey",R.string.beyM,  R.drawable.bey);
        location2.add(ville);
        ville = new VilleModel("Les souks ",R.string.souq,  R.drawable.souq);
        location2.add(ville);
        //Sousse
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Sousse",R.string.app_name,  R.drawable.sousse,location);
        dataList.add(androidData);
        //mahdia
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Mahdia",R.string.app_name,  R.drawable.mahdia,location);
        dataList.add(androidData);
        //nabeul
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Nabeul",R.string.app_name,  R.drawable.nabeul,location);

        dataList.add(androidData);
        //mednine
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Medenine",R.string.app_name,  R.drawable.medenine,location);
        dataList.add(androidData);
        //kasserine
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Kasserine",R.string.app_name,  R.drawable.kasserine,location);
        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Touzeur",R.string.app_name,  R.drawable.touzeur,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);

        androidData = new RegionModel("Gabès",R.string.app_name,  R.drawable.gabes,location);
        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Tataouine",R.string.app_name,  R.drawable.tataouine,location);
        dataList.add(androidData);
        androidData = new RegionModel("Sfax",R.string.app_name, R.drawable.sfax,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);

        androidData = new RegionModel("Siliana",R.string.app_name,  R.drawable.siliana);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Jendouba",R.string.app_name,  R.drawable.jendouba);



        androidData = new RegionModel("Kairaouan",R.string.kairaouan,  R.drawable.kairaouan,location2);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Kebili",R.string.app_name,  R.drawable.kebili,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Monastir",R.string.app_name,  R.drawable.monastir,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);

        androidData = new RegionModel("Manouba",R.string.app_name,  R.drawable.manouba,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Zaghouane",R.string.app_name,  R.drawable.zaghouan,location);

        dataList.add(androidData);
        location.clear();
        ville = new VilleModel("Musée du Bardo",R.string.bardo,  R.drawable.bardo);
        location.add(ville);
        ville = new VilleModel("Le site archéologique de Carthage",R.string.carthage,  R.drawable.carthage);
        location.add(ville);
        ville = new VilleModel("Médina de Tunis",R.string.medinaT,  R.drawable.medinat);
        location.add(ville);
        ville = new VilleModel("La cathédrale St.Vincent de Paul ",R.string.stpaul,  R.drawable.stpaul);
        location.add(ville);
        ville = new VilleModel("Bab El Bhar de Tunis",R.string.bebbhar,  R.drawable.bebbhar);
        location.add(ville);
        androidData = new RegionModel("Ariana",R.string.app_name,  R.drawable.ariana,location);

        dataList.add(androidData);

        adapter = new RegionAdapter(MainActivity.this, dataList);
        recyclerView.setAdapter(adapter);
    }
    private void searchList(String text){
        List<RegionModel> dataSearchList = new ArrayList<>();
        for (RegionModel data : dataList){
            if (data.getNom().toLowerCase().contains(text.toLowerCase())) {
                dataSearchList.add(data);
            }
        }
        if (dataSearchList.isEmpty()){
            Toast.makeText(this, "Not Found", Toast.LENGTH_SHORT).show();
        } else {
            adapter.setSearchList(dataSearchList);
        }
    }
}
