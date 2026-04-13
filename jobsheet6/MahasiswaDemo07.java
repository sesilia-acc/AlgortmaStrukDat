import java.util.Scanner;

public class MahasiswaDemo07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kuota mahasiswa: ");
        int jml = sc.nextInt();
        sc.nextLine();

        MahasiswaBerprestasi07 data = new MahasiswaBerprestasi07(jml);

        for (int i = 0; i < jml; i++) {
            System.out.println("\n---- Masukkan data Mahasiswa ke-" + (i+ 1) +" " + "----");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : " );
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa07 m = new Mahasiswa07(nim, nama, kelas, ipk);
            data.tambah(m);
        }
        
        System.out.println("\nData mahasiswa sebelum sorting: ");
        data.tampil();
        
        System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        data.bubbleSort();
        data.tampil();

        System.out.println("\nData yang sudah terurut menggunakan SELECTION SORT (ASC): ");
        data.selectionSort();
        data.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (ASC): ");
        data.insertionSort();
        data.tampil();
        
        sc.close();
    }
}
