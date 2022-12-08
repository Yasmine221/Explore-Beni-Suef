package com.example.explorebns.Hotels;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.explorebns.Adapter.ResturantRecyclerAdapter;
import com.example.explorebns.Model.CardModel;
import com.example.explorebns.R;
import com.example.explorebns.Restaurant.RestaurantDetailesActivity;
import com.example.explorebns.databinding.FragmentHotelsBinding;
import com.example.explorebns.databinding.FragmentRestarantBinding;

import java.util.ArrayList;


public class HotelsFragment extends Fragment implements ResturantRecyclerAdapter.cardClickListenar{
    FragmentHotelsBinding binding;
    ArrayList<CardModel> cardModels=new ArrayList<>();
    ResturantRecyclerAdapter adapter;
    RecyclerView recyclerView;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_hotels, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        binding= FragmentHotelsBinding.bind(view);
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.hotelsCardRecycler);
        setUpRecycle();
    }

    private void setUpRecycle() {
        adapter=new ResturantRecyclerAdapter(cardModels,this::oncardClick);
        binding.hotelsCardRecycler.setAdapter(adapter);
        binding.hotelsCardRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
        addFakeData();
    }

    private void addFakeData() {
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
        cardModels.add(new CardModel("Lamera",R.drawable.lamera));
    }

    @Override
    public void oncardClick(CardModel cardModel) {
        startActivity(new Intent(requireActivity(),HotelsDetailsActivity.class));
    }
}