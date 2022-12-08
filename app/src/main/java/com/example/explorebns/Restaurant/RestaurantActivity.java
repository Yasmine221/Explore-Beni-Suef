package com.example.explorebns;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.explorebns.Adapter.FragmentRestaruntAdapter;
import com.example.explorebns.databinding.ActivityRestaurantBinding;

public class RestaurantActivity extends AppCompatActivity {
  ActivityRestaurantBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       binding = ActivityRestaurantBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        FragmentRestaruntAdapter adapter=new FragmentRestaruntAdapter(getSupportFragmentManager());
        adapter.addFragment(new RestarantFragment(),"");
        binding.restaurantPager.setAdapter(adapter);
    }
}