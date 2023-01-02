package iset.pidev.smartbookstore.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.io.Serializable;
import java.util.List;

import iset.pidev.smartbookstore.DetailRegionsActivity;
import iset.pidev.smartbookstore.R;
import iset.pidev.smartbookstore.entities.RegionModel;

public class RegionAdapter extends RecyclerView.Adapter<MyViewHolder> {
private Context context;
private List<RegionModel> dataList;
public void setSearchList(List<RegionModel> dataSearchList){
        this.dataList = dataSearchList;
        notifyDataSetChanged();
        }
public RegionAdapter(Context context, List<RegionModel> dataList){
        this.context = context;
        this.dataList = dataList;
        }
@NonNull
@Override
public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.region_item, parent, false);
        return new MyViewHolder(view);
        }
@Override
public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.recImage.setImageResource(dataList.get(position).getDataImage());
        holder.recTitle.setText(dataList.get(position).getNom());
        holder.recDesc.setText(dataList.get(position).getDataDesc());
        holder.recCard.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
        Intent intent = new Intent(context, DetailRegionsActivity.class);
        intent.putExtra("Image", dataList.get(holder.getAdapterPosition()).getDataImage());
        intent.putExtra("Title", dataList.get(holder.getAdapterPosition()).getNom());
        intent.putExtra("Desc", dataList.get(holder.getAdapterPosition()).getDataDesc());
        if(!(dataList.get(holder.getAdapterPosition()).getLocation()).isEmpty()) {
            intent.putExtra("LIST", (Serializable) dataList.get(holder.getAdapterPosition()).getLocation());
        }

    context.startActivity(intent);
        }
        });
        }
@Override
public int getItemCount() {
        return dataList.size();
        }
        }
class MyViewHolder extends RecyclerView.ViewHolder{
    ImageView recImage;
    TextView recTitle, recDesc, recLang;
    CardView recCard;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        recImage = itemView.findViewById(R.id.recImage);
        recTitle = itemView.findViewById(R.id.recTitle);
        recDesc = itemView.findViewById(R.id.recDesc);
        recLang = itemView.findViewById(R.id.recLang);
        recCard = itemView.findViewById(R.id.recCard);
    }
}