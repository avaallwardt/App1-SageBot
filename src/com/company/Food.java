package com.company;

public class Food {
    private String foodName;
    private double foodPrice;

    public Food(String name, double price) {
        foodName = name;
        foodPrice = price;
    }


    public String getFoodName(){
        return foodName;
    }

    public double getFoodPrice(){
        return foodPrice;
    }


    public void changeFoodPrice(double newFoodPrice) {
        foodPrice = newFoodPrice;
    }

    public String toString() {
        return "Food name: " + foodName + "and price: " + foodPrice;
    }
}


