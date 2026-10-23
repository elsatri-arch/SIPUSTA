package eksepsi;

public class DataTidakValidEksepsi extends SipustaEksepsi {

    private final String namaKolom;

    public DataTidakValidEksepsi(String namaKolom, String pesan) {
        super(pesan);
        this.namaKolom = namaKolom;
    }

    public String getNamaKolom() {
        return namaKolom;
    }
}
