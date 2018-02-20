/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Blackjack;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author guest1Day
 */
public class Blackjack {

    public static void main(String args[]) {
        Dealer dr = new Dealer();
        User us = new User();
//            System.out.println(dr.cards);
//            System.out.println(dr.deal());
//            ArrayList<Integer> deal = dr.deal();
//            dr.setCard(deal);
//            System.out.println(dr.myCard);
//            System.out.println(dr.open());
        dr.deal();
        ArrayList<Integer> dealdr = dr.deal();
        dr.setCard(dealdr);

        us.deal();
        ArrayList<Integer> dealus = us.deal();
        dr.setCard(dealus);

        while (dr.checkSum() == false) {
            dr.hit();
            dr.myCard.addAll(dr.hit());
            dr.checkSum();
        }

        while (us.checkSum() == false) {
            us.hit();
            us.myCard.addAll(dr.hit());
            us.checkSum();
        }

        dr.open();

        us.open();
        System.out.println("Dealer"+dr.open());
        System.out.println("User"+us.open());

        if (dr.open() < 22 && us.open() < dr.open()) {
            System.out.print("Dealerの勝ちです");
        }
        
        else if(us.open() < 22 && dr.open() < us.open()){
            System.out.print("Userの勝ちです");
        }
        
        else if(21<us.open() && dr.open() < 22){
            System.out.print("Dealerの勝ちです");
        }
        
        else if(21<dr.open() && us.open() < 22){
            System.out.print("Userの勝ちです");
        }
        else{
            System.out.print("引き分けです");
        }
    }
}
