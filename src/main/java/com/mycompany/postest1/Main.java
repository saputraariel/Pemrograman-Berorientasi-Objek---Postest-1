package com.mycompany.postest1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> alatMusik = new ArrayList<>();

        alatMusik.add("Angklung - Jawa Barat");
        alatMusik.add("Gamelan - Jawa Tengah");
        alatMusik.add("Sasando - Nusa Tenggara Timur");
        alatMusik.add("Tifa - Papua");
        alatMusik.add("Kolintang - Sulawesi Utara");
        alatMusik.add("Kendang - Jawa");

        int pilihan;

        do {
            System.out.println("=++ Rissy Music Studio ++=");
            System.out.println("1. Tambah Alat Musik");
            System.out.println("2. Lihat Alat Musik");
            System.out.println("3. Update Alat Musik");
            System.out.println("4. Hapus Alat Musik");
            System.out.println("5. Keluar");
            System.out.print("Masukan Pilihan =  ");
            pilihan = input.nextInt();
            input.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan nama alat musik: ");
                String nama = input.nextLine();
                System.out.print("Masukkan daerah asal: ");
                String daerah = input.nextLine();

                alatMusik.add(nama + " - " + daerah);
                System.out.println("==+ Alat musik berhasil ditambahkan! +==");
            } else if (pilihan == 2) {
                System.out.println("Daftar Alat Musik Tradisional:");
                if (alatMusik.isEmpty()) {
                    System.out.println("(Belum ada data)");
                } else {
                    for (int i = 0; i < alatMusik.size(); i++) {
                        System.out.println((i + 1) + ". " + alatMusik.get(i));
                    }
                }
                System.out.println("== Data berhasil ditampilkan! ==");
            } else if (pilihan == 3) {
                System.out.println("\nPilih nomor alat musik yang ingin diubah:");
                for (int i = 0; i < alatMusik.size(); i++) {
                    System.out.println((i + 1) + ". " + alatMusik.get(i));
                }
                System.out.print("Nomor: ");
                int ubahIndex = input.nextInt() - 1;
                input.nextLine(); // buffer
                if (ubahIndex >= 0 && ubahIndex < alatMusik.size()) {
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan daerah baru: ");
                    String daerahBaru = input.nextLine();
                    alatMusik.set(ubahIndex, namaBaru + " - " + daerahBaru);
                    System.out.println("== Alat musik berhasil diubah! ==");
                } else {
                    System.out.println("Nomor tidak valid!");
                }
            } else if (pilihan == 4) {
                System.out.println("\nPilih nomor alat musik yang ingin dihapus:");
                for (int i = 0; i < alatMusik.size(); i++) {
                    System.out.println((i + 1) + ". " + alatMusik.get(i));
                }
                System.out.print("Nomor: ");
                int hapusIndex = input.nextInt() - 1;
                if (hapusIndex >= 0 && hapusIndex < alatMusik.size()) {
                    alatMusik.remove(hapusIndex);
                    System.out.println("✅ Alat musik berhasil dihapus!");
                } else {
                    System.out.println("Nomor tidak valid!");
                }
            } else if (pilihan == 5) {
                System.out.println("==+ Anda Berhasil Log out +==");
            } else {
                System.out.println("Pilihan tidak valid, coba lagi!");
            }

        } while (pilihan != 5);

        input.close();
    }
}
