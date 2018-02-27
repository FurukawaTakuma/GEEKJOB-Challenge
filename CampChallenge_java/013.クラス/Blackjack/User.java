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
public class User extends Human {



    public void setCard(ArrayList<Integer> list) {
        myCard = list;
        //myCard.add(dealuse.get(0));
        //System.out.print(myCard);

        //ArrayList<Integer> hituse = new ArrayList<Integer>();
        //hituse = hit();
        //myCard.add(hituse.get(0));
    }

    public boolean checkSum() {
        int total = open();
        if (15 < total) {
            return true;
        } else {
            return false;
        }
    }

    public int open() {
        int total = 0;
        for (int i = 0; i < myCard.size(); i++) {
            if (10 < myCard.get(i)) {
                total += 10;
            } else {
                total += myCard.get(i);
            }
        }
        return total;
    }
}
