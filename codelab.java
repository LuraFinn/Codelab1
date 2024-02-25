import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class codelab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = jenisKelaminInput.equalsIgnoreCase("L") ? "Laki-laki" : "Perempuan";

        System.out.println("Masukkan tanggal lahir (yyyy-mm-dd): ");
        int tahunLahir = scanner.nextInt();
        int bulanLahir = scanner.nextInt();
        int hariLahir = scanner.nextInt();
        LocalDate tanggalLahir = LocalDate.of(tahunLahir, bulanLahir, hariLahir);

        LocalDate sekarang = LocalDate.now();
        int umurtahun = sekarang.minusYears(tanggalLahir.getYear()).getYear();
        int umurBulan = sekarang.minusMonths(tanggalLahir.getMonthValue()).getMonthValue();

        System.out.println("\nData diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd MMMM yyyy")));
        System.out.println("Umur: " + umurtahun + " tahun, " + umurBulan + " bulan");

        scanner.close();
    }
}
