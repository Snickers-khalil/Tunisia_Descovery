package iset.pidev.smartbookstore;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import iset.pidev.smartbookstore.entities.VilleModel;

public class DetailRegionsActivity extends AppCompatActivity {
    TextView detailDesc, detailTitle;
    ImageView detailImage;
    RecyclerView recyclerView;
    List<VilleModel> dataList;
//  VilleAdapter adapter;
    VilleModel androidData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_regions);
        detailDesc = findViewById(R.id.detailDesc);
        detailTitle = findViewById(R.id.detailTitle);
        detailImage = findViewById(R.id.detailImage);
        Bundle bundle = getIntent().getExtras();
        List<VilleModel> list = (List<VilleModel>) bundle.getSerializable("LIST");
        if (bundle != null){
            detailDesc.setText(bundle.getInt("Desc"));
            detailImage.setImageResource(bundle.getInt("Image"));
            detailTitle.setText(bundle.getString("Title"));
        }


        //RecyclerView

        recyclerView = findViewById(R.id.recycler);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(DetailRegionsActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);


//if(!list.isEmpty()) {
//    adapter = new VilleAdapter(DetailRegionsActivity.this, list);
//    recyclerView.setAdapter(adapter);
//}
    }

}