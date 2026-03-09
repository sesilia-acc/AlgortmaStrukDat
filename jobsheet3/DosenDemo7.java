import java.util.Scanner;

public class DosenDemo7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kode, nama, dummy;
        int usia, data;
        boolean jenisKelamin;

        System.out.print("Jumlah dosen yang ingin di inputkan: ");
        data =sc.nextInt();
        sc.nextLine();

        Dosen7[] daftarDosen7 = new Dosen7[data];

        for (int i = 0; i < daftarDosen7.length; i++) {
            System.out.println("\nMasukkan data Dosen ke-" + (i + 1));
            System.out.print("Kode dosen    : " );
            kode = sc.nextLine();
            System.out.print("Nama dosen    : ");
            nama = sc.nextLine();
            System.out.println("True = pria, False = wanita");
            System.out.print("Jenis Kelamin : ");
            dummy = sc.nextLine();
            jenisKelamin = Boolean.parseBoolean(dummy);
            System.out.print("Usia          : ");
            dummy = sc.nextLine();
            usia = Integer.parseInt(dummy);
            System.out.println("-----------------------------------------");
            daftarDosen7[i] = new Dosen7(kode, nama, jenisKelamin, usia);
        }

        int nomor = 1;
        for (Dosen7 d7 : daftarDosen7) {
            System.out.println("\nData Dosen ke-" + nomor);
            System.out.println("Kode dosen      : " + d7.kode);
            System.out.println("Nama dosen      : " + d7.nama);
            System.out.println("Jenis kelamin   : " + (d7.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + d7.usia);
            System.out.println("----------------------------------------");
            nomor++;
        }

        System.out.println("\n==== Rangkuman Data Dosen ====");
        DataDosen7.dataSemuaDosen(daftarDosen7);
        System.out.println();
        DataDosen7.jumlahDosenPerJenisKelamin(daftarDosen7);
        System.out.println();
        DataDosen7.rerataUsiaDosenPerJenisKelamin(daftarDosen7);
        System.out.println();
        DataDosen7.infoDosenPalingTua(daftarDosen7);
        DataDosen7.infoDosenPalingMuda(daftarDosen7);

        sc.close();
    }
}
