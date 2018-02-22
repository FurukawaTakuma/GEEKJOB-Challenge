/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

/**
 *
 * @author guest1Day
 */
public class Challenge6 {
    public static void main (String[] args){
        String mailaddress = "hkmn1717@gmail.com";
        System.out.print(mailaddress.substring(mailaddress.indexOf("@")));
        //indexOfで@の位置を取得してsubstringで取得した文字以降を取得
    }
    
}
