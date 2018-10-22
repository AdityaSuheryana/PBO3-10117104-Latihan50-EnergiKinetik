/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117104.latihan50.energikinetik;

/**
 *
 * @author user
 */
public class EnergiKinetik {
private int massa;
private int kecepatan;

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }
    
    public double energiKinetik(int massa,int kecepatan){
    double eK = 0.5*massa/1000*(kecepatan*kecepatan);
        
    return eK;    
    }
    public double usaha(int massa,int kecepatan){
    double u=0.5*massa/1000*((kecepatan*kecepatan)-(0*0)); 
    return u;    
    }
}
