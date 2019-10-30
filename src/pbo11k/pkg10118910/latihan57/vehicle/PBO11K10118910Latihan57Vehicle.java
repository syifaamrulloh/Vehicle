/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118910.latihan57.vehicle;
/**
 * @author
 * NAMA             : Muhamad Syifa Amruloh
 * NIM              : 10118910
 * KELAS            : IF11K
 * Deskripsi Program  : Program untuk menampilkan nama kendaraan konsep pewarisan class
 */
public class PBO11K10118910Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.setMyBrand("Trex Bike");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        System.out.println("Brand : "+b.getMyBrand());
        System.out.println("Model : "+b.getMyModel());
        System.out.println("Jumlah Gear : "+b.getMyGearCount());
        System.out.println("");
        
        Skateboard s = new Skateboard();
        s.setMyBrand("Ally Skate");
        s.setMyModel("Rocket");
        s.setMyBoardLength(54.5);
        System.out.println("Brand : "+s.getMyBrand());
        System.out.println("Model : "+s.getMyModel());
        System.out.println("Jumlah Gear : "+s.getMyBoardLength());
        System.out.println("");
        
    }
    
}
