import java.util.Scanner ;
public class Nomor3 {
	public static void main (String [] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Masukkan tanggal Lahir  ");
		int tanggal  =input.nextInt();
		
		System.out.print("Masukkan bulan Lahir  ");
		int bulan =input.nextInt();
		
		if ((bulan == 3 && tanggal >= 21) ||(bulan == 4 && tanggal <= 21)) {
			System.out.println("Zodiak Anda Adalah Aries");}
		else if ((bulan == 4 && tanggal >= 20) ||(bulan == 5 && tanggal <= 20)) {
			System.out.println("Zodiak Anda Adalah Taurus");}
		else if ((bulan == 5 && tanggal >= 20) ||(bulan == 5 && tanggal <= 20)) {
			System.out.println("Zodiak Anda Adalah Aries");}
		else if ((bulan == 5 && tanggal >= 21) ||(bulan == 6 && tanggal <= 21)) {
			System.out.println("Zodiak Anda Adalah Gemini");}
		else if ((bulan == 6 && tanggal >= 21) ||(bulan == 7 && tanggal <= 22)) {
			System.out.println("Zodiak Anda Adalah Cancer");}
		else if ((bulan == 7 && tanggal >= 23) ||(bulan == 8 && tanggal <= 22)) {
			System.out.println("Zodiak Anda Adalah Leo");}
		else if ((bulan == 8 && tanggal >= 23) ||(bulan == 9 && tanggal <= 22)) {
			System.out.println("Zodiak Anda Adalah Virgo");}
		else if ((bulan == 9 && tanggal >= 23) ||(bulan == 10 && tanggal <= 22)) {
			System.out.println("Zodiak Anda Adalah Libra");}
		else if ((bulan == 10 && tanggal >= 23) ||(bulan == 11 && tanggal <= 21)) {
			System.out.println("Zodiak Anda Adalah Scorpio");}
		else if ((bulan == 11 && tanggal >= 22) ||(bulan == 12 && tanggal <= 21)) {
			System.out.println("Zodiak Anda Adalah Sagitarius");}
		else if ((bulan == 12 && tanggal >= 22) ||(bulan == 1 && tanggal <= 19)) {
			System.out.println("Zodiak Anda Adalah Capricorn");}
		else if ((bulan == 1 && tanggal >= 20) ||(bulan == 2 && tanggal <= 18)) {
			System.out.println("Zodiak Anda Adalah Aquarius");}
		else if ((bulan == 2 && tanggal >= 19) ||(bulan == 3 && tanggal <= 20)) {
			System.out.println("Zodiak Anda Adalah Pisces");}
		else {
			System.out.println("Tanggal yang dimasukkan tidak valid");
		}
		
	}

	
}
