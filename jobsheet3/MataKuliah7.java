public class MataKuliah7 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah7 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tambahData(String kd, String nm, int eskaes, int jmlJam) {
        kd = kode;
        nm = nama;
        eskaes = sks;
        jmlJam = jumlahJam;
    }

    public void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah jam  : " + jumlahJam);
        System.out.println("---------------------------------");
    }
}
