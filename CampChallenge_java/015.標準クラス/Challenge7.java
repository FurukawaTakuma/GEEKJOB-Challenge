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
public class Challenge7 {

    public static void main(String[] args) {
        String mozi = "きょUはぴIえIちぴIのくみこみかんすUのがくしゅUをしてIます";
        mozi = mozi.replace("U", "う");
        mozi = mozi.replace("I", "い");
        System.out.print(mozi);
    }
}
