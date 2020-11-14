package com.company;

public class sepedabmx {
    int kecepatan = 0;
    int gir = 0;

    void ubahGir(int pertambahanGir) {
        gir = gir+ pertambahanGir;
        System.out.println(" Gir:" + gir);
    }
    void tambahkecepatan(int pertambahanKecepatan) {
        kecepatan = kecepatan+ pertambahanKecepatan;
        System.out.println(" Kecepatan" + kecepatan);
    }
}
class sepedabmxberaksi{
    public static void main(String[] args){
        sepedabmx sepedaku = new sepedabmx();
        sepedaku.kecepatan = 10;
        sepedaku.gir=2;
        sepedaku.tambahkecepatan(30);
        sepedaku.ubahGir(3);
    }
}
