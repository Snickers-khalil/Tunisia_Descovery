package iset.pidev.smartbookstore.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;


import iset.pidev.smartbookstore.R;
import iset.pidev.smartbookstore.livre.Livre;


public class LiverAdapter extends RecyclerView.Adapter<LivreViewHolder> {
        Context context;
        List<Livre> list;

        public LiverAdapter(Context context, List<Livre> list) {
            this.context = context;
            this.list = list;
        }

        @NonNull
        @Override
        public LivreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_livre,parent,false);
            return new LivreViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull LivreViewHolder holder, int position) {
            holder.nom.setText(list.get(position).getNom());
            holder.rubrique.setText(String.valueOf(list.get(position).getRebrique()));
            Picasso.with(context).load(list.get(position).getImageURL())
                    .placeholder(R.drawable.load)
                    .into(holder.image);

        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }

