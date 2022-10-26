/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perrcobaan5;

/**
 *
 * @author HP 14S
 */
public class Moodyobject {
    protected String getMood(){
        return "moody";
    }
    public void speak(){
        System.out.println("I am : "+getMood());
    }
}
 class Sadobject extends Moodyobject{
   
    protected String getSad(){
        return "sad";
    }
    public void cry(){
        System.out.println("Hoo hoo : "+ getSad());
 }
}
 class HappyObject extends Moodyobject{
    
    protected String getHappy(){
        return"happy";
    }
    public void laugh(){
        System.out.println("Hahaha : " + getHappy());
 }
}
 class MoodyTest {
public static void main(String[] args) {
        Moodyobject m = new Moodyobject();
        Sadobject Sad = new Sadobject();
        HappyObject Happy = new HappyObject();
        
        m.speak();
        Sad.cry();
        Happy.laugh();
    }
}   

