/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.io.*;


/**
 *
 * @author guest1Day
 */
public class Challenge8 {

    public static void main(String[] args) {
        try {
            File fo = new File("C:\\Users\\guest1Day\\Documents\\NetBeansProjects\\Challenge\\src\\java\\標準クラス\\自己紹介.txt");
            FileWriter fw = new FileWriter(fo);
            fw.write("私の名前は古川　拓馬です。趣味は釣りです。よろしくお願いします。");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
