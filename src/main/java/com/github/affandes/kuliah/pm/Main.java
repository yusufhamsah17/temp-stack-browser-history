package com.github.affandes.kuliah.pm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tulis kode disini
Scanner scanner = new Scanner(System.in);
        boolean lanjut = true;
        while (lanjut) {
            System.out.println("=== Kalkulator Sederhana ===");
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan (+)");
            System.out.println("2. Pengurangan (-)");
            System.out.println("3. Perkalian (*)");
            System.out.println("4. Pembagian (/)");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan (1-5): ");
            
            int pilihan = scanner.nextInt();
            
            if (pilihan == 5) {
                lanjut = false;
                System.out.println("Terima kasih telah menggunakan kalkulator!");
                break;
            }
            
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            double hasil = 0;
            boolean valid = true;
            
            switch (pilihan) {
                case 1:
                    hasil = angka1 + angka2;
                    System.out.println("Hasil: " + angka1 + " + " + angka2 + " = " + hasil);
                    break;
                case 2:
                    hasil = angka1 - angka2;
                    System.out.println("Hasil: " + angka1 + " - " + angka2 + " = " + hasil);
                    break;
                case 3:
                    hasil = angka1 * angka2;
                    System.out.println("Hasil: " + angka1 + " * " + angka2 + " = " + hasil);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                        System.out.println("Hasil: " + angka1 + " / " + angka2 + " = " + hasil);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    valid = false;
                    break;
                      if (valid) {
                System.out.println(); // Baris kosong untuk pemisah
            }
        }
        
        scanner.close();
    }
}

            }
    
