/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan7;

/**
 *
 * @author HP 14S
 */
class Bapak{
    int a = 1;
    int b = 1;
    
    void show_variabel(){
        System.out.println("Nilai a="+ a);
        System.out.println("Nilai b="+ b);
    }
}

class Anak extends Bapak{
    int c;
    void show_variabel(){
        super.show_variabel();
        System.out.println("Nilai c="+ c);
    }
}

public class InheritExample {

    public static void main(String[] args) {
       Bapak objectBapak = new Bapak();
       Anak objectAnak = new Anak();
       
       System.out.println("Object Bapak (Superclass) :");
       
       objectBapak. show_variabel();
       objectAnak.c=5;
       System.out.println("Object Anak (Superclass dari Bapak):");
       objectAnak.show_variabel(); 
    }
  
}
