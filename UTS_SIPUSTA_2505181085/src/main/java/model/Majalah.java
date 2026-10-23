package model;

public class Majalah extends Koleksi implements Terarsip {

    private String edisi;
    private String bulanTerbit;
    private String nomorRak;
    private String lantai;

    public Majalah(String kodeKoleksi, String judul, int tahunTerbit, String edisi, String bulanTerbit, String nomorRak, String lantai) {

        super(kodeKoleksi, judul, tahunTerbit);

        this.edisi = edisi;
        this.bulanTerbit = bulanTerbit;
        this.nomorRak = nomorRak;
        this.lantai = lantai;
    }

    @Override
    public void deskripsi() {
        super.deskripsi();
        System.out.println("Edisi: " + edisi);
        System.out.println("Bulan Terbit: " + bulanTerbit);
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
