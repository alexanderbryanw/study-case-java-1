package id.web.alexanderbryanw;

import java.util.Scanner;

public class UTS_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int ulang = 0;
		while (ulang != 2 && ulang != 3) {
			System.out.println("=====Selamat Datang di Program Tebak Angka=====\n");
			System.out.print("Angka	: ");
			int angka = scan.nextInt();
			System.out.println("=================================================");
			System.out.println("Tentukan pilihan dari	:");
			System.out.println("1. Menentukan bilangan Ganjil atau Genap");
			System.out.println("2. Menentukan bilangan Prima atau Komposit");
			System.out.println();
			System.out.print("Pilihan	: ");
			int pilihan = scan.nextInt();
			if (pilihan == 1) {
				if (angka % 2 == 0) {
					System.out.println(angka + " adalah bilangan genap");
				} else
					System.out.println(angka + " adalah bilangan ganjil");
			} else if (pilihan == 2) {
				int s = angka;
				boolean isPrima = true;
				if (s == 1)
					isPrima = false;
				for (int bagi = 2; bagi <= s; bagi++) {
					if (s % bagi == 0) {
						isPrima = false;
						break;
					}
				}
				if (isPrima == false) {
					System.out.println(angka + " merupakan bilangan Komposit");
				} else
					System.out.println(angka + " merupakan bilangan Prima");
			} else
				System.out.println("Input Salah");
			ulang = 3;
			while (ulang != 1 && ulang != 2) {
				System.out.print("Apakah anda ingin mengulang program? (Y/N) : ");
				String lagi = scan.next();
				System.out.println();
				if (lagi.equalsIgnoreCase("Y")) {
					ulang = 1;
				} else if (lagi.equalsIgnoreCase("N")) {
					ulang = 2;
					System.out.println("Terima kasih telah menggunakan program ini");
				} else
					ulang = 3;
			}
		}
	}

}
