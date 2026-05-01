package jobsheet9;

public class Mahasiswa7stack {
    String nama, nim, kelas;
    int nilai;

    public Mahasiswa7stack() {
    }

    public Mahasiswa7stack(String nama, String nim, String kelas, int nilai) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}
