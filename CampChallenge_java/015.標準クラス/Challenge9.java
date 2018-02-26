/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;

import java.io.*;
import java.io.FileReader;
import java.io.BufferedReader;

/**
 *
 * @author guest1Day
 */
public class Challenge9 {

    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:\\Users\\guest1Day\\Documents\\NetBeansProjects\\Challenge\\src\\java\\標準クラス\\自己紹介.txt");
            BufferedReader br = new BufferedReader(fr);
            String str;
            while ((str = br.readLine()) != null) {
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
