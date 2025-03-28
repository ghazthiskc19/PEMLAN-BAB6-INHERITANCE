
public class Manager extends Pekerja{
    private String departemen;

    public Manager(String departemen, double gaji,  int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah)
    {
        super(gaji, tahunMasuk, bulanMasuk, tanggalMasuk, jumlahAnak, nama, nik, jenisKelamin, menikah);
        this.departemen = departemen;
    }

    public String getDepartemen()
    {
        return departemen;
    }

    public void setDepartemen(String departemen)
    {
        this.departemen = departemen;
    }

    public double getTunjangan()
    {
        return super.getTunjangan() + (super.getGaji() * 0.1);
    }
    public String toString()
    {
        return super.toString() + "\n" +
            "Departemen        : " + getDepartemen();
    }
}
