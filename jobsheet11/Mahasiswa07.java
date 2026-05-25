package jobsheet11;

public class Mahasiswa07 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa07() {

    }

    public Mahasiswa07(String name, String nm, String kls, double ip) {
        nama = name;
        nim = nm;
        kelas = kls;
        this.ipk = ip;
    }

    public void tampilInformasi() {
       System.out.println(nama + "\t\t" + nim + "\t\t" + kelas + "\t\t" + ipk);
    }
}
