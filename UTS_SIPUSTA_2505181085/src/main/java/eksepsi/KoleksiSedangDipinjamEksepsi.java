package eksepsi;

public class KoleksiSedangDipinjamEksepsi extends Exception {

    public KoleksiSedangDipinjamEksepsi(String kodeKoleksi) {
        super("Koleksi " + kodeKoleksi
                + " sedang dipinjam dan belum dikembalikan.");
    }
}
