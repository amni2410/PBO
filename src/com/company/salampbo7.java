package com.company;

public class salampbo7 {
    public static void main (String[] args) {
        char nilaiIndeks;
        Double nilaiUTS, nilaiUAS, nilaiAkhir;
        nilaiUTS= 75.0;
        nilaiUAS= 60.0;
        nilaiAkhir= (0.4 * nilaiUTS) + (0.6 * nilaiUAS);
        if (nilaiAkhir >= 90) {
        nilaiIndeks = 'A';
        }else if (nilaiAkhir >= 70){
        nilaiIndeks = 'B';
        }else if (nilaiAkhir >= 50){
        nilaiIndeks = 'C';
        }else if (nilaiAkhir >= 30){
        nilaiIndeks = 'D';
        }else {
        nilaiIndeks = 'E';
        }
        System.out.println("Nilai Akhir\t : " + nilaiAkhir);
        System.out.println("Nilai Akhir\t : " +nilaiIndeks);
    }
}
