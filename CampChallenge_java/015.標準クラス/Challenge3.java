/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.security.Timestamp;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 *
 * @author guest1Day
 */
public class Challenge3 {

    public static void main(String[] args) {
        Date d = new Date(116, 10, 4, 10, 0, 0);

        System.out.println(d.getTime());
        //14782212
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String day = sdf.format(d);
        System.out.print(day);

    }

}
