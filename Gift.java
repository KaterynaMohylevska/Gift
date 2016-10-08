package com.mohylevska.newstart.Gift;

/**
 * Created by cs.ucu.edu.ua on 08.10.2016.
 */
public class Gift {
    private int max = 7;

    private Candy[] candies = new Candy[max];

    private int lastIndex = 0;

    public void addCandy(Candy newCandy){

        if (max - 1 < lastIndex ){
            Candy[] newCandies = new Candy[max * 2];
            for (int i = 0; i < max; i++){
                newCandies[i] = candies[i];
            }
            max = max * 2;
            candies = newCandies;
        }

        candies[lastIndex] = newCandy;
        lastIndex++;

    }

    public void getGift(){
        for (int i = 0; i < lastIndex; i++){
            System.out.println("Name is " + candies[i].getName() + ", the weight = "
                    + candies[i].weight + "g, price = " + candies[i].getPrice());
        }
    }

    public void sortPrice(){
        for (int i = 1; i < lastIndex; i++){
            double price = candies[i].getPrice();
            Candy candy = candies[i];
            int position = i;
            while (position > 0 && candies[position - 1].getPrice() > price){
                candies[position] = candies[position - 1];
                position = position - 1;
            }
            candies[position] = candy;
        }
    }

    public double giftWeight(){
        double weight = 0;
        for (int j = 0; j < lastIndex; j++){
            weight += candies[j].weight;
        }
        return weight;
    }

}
