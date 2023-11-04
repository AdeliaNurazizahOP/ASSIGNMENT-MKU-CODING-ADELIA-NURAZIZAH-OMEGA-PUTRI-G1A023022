import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        //Fungsi perintah ini untuk meminta pengguna memasukan bilangan
        System.out.print("Masukkan sebuah bilangan bulat: ");
        number = scanner.nextInt();

        //code program ini berfungsi untuk mengecek bilangan yang dimasukkan sebelumnya genap atau ganjil
        while (number != 0) {
            if (number > 0) {
                System.out.println("Bilangan positif.");
            } else {
                System.out.println("Bilangan negatif.");
            }

            // Meminta pengguna untuk memasukkan bilangan selanjutnya atau 0 untuk keluar
            System.out.print("Masukkan sebuah bilangan bulat (atau 0 untuk keluar): ");
            number = scanner.nextInt();
        }

        System.out.println("Program selesai.");
        scanner.close();
    }
}