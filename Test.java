package com.mohylevska.newstart.Gift;

/**
 * Created by cs.ucu.edu.ua on 08.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Gift gift = new Gift();
        Chocolate choco1 = new Chocolate("Poppy", 8, 10);
        Chocolate choco2 = new Chocolate("Cow", 3.5, 7);
        Chocolate choco3 = new Chocolate("Camomile", 9, 15);
        Caramel caramel1 = new Caramel("Milk droplets", 7.1, 8.7);
        Caramel caramel2 = new Caramel("Bonbonita", 5, 5.7);


        gift.addCandy(choco1);
        gift.addCandy(choco2);
        gift.addCandy(choco3);
        gift.addCandy(caramel1);
        gift.addCandy(caramel2);


        System.out.println("Sorted by price: ");
        gift.sortPrice();
        gift.getGift();

        System.out.println("\nThe weight of gift = " + gift.giftWeight() + "g");
    }
}
