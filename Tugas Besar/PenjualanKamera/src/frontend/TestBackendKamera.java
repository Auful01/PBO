/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontend;

/**
 *
 * @author hp
 */
import backend.*;

public class TestBackendKamera {
    public static void main(String[] args) {
        Kamera canon = new Kamera("Canon");
        
        canon.save();
        
        for (Kamera k : new Kamera().getAll()) {
            System.out.println("Merek: " + k.getMerek());
        }
    }
}
