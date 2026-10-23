package pembanding;

import java.util.Comparator;
import model.Koleksi;

public class UrutJudul implements Comparator<Koleksi> {

    @Override
    public int compare(Koleksi a, Koleksi b) {
        return a.getJudul().compareToIgnoreCase(b.getJudul());
    }
}
