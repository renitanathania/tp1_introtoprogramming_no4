import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] argh) {
        Scanner mainScanner = new Scanner(System.in);

        //header
        System.out.println("Selamat Datang Di Program Ramalan Cupu");
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        System.out.println();

        // Input personal data
        System.out.println("Data Anda: ");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Anda: ");
        String nama = mainScanner.next();
        System.out.print("Masukan Umur Anda : ");
        Integer umurAnda = mainScanner.nextInt();
        System.out.println();


        // Input partner data
        System.out.println("Data Pasangan Anda");
        System.out.println("❤❤❤❤❤❤❤❤❤");
        System.out.print("Masukan Nama Pasangan Anda: ");
        String namaPasangan = mainScanner.next();
        System.out.print("Masukan Umur Anda : ");
        Integer umurPasangan = mainScanner.nextInt();
        System.out.println();

        //output data by system
        System.out.println(nama + "[" + umurAnda + "] tahun");
        System.out.println();
        System.out.println("  ❤❤❤    ❤❤❤    ");
        System.out.println(" ❤❤❤❤  ❤❤❤❤   ");
        System.out.println("❤❤❤❤❤❤❤❤❤❤  ");
        System.out.println("  ❤❤❤❤❤❤❤❤     ");
        System.out.println("    ❤❤❤❤❤❤        ");
        System.out.println("       ❤❤❤❤          ");
        System.out.println("        ❤❤❤           ");
        System.out.println("          ❤              ");
        System.out.println();
        System.out.println(namaPasangan + " [" + umurPasangan + "] tahun");
        System.out.println();

        //result
        System.out.println("tekan ENTER untuk melihat hasil ramalan... ");
        mainScanner.nextLine();
        double cocok = ThreadLocalRandom.current().nextInt(50, 100 + 1) / 1.1;
        System.out.println("Kecocokan anda dengan pasangan anda adalah : " + Math.round(cocok * 100.0) / 100.0 + "%");
    }
}
