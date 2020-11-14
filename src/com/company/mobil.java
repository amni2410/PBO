package com.company;

public class mobil {
    String warna;
    int tahunProduksi;
}
class MobilBeraksi {
    public static void main(String[] args) {
        mobil mobilku = new mobil();
        mobilku.warna = "Putih";
        mobilku.tahunProduksi = 2006;
        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunProduksi);

    }
}