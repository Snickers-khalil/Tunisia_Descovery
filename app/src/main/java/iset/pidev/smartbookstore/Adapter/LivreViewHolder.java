package iset.pidev.smartbookstore.Adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import iset.pidev.smartbookstore.R;


public class LivreViewHolder extends RecyclerView.ViewHolder {
    TextView nom,rubrique;
    ImageView image;


    public LivreViewHolder(@NonNull View itemView) {
        super(itemView);
        nom=itemView.findViewById(R.id.text_nom);
        rubrique=itemView.findViewById(R.id.text_rubrique);
        image=itemView.findViewById(R.id.image);

    }
}
