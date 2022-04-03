package id.web.alexanderbryanw;

import java.util.Scanner;

public class UTS_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int harga = 0, biayasewa, biayaextra;
		float diskon, totalbiaya;
		System.out.println("*****HOTEL YRIA*****");
		System.out.println("**********************");
		System.out.print("Nama penyewa				= ");
		String nama = scan.next();
		System.out.print("Kode kamar[A/B/C]			= ");
		String kodekamar = scan.next();
		System.out.print("Kode kelas[1/2]				= ");
		int kodekelas = scan.nextInt();
		System.out.print("Extra bed					= ");
		int extra = scan.nextInt();
		System.out.print("Lama menginap (hari)			= ");
		int lamainap = scan.nextInt();
		System.out.print("Metode pembayaran			= ");
		String metodebayar = scan.next();
		System.out.println("**********************");
		System.out.println("HOTEL YRIA");
		System.out.println("**********************");
		System.out.println("Nama penyewa			= " + nama);
		NamaKamarnya(kodekamar);
		TipeKamarnya(kodekelas);
		System.out.println("Lama menginap			= " + lamainap + " hari");
		biayasewa = BiayaKamarnya(kodekamar, kodekelas, lamainap);
		System.out.println("Rp." + biayasewa);
		biayaextra = BiayaExtranya(extra, lamainap);
		System.out.println("Rp." + biayaextra);
		diskon = Diskonnya(biayasewa, biayaextra, metodebayar);
		System.out.printf("Rp.%.2f\n", diskon);
		totalbiaya = Totalnya(biayasewa, biayaextra, diskon);
		System.out.printf("Rp.%.2f\n", totalbiaya);
		System.out.println("**********************");
	}

	public static void NamaKamarnya(String kodekamar) {
		System.out.print("Nama kamar			= ");
		if (kodekamar.equalsIgnoreCase("A")) {
			System.out.println("Standard room");
		} else if (kodekamar.equalsIgnoreCase("B")) {
			System.out.println("Deluxe room");
		} else if (kodekamar.equalsIgnoreCase("C")) {
			System.out.println("Suit room");
		}
	}

	public static void TipeKamarnya(int kodekelas) {
		System.out.print("Kategori				= ");
		if (kodekelas == 1) {
			System.out.println("Single Bed");
		} else if (kodekelas == 2)
			System.out.println("Twin Bed");
	}

	public static int BiayaKamarnya(String kodekamar, int kodekelas, int lamainap) {
		int harga = 0, biayasewa;
		System.out.print("Biaya sewa				= ");
		if (kodekamar.equalsIgnoreCase("A")) {
			if (kodekelas == 1) {
				harga = 250000;
			} else if (kodekelas == 2) {
				harga = 300000;
			}
		} else if (kodekamar.equalsIgnoreCase("B")) {
			if (kodekelas == 1) {
				harga = 400000;
			} else if (kodekelas == 2) {
				harga = 500000;
			}
		} else if (kodekamar.equalsIgnoreCase("C")) {
			if (kodekelas == 1) {
				harga = 700000;
			} else if (kodekelas == 2) {
				harga = 850000;
			}
		}
		biayasewa = harga * lamainap;
		return biayasewa;
	}

	public static int BiayaExtranya(int extra, int lamainap) {
		int biayaextra;
		System.out.print("Biaya extra bed			= ");
		biayaextra = extra * lamainap * 100000;
		return biayaextra;
	}

	public static float Diskonnya(int biayasewa, int biayaextra, String metodebayar) {
		float diskon;
		System.out.print("Diskon				= ");
		if (metodebayar.equalsIgnoreCase("Credit")) {
			diskon = (float) 0.05 * (biayasewa + biayaextra);
			return diskon;
		} else
			diskon = 0;
		return diskon;
	}

	public static float Totalnya(int biayasewa, int biayaextra, float diskon) {
		float totalbiaya;
		System.out.print("Total biaya sewa		= ");
		totalbiaya = (biayasewa + biayaextra) - diskon;
		return totalbiaya;
	}

}
