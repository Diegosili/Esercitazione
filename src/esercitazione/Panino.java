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
public class Panino {
    private boolean panino;
    
    public synchronized boolean prendiPanino() {
        if(panino){
            panino = false;
            return true;
        }
        return false;
    }
    
    public synchronized void paninoPronto() {
        panino = true;
    }
}
