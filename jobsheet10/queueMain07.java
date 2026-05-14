package jobsheet10;

import java.util.Scanner;

public class queueMain07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        queue07 q = new queue07(n);
        int pilih;

        boolean antri = true;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (q.isFull()) {
                        System.out.println("Queue sudah penuh");
                        antri = false;
                    } else {
                        System.out.print("Masukkan data baru: ");
                        int datamasuk = sc.nextInt();
                        q.Enqueue(datamasuk);
                    }
                    break;
                case 2:
                    if (q.isEmpthy()) {
                        System.out.println("Queue masih kosong");
                        antri = false;
                    } else {
                        int dataKeluar = q.Dequeue();
                        if (dataKeluar != -1) {
                            System.out.println("Data yang keluar: " + dataKeluar);
                        }
                    }
                    break;
                case 3:
                    q.print();
                    break;
                case 4:
                    q.peek();
                    break;
                case 5:
                    q.clear();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }

    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }
}
