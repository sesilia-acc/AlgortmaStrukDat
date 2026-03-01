public class dosen {
    public dosen() {

    }

    public dosen(String kodeDosen, String nm, String bidangAhli, boolean keaktifan, int thnGabung) {
        idDosen = kodeDosen;
        nama = nm;
        bidangKeahlian = bidangAhli;
        statusAktif = keaktifan;
        tahunGabung = thnGabung;
    }

        String idDosen, nama, bidangKeahlian;
        boolean statusAktif;
        int tahunGabung;
        

    void tampilInformasi(int thn) {
        System.out.println("id Dosen\t: " + idDosen);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println("Tahun Bergabung : " + tahunGabung);
        System.out.println("Status Keaktifan: " + statusAktif);
        System.out.println("Masa Kerja\t: " +hitungMasaKerja(thn) + " tahun");
    }

    void setStatusAktid(boolean status) {
        statusAktif = status;
    }

    int hitungMasaKerja(int thnSkrg) {
        int masaKerja = thnSkrg - tahunGabung;
        return masaKerja;
    }

    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
    }
}