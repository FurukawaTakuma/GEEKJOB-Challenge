/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author guest1Day
 */
public class NewClass2 {

    public static void main(String[] args) {
        
        Keisyo k = new Keisyo();
        k.Print();
        k.setHuman("sato", 20);
        k.Print();
        k.Clear();
        k.Print();
        
        
        
        
        
        
        // Humanクラスのインスタンス生成
        Human hito = new Human();
        Keisyo kei = new Keisyo();
        // 人インスタンスのageフィールドへ年齢設定
        hito.age = 40;
        // 人インスタンスのsetHumanメソッドを利用
        hito.setHuman("添田亮司", 34);
        
        //hito.setHuman(kei.name,kei.age);
        
        kei.Clear();
        hito.Print();
    }
}

class Human {

    // フィールドの宣言
    public String name = "";
    public int age = 0;

    // メソッドの宣言
    public void setHuman(String n, int a) {
        // 引数をフィールドへ設定
        this.name = n;
        this.age = a;
    }
    public void Print(){

    System.out.print(name+age);
}
    
}

class Keisyo extends Human{
    public void Clear(){
       
       name = "";
       age = 0;
}
}
