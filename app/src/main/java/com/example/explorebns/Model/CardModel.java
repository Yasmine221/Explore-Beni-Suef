package com.example.explorebns.Model;

public class CardModel {
    private String Name;
    private int Img;

    public CardModel(String restaurantName, int restaurantImg) {
        this.Name = restaurantName;
        this.Img = restaurantImg;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getImg() {
        return Img;
    }

    public void setImg(int img) {
        Img = img;
    }
}
