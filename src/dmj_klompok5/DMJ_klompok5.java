/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dmj_klompok5;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class DMJ_klompok5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner m =new Scanner(System.in);
       int a,b,c;
        System.out.println("=================");
        System.out.println("Kalkulator Mini");
        System.out.println("=================");
        System.out.println("Masukkan nilai a: ");
        a = m.nextInt();
        System.out.println("Masukkan nilai b: ");
        b = m.nextInt();
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan "+a+" + "+b+" = ");
        System.out.println(a+b);
        System.out.println("Hasil Pengurangan "+a+" - "+b+" = ");
        System.out.println(a-b);
        System.out.println("Hasil Pembagian "+a+" : "+b+" = ");
        System.out.println(a/b);
        System.out.println("Hasil Perkalian "+a+" * "+b+" = ");
        System.out.println(a*b);
        System.out.println("Modulus "+a+" dan "+b+" = ");
        System.out.println(a%b);
        System.out.println("^_________^ by Emon");
    }
    
}
