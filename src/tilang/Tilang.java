/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tilang;

/**
 *
 * @author ASUS
 */
public class Tilang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean SIM = true;
        boolean STNK = true;
        boolean Masker = true;
        
        // cek apakah dia akan ditilang atau tidak
        if(SIM == true && STNK == true && Masker == true){
            System.out.println("Anda Tidak ditilang!");
        } else {
            System.out.println("Anda ditilang!");
        }
    }
    
}
