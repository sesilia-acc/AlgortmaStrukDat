public class mataKuliah {
    public mataKuliah(){

    }

    public mataKuliah(String nm, String kodeMatkul, int eskaes, int jumlahjam) {
        nama = nm;
        kodeMK = kodeMatkul;
        sks = eskaes;
        jmlJam = jumlahjam;
    }

    String kodeMK;
    String nama;
    int sks;
    int jmlJam;

    void tampilInformasi() {
        System.out.println("Nama\t\t\t: " + nama);
        System.out.println("Kode mata kuliah\t: " + kodeMK);
        System.out.println("Jumlah SKS\t\t: " + sks);
        System.out.println("Jumlah jam\t\t: " + jmlJam);
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
    }

    void tambahJam(int jam) {
        this.jmlJam += jam;
    }

    void kurangiJam(int jam) {
        if (jmlJam >= jam) {
            this.jmlJam -= jam;
        } else {
            System.out.println("Pengurangan jam tidak dapat dilakukan.");
        }
    }
}
