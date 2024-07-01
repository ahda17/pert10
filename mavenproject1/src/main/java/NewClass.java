/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author A-18
 */
public class NewClass {
    public class NewClass {
}
// Interface untuk Kendaraan
interface Kendaraan {
    void info();
}

// Kelas Induk untuk Mobil
class Mobil implements Kendaraan {
    private String merek;
    private String model;

    public Mobil(String merek, String model) {
        this.merek = merek;
        this.model = model;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void info() {
        System.out.println("Mobil: " + merek + " " + model);
    }
}

// Kelas Anak untuk Mobil Bekas
class MobilBekas extends Mobil {
    private int tahun;
    private double harga;

    public MobilBekas(String merek, String model, int tahun, double harga) {
        super(merek, model);
        this.tahun = tahun;
        this.harga = harga;
    }

    public int getTahun() {
        return tahun;
    }

    public double getHarga() {
        return harga;
    }

    @Override
    public void info() {
        System.out.println("Mobil Bekas: " + getMerek() + " " + getModel() + " (" + tahun + "), Harga: Rp " + harga);
    }
}

// Kelas Anak untuk Mobil Baru
class MobilBaru extends Mobil {
    private String garansi;

    public MobilBaru(String merek, String model, String garansi) {
        super(merek, model);
        this.garansi = garansi;
    }

    public String getGaransi() {
        return garansi;
    }

    @Override
    public void info() {
        System.out.println("Mobil Baru: " + getMerek() + " " + getModel() + " (Garansi: " + garansi + ")");
    }
}

// Kelas untuk Dealer Mobil
class Dealer {
    private String nama;
    private MobilBaru mobilBaru;
    private MobilBekas mobilBekas;

    public Dealer(String nama, MobilBaru mobilBaru, MobilBekas mobilBekas) {
        this.nama = nama;
        this.mobilBaru = mobilBaru;
        this.mobilBekas = mobilBekas;
    }

    public String getNama() {
        return nama;
    }

    public MobilBaru getMobilBaru() {
        return mobilBaru;
    }

    public MobilBekas getMobilBekas() {
        return mobilBekas;
    }

    public void info() {
        System.out.println("Dealer: " + nama);
        mobilBaru.info();
        mobilBekas.info();
    }
}
}
