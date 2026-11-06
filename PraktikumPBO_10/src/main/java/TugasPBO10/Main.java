/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPBO10;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Pembayaran earphone = new Elektronik();
        double hargaEarphone = 300000;
        double pajakEarphone = earphone.hitungPajak(hargaEarphone);
        double hargaTotal = hargaEarphone + pajakEarphone;
        
        System.out.println("Harga Earphone :" + hargaEarphone);
        System.out.println("Pajak Elektronik (10%) : " + pajakEarphone);
        System.out.println("Total Harga : " + hargaTotal);
        System.out.println("---------------------------------------");
        
        Pembayaran ramen = new Makanan();
        double hargaRamen = 40000;
        double pajakRamen = ramen.hitungPajak(hargaRamen);
        double total = hargaRamen + pajakRamen;
        
        System.out.println("Harga Burger :" + hargaRamen);
        System.out.println("Pajak Makanan (5%) : " + pajakRamen);
        System.out.println("Total Harga : " + total);
    }
}
