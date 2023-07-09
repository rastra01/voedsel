package voedsel;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("StokMakanan")
public class StokMakanan {
    private String nama;
    private String stok;
    private String tanggal;

    public StokMakanan(String nama, String stok, String tanggal) {
        this.nama = nama;
        this.stok = stok;
        this.tanggal = tanggal;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getStok() {
        return stok;
    }

    public void setStock(String stok){
        this.stok = stok;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void settanggal(String tanggal){
        this.tanggal = tanggal;
    }

    public static void remove(int h) {
    }
}
