package com.company;

public class mobilv {
    String warna;
    int tahunProduksi ;
    void printMobil() {
        System.out.println("Warna" + warna);
        System.out.println("Tahun" + tahunProduksi);
    }
}
class mobilvberaksi {
    public static void main(String [] args) {
        mobilv mobilku = new mobilv();
        mobilku.warna = "Silver" ;
        mobilku.tahunProduksi = 2020;
        mobilku.printMobil();
    }
}