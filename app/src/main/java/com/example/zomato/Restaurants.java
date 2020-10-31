package com.example.zomato;

import android.graphics.Bitmap;

public class Restaurants {
    private String name;
    private int offer;
    private int deliveryTime;
    private String[] foodType;
    private int minOrder;
    private boolean bookMark;
    private  double rating;
    private String placeStatus;


    public String getPlaceStatus() {
        return placeStatus;
    }

    public void setPlaceStatus(String placeStatus) {
        this.placeStatus = placeStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOffer() {
        return offer;
    }

    public void setOffer(int offer) {
        this.offer = offer;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String[] getFoodType() {
        return foodType;
    }

    public void setFoodType(String[] foodType) {
        this.foodType = foodType;
    }

    public int getMinOrder() {
        return minOrder;
    }

    public void setMinOrder(int minOrder) {
        this.minOrder = minOrder;
    }

    public boolean isBookMark() {
        return bookMark;
    }

    public void setBookMark(boolean bookMark) {
        this.bookMark = bookMark;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Restaurants(String name, int offer, int deliveryTime, String[] foodType, int minOrder, boolean bookMark, double rating, String placeStatus) {
        this.name = name;
        this.offer = offer;
        this.deliveryTime = deliveryTime;
        this.foodType = foodType;
        this.minOrder = minOrder;
        this.bookMark = bookMark;
        this.rating = rating;
        this.placeStatus = placeStatus;
    }
}
