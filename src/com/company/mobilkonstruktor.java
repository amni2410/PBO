package com.company;

public class mobilkonstruktor {
    String warna;
    int tahunProduksi;
    public mobilkonstruktor(String warna, int tahunProduksi){
        this.warna = warna;
        this.tahunProduksi = tahunProduksi;
    }
    public void info(){
        System.out.println("Warna:" + warna);
        System.out.println("Tahun:" + tahunProduksi);
    }
}
class mobilkonstruktorberaksi {
    public static void main (String[] args){
        mobilkonstruktor mobilku = new mobilkonstruktor("Putih",2020);
        mobilku.info();
    }
}