package com.company;

public class Customer {
    private String firstName;
    private String lastName;
    private String fullName;
    private double cash;


    public Customer(String fName, String lName, double money) {
        firstName = fName;
        lastName = lName;
        cash = money;
        fullName = firstName + " " + lastName;
    }

    public Customer(String fName, String lName) {
        firstName = fName;
        lastName = lName;
        fullName = firstName + " " + lastName;
        cash = 0.0;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return fullName;
    }

    public double getCash(){
        return cash;
    }

    public String greeting(){
        return "Hey, welcome in!";
    }

    public String greeting(Customer name) {
        return "Hey, " + name.getFirstName() + " welcome in!";
    }

    public String toString() {
        return fullName + " has $" + cash;
    }

    public void makePurchase(Food itemBeingBought){
        cash -= itemBeingBought.getFoodPrice();

    }

    public void makePurchase(Food itemBeingBought, int quantity) {
        cash -= itemBeingBought.getFoodPrice() * quantity;
    }

    public void makeReturn(Food itemBeingBought){
        cash += itemBeingBought.getFoodPrice();
    }

    public void makeReturn(Food itemBeingBought, int quantity) {
        cash += itemBeingBought.getFoodPrice() * quantity;
    }
}
