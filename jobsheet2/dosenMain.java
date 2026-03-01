public class dosenMain {
    public static void main(String[] args) {
        dosen dosen1 = new dosen();
        dosen1.idDosen = "2501";
        dosen1.nama = "Sehun";
        dosen1.bidangKeahlian = "Rekayasa Perangkat Lunak";
        dosen1.tahunGabung = 2004;
        dosen1.statusAktif = true;

        dosen1.tampilInformasi(2025);
        System.out.println();
        dosen1.setStatusAktid(false);
        dosen1.hitungMasaKerja(2026);
        dosen1.ubahKeahlian("Fisika");
        dosen1.tampilInformasi(2026);
        System.out.println();

        dosen dosen2 = new dosen("2502", "Carmen", "Matematika", true, 2008);
        dosen2.tampilInformasi(2026);
        System.out.println();
        dosen2.setStatusAktid(false);
        System.out.println("Masa Kerja\t: " + dosen2.hitungMasaKerja(2024));
        dosen2.ubahKeahlian("English");
        dosen2.tampilInformasi(2024);
        System.out.println();
    }
}
