package model;

public interface Terarsip {
    String nomorRak();
    String lokasiLantai();
    
    default String ringkasanArsip(){
        
        return "Lokasi lantai: " + lokasiLantai() + "Nomor Rak: " + nomorRak() ;
    }
}
