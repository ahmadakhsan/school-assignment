package bayucantik.com.modulmp.modul3;

public class model {
    private  String nama;
    private  String alamat;
    private  String nohp;

    public model(String nama, String alamat, String nohp) {
        this.nama = nama;
        this.alamat = alamat;
        this.nohp = nohp;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNohp() {
        return nohp;
    }
}
