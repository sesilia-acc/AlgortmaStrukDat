public class mahasiswaMain07 {
    public static void main(String[] args) {
        mahasiswa07 mhs1 = new mahasiswa07 ();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "S1 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilInformasi();
        mhs1.ubahKelas("S1 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilInformasi();
    }
    
}