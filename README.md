# ASSIGNMENT-MKU-CODING-ADELIA-NURAZIZAH-OMEGA-PUTRI-G1A023022

# Soal No 1
1. Perulangan for yang menjelaskan menggunakan int dan variabel i adalah 1. Jika i kurang dari 100. maka variabel i ditambah.
 ```sh
   for (int i = 1; i <= 100; i++)
   ```
2. Jika variabel i kurang dari 9 maka akan memunculkan output angka yaitu 1, 2, 3, 4, 5, 6, 7, 8, 9.
```sh
   if (i <= 9) {
  System.out.println(i);
}
   ```

3. Jika lebih dari 9 maka akan muncul output Adelia Nurazizah Omega Putri sampai ke 100
```sh
   else {
   System.out.println("Adelia Nurazizah Omega Putri");
}
   ```
4. Berikut adalah hasil output dari program

   ![image](https://github.com/AdeliaNurazizahOP/ASSIGNMENT-MKU-CODING-ADELIA-NURAZIZAH-OMEGA-PUTRI-G1A023022/assets/147450205/80737c18-cfe9-49eb-a9c6-19fbc37553fa)


# Soal No 2
1. Membaca input dari pengguna dan penamaan variabel yaitu number menggunakan type data integer
```sh
   Scanner scanner = new Scanner(System.in);
int number;
   ```
2. Menampilkan ( Masukkan sebuah bilangan bulat: ) dan menginput variabel number sesuai dengan pengguna input
```sh
   System.out.print("Masukkan sebuah bilangan bulat: ");
number = scanner.nextInt();
   ```
3. Code ini meminta pengguna memasukkan bilangan bulat, mencetak apakah bilangan tersebut positif atau negatif, dan terus mengulang proses tersebut sampai pengguna memasukkan 0, pada saat itu program akan berhenti dan mencetak "Program selesai."
```sh
   while (number != 0) {
            if (number > 0) {
                System.out.println("Bilangan positif.");
            } else {
                System.out.println("Bilangan negatif.");
            }
            System.out.print("Masukkan sebuah bilangan bulat (atau 0 untuk keluar): ");
            number = scanner.nextInt();
}
   ```

4. Berikut hasil output dari program yang dijalankan

   ![image](https://github.com/AdeliaNurazizahOP/ASSIGNMENT-MKU-CODING-ADELIA-NURAZIZAH-OMEGA-PUTRI-G1A023022/assets/147450205/8ab830e8-a9cb-4bb5-849b-5e41107133eb)


## Soal No 3
1. Kode ini membuat objek Scanner untuk menerima input dari pengguna melalui konsol. Pengguna diminta memasukkan tanggal lahir dalam format "hari bulan" (contoh: 15 3 untuk tanggal 15 Maret). Input tersebut disimpan dalam variabel day dan month. Selanjutnya, program memanggil fungsi determineZodiacSign(day, month) untuk menentukan zodiak berdasarkan input pengguna. Hasilnya disimpan dalam variabel zodiacSign untuk digunakan selanjutnya.
```sh
   Scanner scanner = new Scanner(System.in);
        int day, month;

        System.out.print("Masukkan tanggal lahir (contoh: 15 3 untuk tanggal 15 Maret): ");
        day = scanner.nextInt();
        month = scanner.nextInt();

        String zodiacSign = determineZodiacSign(day, month);
   ```
2. Kode ini memeriksa hasil dari fungsi determineZodiacSign(day, month). Jika hasilnya tidak null (tanggal lahir valid), program mencetak zodiak pengguna. Jika hasilnya null (tanggal lahir tidak valid), program mencetak pesan kesalahan.
```sh
   if (zodiacSign != null) {
            System.out.println("Zodiak Anda adalah: " + zodiacSign);
        } else {
            System.out.println("Tanggal lahir tidak valid.");
        }

        scanner.close();
   ```
3. Kode ini mendefinisikan dua array: zodiacSigns berisi nama-nama zodiak, dan endDayOfSigns berisi tanggal terakhir dari masing-masing zodiak.
```sh
    String[] zodiacSigns = {
            "Capricorn", "Aquarius", "Pisces", "Aries", "Taurus", "Gemini",
            "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius"
        };

        int[] endDayOfSigns = { 20, 19, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21 };
   ```
4. Kode ini menentukan zodiak berdasarkan input bulan dan tanggal lahir pengguna. Pertama, kode memeriksa apakah input bulan dan tanggal berada dalam rentang yang valid (1-12 untuk bulan, 1-31 untuk tanggal). Jika valid, kode memeriksa apakah tanggal lahir masih dalam rentang zodiak bulan tersebut. Jika ya, zodiak tersebut dikembalikan. Jika tidak, zodiak bulan berikutnya dikembalikan. Jika input tidak valid, fungsi mengembalikan null.
```sh
    if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (day <= endDayOfSigns[month - 1]) {
                return zodiacSigns[month - 1];
            } else {
                return zodiacSigns[month % 12];
            }
        } else {
            return null;
        }
   ```
5. Berikut merupakan output dari program yang dijalankan

   ![image](https://github.com/AdeliaNurazizahOP/ASSIGNMENT-MKU-CODING-ADELIA-NURAZIZAH-OMEGA-PUTRI-G1A023022/assets/147450205/daab69c5-f870-4c72-9801-3581e03331ca)

## Soal No 4
1. Kode tersebut membuat sebuah array numbers yang berisi bilangan bulat dari 1 hingga 10. Selanjutnya, menggunakan sebuah loop for, program mencetak nilai-nilai dalam array tersebut satu per satu ke layar. Hasilnya adalah mencetak bilangan 1 hingga 10 ke layar.
```sh
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Nilai dalam variabel array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
   ```

2. Berikut merupakan Output dari program yang dijalankan

   ![image](https://github.com/AdeliaNurazizahOP/ASSIGNMENT-MKU-CODING-ADELIA-NURAZIZAH-OMEGA-PUTRI-G1A023022/assets/147450205/bfd768df-d1f7-4a5f-bfee-ea3f88eb4fbf)
