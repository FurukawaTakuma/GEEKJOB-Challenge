/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class Challenge4 {
    public static void main (String[] args){
        Date d1 = new Date(115,0,1,0,0,0);
        Date d2 = new Date(115,11,31,23,59,59);
        
        System.out.println(d2.getTime()-d1.getTime());
        //31535999000
        //System.out.println(d1.getTime());
        //System.out.println(d2.getTime());
        System.out.println(d1);
        System.out.println(d2);
    }
    
}
