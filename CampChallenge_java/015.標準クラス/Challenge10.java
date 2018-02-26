/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 標準クラス;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Scanner;
/**
 *
 * @author guest1Day
 */
public class Challenge10 {
    public static void main (String[] args){
        try {
        File fo = new File("C:\\Users\\guest1Day\\Documents\\NetBeansProjects\\Challenge\\src\\java\\標準クラス\\log.txt");
        Calendar start_c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String start = sdf.format(start_c.getTime());
        FileWriter fw = new FileWriter(fo);
        fw.write(start+" 　");
        fw.close();
        
        File fo2 = new File("C:\\Users\\guest1Day\\Documents\\NetBeansProjects\\Challenge\\src\\java\\標準クラス\\log.txt");
        
        Scanner scan = new Scanner(System.in);
        
        
        int str = scan.nextInt();
        int str2 = scan.nextInt();
        FileWriter fw2 = new FileWriter(fo2,true);
        System.out.println(Math.max(str,str2));
        fw2.write("入力した数字の大きい方は"+String.valueOf(Math.max(str,str2))+" 　");
        fw2.close();
        
        
        File fo3 = new File("C:\\Users\\guest1Day\\Documents\\NetBeansProjects\\Challenge\\src\\java\\標準クラス\\log.txt");
        FileWriter fw3 = new FileWriter(fo3,true);
        Calendar end_c = Calendar.getInstance();
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String end = sdf2.format(end_c.getTime());
        System.out.print(end);
        fw3.write(end);
        fw3.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
