package com.example.eatitserver.Model;

public class Category {
    private String Food;
    private String imageUrl;

    public Category() {
    }

    public Category(String food, String imageUrl) {
        Food = food;
        this.imageUrl = imageUrl;
    }

    public String getFood() {
        return Food;
    }

    public void setFood(String food) {
        Food = food;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
