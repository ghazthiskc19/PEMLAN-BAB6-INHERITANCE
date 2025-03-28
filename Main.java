public class Main {
    public static void main(String[] args) {

        // Mencoba test case
        // 1200 + 50 + 
        // Manusia a = new Manusia("A", "111", true, true);
        // System.out.println(a.toString());
        
        // MahasiswaFILKOM b = new MahasiswaFILKOM("165150300111100", 4.0, "B", "111", false, false);
        // System.out.println(b.toString());
        
        // Pekerja c = new Pekerja(1000, 2016, 3, 2, 4, "C", "111", true, true);
        // System.out.println(c.toString());
        
        // Manager d = new Manager("HRD", 1000, 2017, 1, 2, 3, "D", "111", true, true);
        // System.out.println(d.toString());
        
        
        // 1
        Manusia Adi = new Manusia("Adi", "111", true, true);
        System.out.println(Adi.toString());
        System.out.println();
        
        Manusia Ana = new Manusia("Ana", "111", false, true);
        System.out.println(Ana.toString());
        System.out.println();

        Manusia Anti = new Manusia("Anti", "111", false, false);
        System.out.println(Anti.toString());
        System.out.println();
        
        // 2
        MahasiswaFILKOM b = new MahasiswaFILKOM("245150200111071", 2.8, "ABE", "111", false, false);
        System.out.println(b.toString());
        System.out.println();
        
        MahasiswaFILKOM c = new MahasiswaFILKOM("245150200111071", 3.2, "UUS", "111", false, false);
        System.out.println(c.toString());
        System.out.println();
        
        MahasiswaFILKOM d = new MahasiswaFILKOM("245150200111071", 3.9, "GOJI", "111", false, false);
        System.out.println(d.toString());
        System.out.println();
        
        // 3
        Pekerja e = new Pekerja(1000, 2023, 3, 2, 2, "ADE", "111", true, true);
        System.out.println(e.toString());
        System.out.println();
        
        Pekerja f = new Pekerja(1000, 2016, 3, 2, 2, "ANTO", "111", true, true);
        System.out.println(f.toString());
        System.out.println();

        Pekerja g = new Pekerja(1000, 2005, 3, 2, 10, "ADE", "111", true, true);
        System.out.println(g.toString());
        System.out.println();

        // 4
        Manager h = new Manager("Supervisor", 7500, 2010, 1, 2, 3, "BUDI", "111", true, true);
        System.out.println(h.toString());
    }
}
