package model;

public abstract class Koleksi {

    protected String kodeKoleksi;
    protected String judul;
    protected int tahunTerbit;
    protected boolean dipinjam = false;

    public Koleksi(String kodeKoleksi, String judul, int tahunTerbit) {
        this.kodeKoleksi = kodeKoleksi;
        this.judul = judul;
        this.tahunTerbit = tahunTerbit;
    }

    public void deskripsi() {
        System.out.println("Kode koleksi: " + kodeKoleksi);
        System.out.println("Judul: " + judul);
        System.out.println("Tahun terbit: " + tahunTerbit);
    }

    public abstract boolean kelayakanPinjam();

    public String laporanRingkas() {
        String status = kelayakanPinjam() ? "SIAP" : "TIDAK SIAP";
        return String.format("%-5s %-5s %s", kodeKoleksi, judul, tahunTerbit);
    }

    public String getKode() {
        return kodeKoleksi;
    }

    public String getJudul() {
        return judul;
    }

    public int getTahunTerbit() {
        return tahunTerbit; // Sesuaikan dengan nama variabel tahun di kelas Koleksi Anda
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }
}
