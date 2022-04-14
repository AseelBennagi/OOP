package com.company;

public class Hamburger {

    private String name;
    private String breadRoll;
    private String meat;
    private double price;


    private String additionalItem1;
    private double priceItem1;

    private String additionalItem2;
    private double priceItem2;

    private String additionalItem3;
    private double priceItem3;

    private String additionalItem4;
    private double priceItem4;

    public Hamburger(String name, String breadRoll, String meat, int price) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.price = price;
    }

    public void additionalBurgerItem1( String name, double price){
        this.additionalItem1 = name;
        this.priceItem1 = price;
    }
    public void additionalBurgerItem2( String name, double price){
        this.additionalItem2 = name;
        this.priceItem2 = price;
    }
    public void additionalBurgerItem3( String name, double price){
        this.additionalItem3 = name;
        this.priceItem3 = price;
    }
    public void additionalBurgerItem4( String name, double price){
        this.additionalItem4 = name;
        this.priceItem4 = price;
    }

    public double iteminHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRoll +
                " with " + this.meat + " with a price: " + this.price);
        if(this.additionalItem1 != null){
            hamburgerPrice += priceItem1;
            System.out.println("Added " + this.additionalItem1 + " for an extra " + this.priceItem1);
        }
        if(this.additionalItem2 != null){
            hamburgerPrice += priceItem2;
            System.out.println("Added " + this.additionalItem2 + " for an extra " + this.priceItem2);
        }
        if(this.additionalItem3 != null){
            hamburgerPrice += priceItem3;
            System.out.println("Added " + this.additionalItem3 + " for an extra " + this.priceItem3);
        }
        if(this.additionalItem4 != null){
            hamburgerPrice += priceItem4;
            System.out.println("Added " + this.additionalItem4 + " for an extra " + this.priceItem4);
        }

        return hamburgerPrice;



    }
}
