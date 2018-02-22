/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author guest1Day
 */
public class Challenge1 {

    public static void main(String[] args) {
        Date d = new Date((47 * 365 * 24 * 60 * 60 * 1000L)
                         -(     354 * 24 * 60 * 60 * 1000L)
                         -(            9 * 60 * 60 * 1000L));
        

        System.out.println(d);
        System.out.println(d.getTime());

        
        
        Date day = new Date((47 * 365 * 24 * 60 * 60 * 1000L));
        System.out.println(day);
        
    }
}
