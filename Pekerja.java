import java.time.LocalDate;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(double gaji,  int tahunMasuk, int bulanMasuk, int tanggalMasuk, int jumlahAnak, String nama, String nik, boolean jenisKelamin, boolean menikah)
    {
        super(nama, nik, jenisKelamin, menikah);
        LocalDate masuk = LocalDate.of(tahunMasuk, bulanMasuk, tanggalMasuk);
        this.tahunMasuk = masuk;

        this.gaji = gaji;
        this.jumlahAnak = jumlahAnak;
    }

    public LocalDate getTahunMasuk()
    {
        return tahunMasuk;
    }

    public void setTahunMasuk(LocalDate tahunMasuk){
        this.tahunMasuk = tahunMasuk;
    }

    public int getJumlahAnak()
    {
        return jumlahAnak;
    }

    public void setJumlahAnak(int jumlahAnak){
        this.jumlahAnak = jumlahAnak;
    } 
    public void setGaji(double gaji)
    {
        this.gaji = gaji;
    }
    public double getGaji()
    {
        return gaji;
    }
    public double getBonus()
    {
        double bonus = 0;
        LocalDate tahunNow = LocalDate.now();
        int LamaKerja = tahunNow.getYear() - getTahunMasuk().getYear();
        if(tahunNow.getMonthValue() == getTahunMasuk().getMonthValue() &&
        tahunNow.getDayOfMonth() < getTahunMasuk().getDayOfMonth())
        {
            LamaKerja--;
        }
        
        if(LamaKerja > 10){
            bonus = gaji * 0.15;
        }else if(LamaKerja > 5){
            bonus = gaji * 0.1;
        }else if(LamaKerja >= 0){
            bonus = gaji * 0.05;
        }
        return bonus;
    }

    @Override
    public double getTunjangan()
    {
        int tunjanganTambahan = 0;
        if(getJumlahAnak() > 0){
            tunjanganTambahan += 20 * getJumlahAnak();
        }
        return super.getTunjangan() + tunjanganTambahan;
    }

    public double getPendapatan()
    {
        return super.getPendapatan() + getBonus() + getGaji();
    }
    
    @Override
    public String toString()
    {
        return super.toString() + "\n" +
            "Tahun Masuk       : " + getTahunMasuk().getDayOfMonth() + " " + getTahunMasuk().getMonthValue() + " " + getTahunMasuk().getYear() + "\n" +
            "Jumlah Anak       : " + getJumlahAnak() + "\n" +
            "Gaji              : " + getGaji();
    }
}
