package com.example.recyclerviewdemo;

public class Item {

    int image;
    String name;
    String price;
    String month;

    public Item(int image, String name, String price, String month) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.month = month;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
