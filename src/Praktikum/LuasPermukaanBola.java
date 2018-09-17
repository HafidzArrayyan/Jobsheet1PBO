/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class LuasPermukaanBola {
    public static void main(String[] args) {
        System.out.println(">>>Menghitung Luas Permukaan Bola<<<");
        Scanner masukan=new Scanner(System.in);
        double phi=3.14;
        System.out.print("Masukkan jari-jari bola : ");
        double jr=masukan.nextInt();
        double hasil=4*phi*jr*jr;
        System.out.println("Luas Permukaan bola denga jari-jari "+jr+" = "+hasil);
        
    }
}
