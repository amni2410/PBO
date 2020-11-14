package com.company;

public class MyPersegi {
    private int panjang;
    public MyPersegi(int panjang) {
    this.panjang = panjang;         }
public static void showinfo(){
        System.out.println("Dipanggil dari method static showInfo di class MyPersegi.... ");
}
public void setPanjang(int panjang){
        this.panjang = panjang;      }
public int getPanjang(){
        return this.panjang;    }
public int getLuas() {
        int Luas = this.panjang * this.panjang;
         return Luas;     }
public int getKeliling() {
        int Keliling = 4 * this.panjang;
        return Keliling;       }
public int getLuas_permukaan() {
        int Luas_permukaan = 6 * (this.panjang * this.panjang);
        return Luas_permukaan;     }
public int getVolumekubus () {
        int Volume = this.panjang * this.panjang * this.panjang;
return Volume ;   }
public int showException() throws          {
        return 1/0 ;     }
}
