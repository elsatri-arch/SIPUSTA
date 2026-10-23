package model;

public class BerkasDigital extends Koleksi {

    private double ukuranMB;
    private String tautanUnduh;

    public BerkasDigital(String kodeKoleksi, String judul, int tahunTerbit, double ukuranMB, String tautanUnduh) {

        super(kodeKoleksi, judul, tahunTerbit);

        this.ukuranMB = ukuranMB;
        this.tautanUnduh = tautanUnduh;

    }

    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Ukuran: " + ukuranMB + "MB");
        System.out.println("Tautan Unduh: " + tautanUnduh);
    }

    @Override
    public boolean kelayakanPinjam() {
        return true;
    }
}
