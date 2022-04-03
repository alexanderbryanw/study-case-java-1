package id.web.alexanderbryanw;

import java.util.Scanner;

public class UTS_3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("----------------------Welcome to UBU by BECEA---------------------");
		System.out.println("------------------------------------------------------------------------\n");
		System.out.print("Jumlah uang			: ");
		int jumlahuang = scan.nextInt();
		System.out.print("Lama menabung (tahun)	: ");
		int lamanabung = scan.nextInt();
		float bunga[] = new float[lamanabung];
		float bungabank[] = new float[lamanabung];
		float tabungan[] = new float[lamanabung];
		System.out.println();
		System.out.println("================================================================");
		System.out.printf("%-14s %-20s %-23s %-23s\n", "Tahun ke-", "Suku Bunga", "Bunga Bank", "Total Tabungan");
		System.out.println("================================================================");
		bunga[0] = 6;
		bungabank[0] = (bunga[0] / 100) * jumlahuang;
		tabungan[0] = jumlahuang + bungabank[0];
		float totalbunga = bungabank[0];
		int urut = 1;
		System.out.printf("%6d %20.2f%% %23.2f %24.2f\n", urut, bunga[0], (bungabank[0]), tabungan[0]);
		for (int i = 1; i < lamanabung; i++) {
			urut = i + 1;
			bunga[i] = (float) (bunga[i - 1] + 1.2);
			bungabank[i] = (bunga[i] / 100) * tabungan[i - 1];
			tabungan[i] = tabungan[i - 1] + bungabank[i];
			totalbunga = bungabank[i] + totalbunga;
			System.out.printf("%6d %20.2f%% %23.2f %24.2f\n", urut, bunga[i], (bungabank[i]), tabungan[i]);
		}
		System.out.println("================================================================\n");
		System.out.printf("Total bunga bank adalah %.2f\n", totalbunga);
		System.out.println("Terima kasih telah menggunakan tabungan UBU!");

	}

}
