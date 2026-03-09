
import java.util.Scanner;

public class MataKuliahDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int sks, jumlahJam, data;
        System.out.println("Jumlah data yang ingin di input: ");
        data = sc.nextInt();
        sc.nextLine();

        MataKuliah7[] arrayOfMatakuliah7 = new MataKuliah7[data];

        for (int i = 0; i < arrayOfMatakuliah7.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("-------------------------------------------");
            
            arrayOfMatakuliah7[i] = new MataKuliah7(kode, nama, sks, jumlahJam);
        }
        
        System.out.print("Tambah data Mata Kuliah (ya/tidak): ");
        String tambah = sc.nextLine();

        if (tambah.equalsIgnoreCase("ya")) {
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------------");
            arrayOfMatakuliah7[0].tambahData(kode, nama, sks, jumlahJam);
        }
        
        for (int i = 0; i < arrayOfMatakuliah7.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrayOfMatakuliah7[i].cetakInfo();
        }
        sc.close();
    }
}
