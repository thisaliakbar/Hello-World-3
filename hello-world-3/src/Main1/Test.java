/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main1;

import java.util.Scanner;

/**
 *
 * @author usER
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda \t\t: ");
        String name = scan.nextLine();
        System.out.print("Masukkan Usia Anda \t\t: ");
        String age = scan.nextLine();
        System.out.print("Masukkan Tempat Lahir Anda  \t: ");
        String placeBorn = scan.nextLine();
        System.out.print("Masukkan Tanggal Lahir Anda \t: ");
        String born = scan.nextLine();
        
        System.out.println("Nama : " + name);
        System.out.println("Usia : " + age);
        System.out.println("Tempat Lahir : " + placeBorn);
        System.out.println("Tanggal Lahir : " + born);
        
        
    }
}
