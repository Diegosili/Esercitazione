/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

/**
 *
 * @author siliprandi.diego
 */
public class Kebabbaro {
    
    public boolean kebab;
    
    public synchronized boolean sfornaKebab() {
        kebab = false;
        try{
            Thread.sleep(300);
            kebab = true;
        } catch (InterruptedException ex) {}
        return kebab;
    }
    
}
