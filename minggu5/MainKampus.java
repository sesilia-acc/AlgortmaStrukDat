import java.util.Scanner;

public class MainKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        int mhs, thnMasuk, uts, uas;

        System.out.print("Masukkan jumlah mahasiswa: ");
        mhs = sc.nextInt();
        sc.nextLine();

        Kampus kmp[] = new Kampus[mhs];
        for (int i = 0; i < kmp.length; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.print("Nama          : ");
            nama = sc.nextLine();
            System.out.print("NIM           : ");
            nim = sc.nextLine();
            System.out.print("Tahun masuk   : ");
            thnMasuk = sc.nextInt();
            System.out.print("Nilai UTS     : ");
            uts = sc.nextInt();
            System.out.print("Nilai UAS     : ");
            uas = sc.nextInt();
            sc.nextLine();

            kmp[i] = new Kampus(nama, nim, thnMasuk, uts, uas);
            System.out.println();
        }

        System.out.println("==== DATA MAHASISWA ====");
        int max = Kampus.cariMax(kmp, 0, kmp.length - 1);
        int min = Kampus.cariMin(kmp, 0, kmp.length - 1);
        double rerata = Kampus.rataUAS(kmp);

        System.out.println("Nilai UTS tertinggi     : " + max);
        System.out.println("Nilai UTS terendah      : " + min);
        System.out.printf("Rata - rata nilai UAS    : %.2f\n", rerata);
        sc.close();
    }
}
