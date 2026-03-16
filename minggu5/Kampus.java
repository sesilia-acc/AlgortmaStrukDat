public class Kampus {
    String nama, nim;
    int thnMasuk, uts, uas;

    public Kampus(String nm, String nim, int masuk, int uts, int uas) {
        nama = nm;
        this.nim = nim;
        thnMasuk = masuk;
        this.uts = uts;
        this.uas = uas;
    }
    
    public static int cariMax(Kampus[] kmp, int l, int r) {
        if (l == r) {
            return kmp[l].uts;
        }

        int mid = (l + r) / 2;
        int lmax = cariMax(kmp, l, mid);
        int rmax = cariMax(kmp, mid + 1, r);
        return (lmax > rmax) ? lmax : rmax;
    }

    public static int cariMin(Kampus[] kmp, int l, int r) {
        if (l == r) {
            return kmp[l].uts;
        }

        int mid = (l + r) / 2;
        int lmin = cariMin(kmp, l, mid);
        int rmin = cariMin(kmp, mid + 1, r);
        return (lmin < rmin) ? lmin : rmin;
    }

    public static double rataUAS(Kampus[] kmp) {
        double total = 0;
        for (Kampus k : kmp) {
            total += k.uas;
        }
        return total / kmp.length;
    }
    
}
