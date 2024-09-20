/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pertemuan4;

/**
 *
 * @author 23106
 */
public class TampilBangunRuang {

    public static void main(String[] args) {
    Balok balok = new Balok (15,10,5);
     Kubus kubus = new Kubus(10);

        System.out.println("Balok:");
        System.out.println("Volume: " + balok.hitungVolume());
        System.out.println("Luas Permukaan: " + balok.hitungLuasPermukaan());
        
        System.out.println(); 

        System.out.println("\nKubus:");
        System.out.println("Volume: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan: " + kubus.hitungLuasPermukaan());
    }
}

