public class mataKuliahMain {
    public static void main(String[] args) {
        mataKuliah mk1 = new mataKuliah();
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.kodeMK = "ASD1";
        mk1.sks = 4;
        mk1.jmlJam = 3;

        mk1.tampilInformasi();
        System.out.println();
        mk1.ubahSKS(2);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();
        System.out.println();

        mataKuliah mk2 = new mataKuliah("Basis Data", "BD1", 3, 2);
        mk2.tampilInformasi();
        System.out.println();
        mk2.ubahSKS(4);
        mk2.tambahJam(1);
        mk2.kurangiJam(4);
        mk2.tampilInformasi();
        System.out.println();
    }
}
