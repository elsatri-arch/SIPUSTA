
import model.*;
import layanan.*;
import eksepsi.*;
import pembanding.*;

public class Main {

    public static void main(String[] args) {
        KatalogPerpustakaan katalog = new KatalogPerpustakaan();

        // 1. Menambahkan BukuCetak 
        katalog.tambah(new BukuCetak("BK-001", "Java How to Program", 2022, 620, "rak A-12", "tidak diperbaiki"));
        katalog.tambah(new BukuCetak("BK-002", "Basis Data Relasional", 2021, 410, "rak B-04", "sedang diperbaiki"));

        // 2. Menambahkan Majalah
        katalog.tambah(new Majalah("MJ-001", "Info Teknologi Edisi 88", 2026, "edisi 88", "Agustus", "edisi terbaru", "-"));
        katalog.tambah(new Majalah("MJ-002", "Info Teknologi Edisi 87", 2026, "edisi 87", "Juli", "bukan terbaru", "-"));

        // 3. Menambahkan BerkasDigital
        katalog.tambah(new BerkasDigital("BD-001", "Panduan Pemrograman Java", 2024, 15.0, "unduh.polmed.ac.id/bd001"));
        katalog.tambah(new BerkasDigital("BD-002", "Jurnal Rekayasa Perangkat", 2025, 8.0, "unduh.polmed.ac.id/bd002"));

        System.out.println("=== CETAK STATUS KATALOG  ===");
        katalog.cetakStatus();

        System.out.println("\n=== PENGUJIAN PENGURUTAN ===");
        for (Koleksi k : katalog.urutBawaan()) {
            System.out.println("-> " + k.getJudul() + " | Layak Pinjam: " + k.kelayakanPinjam());
        }

        System.out.println("\n=== EKSPOR KATALOG KE BERKAS TEKS ===");
        EksporKatalog.eksporKeFile(katalog.semuaKoleksi(), "katalog.txt");
    }
}
