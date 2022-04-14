package com.company;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Deluxe", "white", "Beef", 14);
        super.additionalBurgerItem1("Chips", 2.7);
        super.additionalBurgerItem2("drink", 3);
    }

    @Override
    public void additionalBurgerItem1(String name, double price) {
        System.out.println("You cant add any item to this burger");
    }

    @Override
    public void additionalBurgerItem2(String name, double price) {
        System.out.println("You cant add any item to this burger");
    }

    @Override
    public void additionalBurgerItem3(String name, double price) {
        System.out.println("You cant add any item to this burger");
    }

    @Override
    public void additionalBurgerItem4(String name, double price) {
        System.out.println("You cant add any item to this burger");
    }
}
