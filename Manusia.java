public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik,  boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.nik = nik;
        this.jenisKelamin = jenisKelamin;
        this.menikah = menikah;
    }

    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public boolean isJenisKelamin() {
        return jenisKelamin;
    }
    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }
    public String getNik() {
        return nik;
    }
    public void setNik(String nik) {
        this.nik = nik;
    }
    public boolean isMenikah() {
        return menikah;
    }
    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    public double getTunjangan()
    {
        return isMenikah() ? (isJenisKelamin() ? 25 : 20) : 15;
    }

    public double getPendapatan()
    {
        return getTunjangan();
    }

    public String toString() {
        return "Nama              : " + getNama() + "\n" +
               "NIK               : " + getNik() + "\n" +
               "Jenis Kelamin     : " + (isJenisKelamin() ? "Laki-laki" : "Perempuan") + "\n" +
               "Jumlah Pendapatan : " + getPendapatan();
    }    
} 