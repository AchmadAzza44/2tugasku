import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah bilangan bulat: ");
        int bilangan = input.nextInt();

        while (bilangan != 0) {
            if (bilangan % 2 == 0) {
                System.out.println(bilangan + " adalah bilangan genap.");
            } else {
                System.out.println(bilangan + " adalah bilangan ganjil.");
            }

            System.out.print("Masukkan bilangan lain (0 untuk keluar): ");
            bilangan = input.nextInt();
        }

        System.out.println("Terima kasih! Program selesai.");
    }
}
