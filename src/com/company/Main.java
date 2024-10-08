package com.company;

public class Main {

    public static void main(String[] args) {

        SageBot SageBot = new SageBot("SageBot", 1.0, 3900);

        Customer ava = new Customer("Ava", "Allwardt", 30);
        Customer john = new Customer("John", "Doe", 20);
        Customer kate = new Customer("Kate", "Smith", 85);

        Food cookie = new Food("Cookie", 3.00);
        Food apple = new Food("Apple", 2.50);
        Food cereal = new Food("Cereal", 2.75);
        Food chips = new Food("Chips", 3.00);
        Food muffin = new Food("Muffin", 3.50);

    }
}
