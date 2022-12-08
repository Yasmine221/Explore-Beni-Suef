package com.example.explorebns.Hotels;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.explorebns.Adapter.FragmentRestaruntAdapter;
import com.example.explorebns.R;
import com.example.explorebns.Restaurant.RestarantFragment;
import com.example.explorebns.databinding.ActivityHotelBinding;
import com.example.explorebns.databinding.ActivityRestaurantBinding;

public class HotelActivity extends AppCompatActivity {
 ActivityHotelBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHotelBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        FragmentRestaruntAdapter adapter=new FragmentRestaruntAdapter(getSupportFragmentManager());
        adapter.addFragment(new HotelsFragment(),"");
        binding.restaurantPager.setAdapter(adapter);
    }
}