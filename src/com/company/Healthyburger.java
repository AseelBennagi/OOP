package com.company;

public class Healthyburger extends Hamburger {

    private String additionalItem5;
    private double priceItem5;

    private String additionalItem6;
    private double priceItem6;

    public Healthyburger(String meat, int price) {
        super("Healthy", "brown rye bread roll", meat, price);
    }


    public void additionalBurgerItem5(String name, double price) {
        this.additionalItem5 = name;
        this.priceItem5 = price;
    }

    public void additionalBurgerItem6(String name, double price) {
        this.additionalItem6 = name;
        this.priceItem6 = price;
    }

    @Override
    public double iteminHamburger() {
        double hamburgerPrice = super.iteminHamburger();
        if(this.additionalItem5 != null){
            hamburgerPrice += priceItem5;
            System.out.println("Added " + this.additionalItem5 + " for an extra " + this.priceItem5);
        }
        if(this.additionalItem6 != null){
            hamburgerPrice += priceItem6;
            System.out.println("Added " + this.additionalItem6 + " for an extra " + this.priceItem6);
        }
        return hamburgerPrice;
    }
}

