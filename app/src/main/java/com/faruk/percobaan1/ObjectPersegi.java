package com.faruk.percobaan1;
public class ObjectPersegi {
    private int panjang;
    private int lebar;
    public void setPanjang(int panjang){

        this.panjang = panjang;
    }
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    public int hitungluas(){
        return panjang * lebar;
    }
    public static void main(String[] args){
        ObjectPersegi persegi = new ObjectPersegi();
        persegi.setPanjang(10);
        persegi.setLebar(5);

        int Luas = persegi.hitungluas();
        System.out.println("Luas persegi adalah " + Luas);
    }

}
