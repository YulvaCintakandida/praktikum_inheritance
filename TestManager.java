/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan4;

import Percobaan4.Manager;

/**
 *
 * @author HP 14S
 */
public class TestManager {

    public static void main(String[] args) {
    Manager Utama = new Manager("John",5000000,"Financial");
    System.out.println("Name:"+ Utama.GetName());
    System.out.println("Salary:"+ Utama.GetSalary());
    System.out.println("Department:"+ Utama.GetDept());
    
    Utama = new Manager("Michael","Accounting");
    System.out.println("Name:"+ Utama.GetName());
    System.out.println("Salary:"+ Utama.GetSalary());
    System.out.println("Department:"+ Utama.GetDept());

    }
}

