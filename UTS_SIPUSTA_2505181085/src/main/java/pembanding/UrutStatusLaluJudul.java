package pembanding;

import java.util.Comparator;
import model.Koleksi;

public class UrutStatusLaluJudul implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi a, Koleksi b) {
        // lapis pertama: yang siap dipinjam tampil lebih dulu 
        int bandingStatus = Boolean.compare(b.kelayakanPinjam(), a.kelayakanPinjam());
        if (bandingStatus != 0) {
            return bandingStatus;
        }
        // lapis kedua: bila status sama, urutkan berdasarkan nama 
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}
