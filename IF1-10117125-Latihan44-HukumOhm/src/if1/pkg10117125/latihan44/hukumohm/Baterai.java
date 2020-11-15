/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan44.hukumohm;

/**
 *
 * @author Zulfi
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
        
    }
    
    public Baterai(float kuatArus, float hambatan) {
        
    }

    public float getKuatArus() {
        return kuatArus = 3;
    }

    public float getHambatan() {
        return hambatan = 12;
    }
    
    public float hitungTegangan() {
        return kuatArus*hambatan;
    }
}
