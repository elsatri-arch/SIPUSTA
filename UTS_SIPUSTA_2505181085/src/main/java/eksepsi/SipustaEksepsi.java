package eksepsi;

public class SipustaEksepsi extends Exception {

    public SipustaEksepsi(String pesan) {
        super(pesan);
    }

    // konstruktor kedua membawa penyebab aslinya 
    public SipustaEksepsi(String pesan, Throwable penyebab) {
        super(pesan, penyebab);
    }
}
