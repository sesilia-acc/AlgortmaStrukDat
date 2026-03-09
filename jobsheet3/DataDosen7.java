public class DataDosen7 {
    public String kode, nama;
    public boolean jenisKelamin;
    public int usia;

    public static void dataSemuaDosen(Dosen7[] daftarDosen7) {
        for (Dosen7 d7 : daftarDosen7) {
            System.out.println("Kode dosen      : " + d7.kode);
            System.out.println("Nama dosen      : " + d7.nama);
            System.out.println("Jenis kelamin   : " + (d7.jenisKelamin ? "Pria" : "Wanita"));
            System.out.println("Usia            : " + d7.usia);
            System.out.println("----------------------------------------");
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen7[] daftarDosen7) {
        int pria = 0, wanita = 0;
        for (Dosen7 d7 : daftarDosen7) {
            if (d7.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah dosen pria: " + pria + " tahun");
        System.out.println("Jumlah dosen wanita: " + wanita + " tahun");
    }

    public static void rerataUsiaDosenPerJenisKelamin (Dosen7[] daftarDosen7) {
        int totalUsiaP = 0, totalUsiaW = 0, hitungP = 0, hitungW = 0;
        for (Dosen7 d7 : daftarDosen7) {
            if (d7.jenisKelamin) {
                totalUsiaP += d7.usia;
                hitungP++;
            } else {
                totalUsiaW += d7.usia;
                hitungW++;
            }
        }
        System.out.println("Rerata usia Pria: " + (hitungP > 0 ? totalUsiaP/hitungP : 0));
        System.out.println("Rerata usia Wanita: " + (hitungW > 0 ? totalUsiaW/hitungW : 0));
    }

    public static void infoDosenPalingTua (Dosen7[] daftarDosen7) {
        Dosen7 tua = daftarDosen7[0];
        for (Dosen7 d7 : daftarDosen7) {
            if (d7.usia > tua.usia) {
                tua = d7;
            }
        }
        System.out.println("Dosen yang paling tua: " + tua.nama + " (" + tua.usia + " tahun)");
    }

    public static void infoDosenPalingMuda (Dosen7[] daftarDosen7) {
        Dosen7 muda = daftarDosen7[0];
        for (Dosen7 d7 : daftarDosen7) {
            if (d7.usia < muda.usia) {
                muda = d7;
            }
        }
        System.out.println("Dosen yang paling muda: " + muda.nama + " (" + muda.usia + " tahun)");
    }
}
