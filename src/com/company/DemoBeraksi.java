package com.company;

public class DemoBeraksi {
    public static void main (String [] args) {
        MyPersegi.showinfo();
        MyPersegi persegi = new MyPersegi(10);
        System.out.println(persegi.getPanjang());
        System.out.println(persegi.getLuas());
        System.out.println(persegi.getKeliling());
        System.out.println(persegi.getLuas_permukaan());
        System.out.println(persegi.getVolumekubus());
        persegi.setPanjang(20);
        System.out.println(persegi.getPanjang());
        System.out.println(persegi.getLuas());
        System.out.println(persegi.getKeliling());
        System.out.println(persegi.getLuas_permukaan());
        System.out.println(persegi.getVolumekubus());
        try {
            System.out.println(persegi.showException());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
