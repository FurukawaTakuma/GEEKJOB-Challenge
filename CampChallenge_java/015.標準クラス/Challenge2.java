/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.util.Calendar;

/**
 *
 * @author guest1Day
 */
public class Challenge2 {

    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.print(c.get(Calendar.YEAR) + "年");
        System.out.print(c.get(Calendar.MONTH) + 1 +  "月");
        System.out.print(c.get(Calendar.DAY_OF_MONTH) + "日");
        System.out.print(c.get(Calendar.HOUR) + "時");
        System.out.print(c.get(Calendar.MINUTE) + "分");
        System.out.print(c.get(Calendar.SECOND) + "秒");
    }
}
