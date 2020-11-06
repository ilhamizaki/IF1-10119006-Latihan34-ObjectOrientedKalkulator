/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *
 * @author
 * NAMA     : Ilham zaki
 * Kelas    : IF 1
 * NIM      : 10119006
 * Deskripsi Program : class Main Kalkulator
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        Kalkulator number = new Kalkulator();

        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        number.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        number.value2 = scanner.nextDouble();
        
        System.out.println();
        
        System.out.println("Hasil Pertambahan : " + number.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + number.kurangBilangan());
        System.out.println("Hasil Perkalian : " + number.kaliBilangan());
        System.out.println("Hasil Pembagian : " + (df.format(number.bagiBilangan())));
        System.out.println("Hasil Sisa : " + number.sisaBilangan());
    }
}
