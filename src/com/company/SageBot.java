package com.company;

public class SageBot {
    private String name;
    private double versionNumber;
    private double cash;

    public SageBot() {

    }

    public SageBot(String theName, double theVersionNumber, double theMoney) {
        name = theName;
        versionNumber = theVersionNumber;
        cash = theMoney;
    }

    public String getName() {
        return name;
    }

    public double getVersionNumber() {
        return versionNumber;
    }

    public double getCash() {
        return cash;
    }

    public String toString() {
        return name + " has $" + cash;
    }

    public void makePurchase(Customer customer, Food itemBeingBought) {
        customer.makePurchase(itemBeingBought);
        cash += itemBeingBought.getFoodPrice();
        System.out.println("Buying: " + itemBeingBought.getFoodName() + " for $" + itemBeingBought.getFoodPrice());
    }


    public void makePurchase(Customer customer, Food itemBeingBought, int quantity) {
        customer.makePurchase(itemBeingBought, quantity);
        cash += itemBeingBought.getFoodPrice() * quantity;
        System.out.println("Buying: " + quantity + " " + itemBeingBought.getFoodName() + " for $" + itemBeingBought.getFoodPrice() * quantity + " total");
    }

    public void makeReturn(Customer customer, Food itemBeingBought) {
        customer.makeReturn(itemBeingBought);
        cash -= itemBeingBought.getFoodPrice();
        System.out.println("Returning: " + itemBeingBought.getFoodName() + " for $" + itemBeingBought.getFoodPrice());
        System.out.println("SageBot now has $" + cash);
        System.out.println(customer + " now has $" + customer.getCash());
    }

    public void makeReturn(Customer customer, Food itemBeingBought, int quantity) {
        customer.makeReturn(itemBeingBought, quantity);
        cash -= itemBeingBought.getFoodPrice() * quantity;
        System.out.println("Returning: " + quantity + " " + itemBeingBought.getFoodName() + " for $" + itemBeingBought.getFoodPrice() * quantity + " total");
        System.out.println("SageBot now has: $" + cash);
        System.out.println(customer.getFullName() + " now has: $" + customer.getCash());
    }


}
