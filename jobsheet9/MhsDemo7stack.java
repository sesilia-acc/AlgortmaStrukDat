package jobsheet9;

import java.util.Scanner;

public class MhsDemo7stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackTugasMhs7 stack = new StackTugasMhs7(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Total Tugas");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama\t: ");
                    String nama = sc.nextLine();
                    System.out.print("NIM\t: ");
                    String nim = sc.nextLine();
                    System.out.print("Kelas\t: ");
                    String kelas = sc.nextLine();
                    Mahasiswa7stack mhs = new Mahasiswa7stack(nama, nim, kelas, 0);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa7stack dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0 - 100): ");
                        int nilai = sc.nextInt();
                        sc.nextLine();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa7stack lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\t NIM\t Kelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa7stack ketahui = stack.peek2();
                    if (ketahui != null) {
                        System.out.println("Tugas pertama kali dikumpulkan oleh " + ketahui.nama);
                    }
                    break;
                case 6:
                    int jmlTugas = stack.totalTugas();
                    if (jmlTugas > 0) {
                        System.out.println("Jumlah tugas saat ini adalah " + jmlTugas);
                    } else {
                        System.out.println("Tidak ada tugas yang dikumpulkan.");
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }

        } while (pilih >= 1 && pilih <= 6);
        sc.close();
    }
}
