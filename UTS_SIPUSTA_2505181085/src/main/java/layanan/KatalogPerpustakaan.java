package layanan;

import pembanding.UrutStatusLaluJudul;
import model.Koleksi;
import eksepsi.KoleksiSedangDipinjamEksepsi;
import eksepsi.KoleksiTidakLayakEksepsi;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class KatalogPerpustakaan {

    private final List<Koleksi> daftarKoleksi = new ArrayList<>();

    public void tambah(Koleksi koleksi) {
        daftarKoleksi.add(koleksi);
    }

    public List<Koleksi> semuaKoleksi() {
        return daftarKoleksi;
    }

    // Soal No. 3: cetakStatus secara polimorfik TANPA satu pun kata 'instanceof'
    public void cetakStatus() {
        System.out.println("=== STATUS KATALOG PERPUSTAKAAN ===");
        for (Koleksi a : daftarKoleksi) {
            // Memanggil method polimorfik dari kelas induk secara langsung
            System.out.println("Status: " + a.laporanRingkas());
        }
    }

    public List<Koleksi> urut(Comparator<Koleksi> pembanding) {
        List<Koleksi> salinan = new ArrayList<>(daftarKoleksi);
        salinan.sort(pembanding);
        return salinan;
    }

    public List<Koleksi> urutBawaan() {
        return urut(new UrutStatusLaluJudul());
    }

    public void hapusYangTidakSiap() {
        daftarKoleksi.removeIf(a -> !a.kelayakanPinjam());
    }

    // Method pinjam yang melemparkan eksepsi sesuai keadaan
    public void pinjam(String kodeKoleksi) throws KoleksiSedangDipinjamEksepsi, KoleksiTidakLayakEksepsi {
        boolean ditemukan = false;

        for (Koleksi k : daftarKoleksi) {
            if (k.getKode().equals(kodeKoleksi)) {
                ditemukan = true;
                if (k.isDipinjam()) {
                    // Melemparkan eksepsi khusus peminjaman
                    throw new KoleksiSedangDipinjamEksepsi(kodeKoleksi);
                }
                if (!k.kelayakanPinjam()) {
                    // Melemparkan eksepsi kelayakan
                    throw new KoleksiTidakLayakEksepsi("Maaf, koleksi dengan kode " + kodeKoleksi + " tidak memenuhi syarat kelayakan untuk dipinjam.");
                }
                k.setDipinjam(true);
                System.out.println("Berhasil meminjam koleksi: " + k.getJudul());
                return;
            }
        }

        if (!ditemukan) {
            System.out.println("Koleksi dengan kode " + kodeKoleksi + " tidak ditemukan di katalog.");
        }
    }
}
