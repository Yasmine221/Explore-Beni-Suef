package com.example.explorebns.Main;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.explorebns.Hotels.HotelActivity;
import com.example.explorebns.Restaurant.RestaurantActivity;
import com.example.explorebns.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

   private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        //click to go to restaurant
        mainBinding.restaurantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RestaurantActivity.class);
                startActivity(intent);
            }
        });

        mainBinding.hotelsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HotelActivity.class);
                startActivity(intent);
            }
        });
    }
}