package com.example.eatitserver.Model;

public class Food {

    private String Name,price,description,Discount,imageUrl,MenuId;

    public Food() {}

    public Food(String name, String price, String description, String discount, String imageUrl, String menuId) {
        Name = name;
        this.price = price;
        this.description = description;
        Discount = discount;
        this.imageUrl = imageUrl;
        MenuId = menuId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
