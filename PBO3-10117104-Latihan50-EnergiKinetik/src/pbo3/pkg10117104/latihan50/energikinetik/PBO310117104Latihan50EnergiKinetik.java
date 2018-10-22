/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan50.energikinetik;

import java.text.DecimalFormat;

/**
 *
 * @author 
 * Nama : Aditya Suheryana
 * Kelas : IF-3/PBO3
 * Nim : 10117104
 * Deskripsi Program : Program tentang menghasilkan Energi Kinetik dan usaha 
 * dengan kecepatan dan massa yang telah diketahui 
 * 
 */
public class PBO310117104Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("====Energi Kinetik====");
        EnergiKinetik eK = new EnergiKinetik();
        eK.setMassa(145);
        eK.setKecepatan(25);
        System.out.println("Massa = "+eK.getMassa()+" g");
        System.out.println("Kecepatan = "+eK.getKecepatan()+" m/s");
        DecimalFormat df = new DecimalFormat("#.####");
        System.out.println("Energi Kinetik = "+df.format(eK.energiKinetik
        (eK.getMassa(),eK.getKecepatan()))+" joule");
        System.out.println("Usaha = "+df.format(eK.usaha
        (eK.getMassa(),eK.getKecepatan()))+" joule");
    }
    
}
