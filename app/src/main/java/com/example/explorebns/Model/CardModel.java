package com.example.explorebns;

public class CardModel {
    private String restaurantName;
    private int restaurantImg;

    public CardModel(String restaurantName, int restaurantImg) {
        this.restaurantName = restaurantName;
        this.restaurantImg = restaurantImg;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public int getRestaurantImg() {
        return restaurantImg;
    }

    public void setRestaurantImg(int restaurantImg) {
        this.restaurantImg = restaurantImg;
    }
}
