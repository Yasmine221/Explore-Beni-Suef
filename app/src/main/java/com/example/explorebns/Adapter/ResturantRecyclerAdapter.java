package com.example.explorebns.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.explorebns.Model.CardModel;
import com.example.explorebns.R;
import com.example.explorebns.databinding.ItemMainCardLayoutBinding;

import java.util.List;

public class ResturantRecyclerAdapter extends RecyclerView.Adapter<ResturantRecyclerAdapter.holder> {
    private List<CardModel> cardModelList ;
    private cardClickListenar  cardClickListenar ;
    public ResturantRecyclerAdapter(List<CardModel> cardModelList, cardClickListenar cardClickListenar) {
        this.cardModelList = cardModelList;
        this.cardClickListenar=cardClickListenar;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMainCardLayoutBinding binding = ItemMainCardLayoutBinding.bind(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_main_card_layout,parent,false));
        return new holder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        CardModel cardModel = cardModelList.get(position);
        holder.binding.restaurantName.setText(cardModel.getName());
        holder.binding.restaurantImage.setImageResource(cardModel.getImg());


    }

    @Override
    public int getItemCount() {
       if(cardModelList!=null)
           return cardModelList.size();
       return 0;
    }

    class holder extends RecyclerView.ViewHolder {
        ItemMainCardLayoutBinding binding;
        public holder(@NonNull ItemMainCardLayoutBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
            itemView.getRootView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    cardClickListenar.oncardClick(cardModelList.get(getLayoutPosition()));
                }
            });
        }
    }
    public interface cardClickListenar{
        void oncardClick(CardModel cardModel);
    }
}
