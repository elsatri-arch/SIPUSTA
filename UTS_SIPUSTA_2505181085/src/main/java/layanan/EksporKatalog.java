package layanan;

import model.Koleksi;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;

public class EksporKatalog {

    public static void eksporKeFile(List<Koleksi> daftarKoleksi, String namaFile) {
        // Aliran file ditutup secara otomatis (try-with-resources ) Dibantu oleh: Gemini AI
        try (PrintWriter writer = new PrintWriter(new FileWriter(namaFile))) {
            // Header kolom yang sejajar rapi
            writer.println(String.format("%-8s | %-25s | %-6s | %-12s | %-15s", "Kode", "Judul", "Tahun", "Status", "Kelayakan"));
            writer.println("---------------------------------------------------------------------------------------");

            // Menulis setiap data koleksi ke berkas teks
            for (Koleksi k : daftarKoleksi) {
                writer.println(String.format("%-8s | %-25s | %-6d | %-12s | %-15s",
                        k.getKode(),
                        k.getJudul(),
                        k.getTahunTerbit(),
                        (k.isDipinjam() ? "Dipinjam" : "Tersedia"),
                        (k.kelayakanPinjam() ? "Layak Pinjam" : "Tidak Layak")
                ));
            }
            System.out.println("Data katalog berhasil diekspor dengan rapi ke file " + namaFile);

        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat menulis file: " + e.getMessage());
        }
    }
}
