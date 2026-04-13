public class MahasiswaBerprestasi07 {
    Mahasiswa07 listMhs[];
    int idx;

    public MahasiswaBerprestasi07(int kuota) {
        listMhs = new Mahasiswa07[kuota];
        idx = 0;
    }

    void tambah (Mahasiswa07 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("data sudah penuh.");
        }
    }

    void tampil() {
        for (Mahasiswa07 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
                System.out.println("------------------------------");
            }
        }
    }

    void bubbleSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            for (int j = 1; j < listMhs.length - 1; j++) {
                if (listMhs[j] != null && listMhs[j - 1] != null) {
                    if (listMhs[j].ipk > listMhs[j - 1].ipk) {
                        Mahasiswa07 tmp = listMhs[j];
                        listMhs[j] = listMhs[j - 1];
                        listMhs[j - 1] = tmp;   
                    }
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < listMhs.length - 1; i++) {
            int idxmin = i;
            for (int j = i + 1; j < listMhs.length; j++) {
                if (listMhs[j].ipk < listMhs[idxmin].ipk) {
                    idxmin = j;
                }
            }
            Mahasiswa07 temp = listMhs[idxmin];
            listMhs[idxmin] = listMhs[i];
            listMhs[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < listMhs.length; i++) {
            Mahasiswa07 temp = listMhs[i];
            int j = i;
            while (j > 0 && listMhs[j - 1].ipk > temp.ipk) {
                listMhs[j] = listMhs[j -1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
