package SIMULASI;

public class MahasiswaFILKOM extends Manusia 
{
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nim, double ipk, String nama,  String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public String getNim()
    {
        return nim;
    }

    public void setNim(String nim)
    {
        this.nim = nim;
    }

    public double getIpk()
    {
        return ipk;
    }

    public void setIpk(double ipk)
    {
        this.ipk = ipk;
    }

    public String getStatus()
    {
        String angkatan = getNim().substring(0, 2);
        String Angkaprodi = getNim().substring(6, 7);
        String prodi = "";
        
        switch (Angkaprodi) {
            case "2":
                prodi = "Teknik Informatika";
                break;
            case "3":
                prodi = "Teknik Komputer";
                break;
            case "4":
                prodi = "Sistem Informasi";
                break;
            case "6":
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case "7":
                prodi = "Teknologi Informasi";
                break;
            default:
                break;
        }

        return prodi + ", 20" + angkatan;
    }

    public double getBeasiswa()
    {
        if (ipk >= 3.5) {
            return 75;
        } else if (ipk >= 3.0) {
            return 50;
        } else {
            return 0;
        }
    }

    public double getPendapatan()
    {
        return super.getPendapatan() + getBeasiswa();
    }

    public String toString() {
        return super.toString() + "\n" + 
               "NIM               : " + getNim() + "\n" +
               "IPK               : " + getIpk() + "\n" +
               "Status            : " + getStatus();
    }
}
