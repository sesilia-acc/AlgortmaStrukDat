
import java.util.Scanner;

public class MataKuliahDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MataKuliah7[] arrayOfMatakuliah7 = new MataKuliah7[3];
        String kode, nama, dummy;
        int sks, jumlahJam;

        for (int i = 0; i < arrayOfMatakuliah7.length; i++) {
            System.out.println("Masukkan data Mata Kuliah ke-" + (i + 1));
            System.out.print("Kode        : ");
            kode = sc.nextLine();
            System.out.print("Nama        : ");
            nama = sc.nextLine();
            System.out.print("SKS         : ");
            sks = sc.nextInt();
            System.out.print("Jumlah Jam  : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------");
            
            arrayOfMatakuliah7[i] = new MataKuliah7(kode, nama, sks, jumlahJam);
        }
    }
}
