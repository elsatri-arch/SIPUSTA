package model;

public class BukuCetak extends Koleksi implements Terarsip {

    private int jumlahHalaman;
    private String nomorRak;
    private String lantai;

    public BukuCetak(String kodeKoleksi, String judul, int tahunTerbit, int jumlahHalaman, String nomorRak, String lantai) {
        super(kodeKoleksi, judul, tahunTerbit);

        this.jumlahHalaman = jumlahHalaman;
        this.nomorRak = nomorRak;
        this.lantai = lantai;
    }

    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Jumlah Halaman: " + jumlahHalaman);
        System.out.println("Nomor Rak: " + nomorRak);
    }

    @Override
    public boolean kelayakanPinjam() {
        return true;
    }

    @Override
    public String nomorRak() {
        return nomorRak;
    }

    @Override
    public String lokasiLantai() {
        return lantai;
    }
}
