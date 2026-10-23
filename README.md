SIPUSTA (Sistem Peminjaman Koleksi Perpustakaan)

SIPUSTA  adalah suatu sistem yang mengelola peminjaman koleksi perpustakaan Politeknik Negeri Medan. Sistem ini mengelola data katalog, memastikan status koleksi dan memastikan proses peminjaman dapat dilakukan dengan efisien dan terorganisasi. 

o> Struktur Proyek & Paket

Proyek ini menerapkan prinsip enkapsulasi, pewarisan, polimorfisme, dan antarmuka (interface):

* model: Berisi hirarki kelas objek pustaka (`Koleksi` sebagai kelas induk abstrak, serta subkelas `BukuCetak`, `Majalah`, dan `BerkasDigital`) beserta implementasi *interface* pengarsipan.
* layanan: Berisi kelas pengelola katalog utama (`KatalogPerpustakaan`) dan kelas utilitas ekspor berkas (`EksporKatalog`).
* eksepsi: Berisi kustom kelas *exception* bertingkat (`SipustaEksepsi`, `KoleksiSedangDipinjamEksepsi`, `KoleksiTidakLayakEksepsi`, dan `DataTidakValidEksepsi`).
* pembanding: Berisi kelas implementasi `Comparator` (`UrutStatusLaluJudul`) untuk mengatur logika pengurutan koleksi.

---

o> Fitur Utama

1. Hirarki Kelas & Polimorfisme: Menggunakan kelas abstrak dengan metode *abstract* aturan kelayakan pinjam serta method laporan ringkas yang diperluas memakai `super`. Pencetakan status katalog diproses secara polimorfik tanpa menggunakan operator `instanceof`.
2. Interface Pengarsipan: Menerapkan interface `Terarsip` beserta *default method* khusus pada kelas koleksi fisik tertentu.
3. Sistem Pengurutan Kustom: Menggunakan `Comparator` (`UrutStatusLaluJudul`) untuk memprioritaskan koleksi yang layak pinjam di urutan teratas, kemudian diurutkan berdasarkan judul secara alfabetis.
4. Penanganan Eksepsi (Custom Exception): Melemparkan eksepsi khusus ramah pengguna awam apabila terjadi kesalahan saat proses peminjaman (misalnya koleksi sedang dipinjam atau tidak memenuhi syarat kelayakan).
5. Ekspor Data (Try-with-resources): Menulis seluruh data katalog ke dalam berkas teks (`katalog.txt`) dengan format kolom tabel yang sejajar rapi dan penutupan aliran file otomatis.

---

o> Data Uji Standar yang dapat digunakan:

Aplikasi ini dapat diuji menggunakan data standar berikut:
* **BukuCetak**: Java How to Program, Basis Data Relasional
* **Majalah**: Info Teknologi Edisi 88, Info Teknologi Edisi 87
* **BerkasDigital**: Panduan Pemrograman Java, Jurnal Rekayasa Perangkat

---
o> Cara Menjalankan Proyek

1. Buka **NetBeans IDE**.
2. Pilih **File > Open Project** lalu arahkan ke folder proyek `UTS_SIPUSTA_2505181085`.
3. Klik kanan pada proyek, pilih **Clean and Build** untuk memastikan seluruh dependensi dan paket terkompilasi dengan baik.
4. Buka file `Main.java`, lalu klik tombol **Run File** (atau tekan `Shift + F6`) untuk menjalankan pengujian program.
5. Periksa file `katalog.txt` yang akan otomatis tergenerate di direktori root proyek setelah program selesai mengekspor data.
4. Klik kanan pada proyek, pilih **Clean and Build** untuk memastikan seluruh dependensi dan paket terkompilasi dengan baik.
5. Buka file `Main.java`, lalu klik tombol **Run File** (atau tekan `Shift + F6`) untuk menjalankan pengujian program.
6. Periksa file `katalog.txt` yang akan otomatis tergenerate di direktori root proyek setelah program selesai mengekspor data.
