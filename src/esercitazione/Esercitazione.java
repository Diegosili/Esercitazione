/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazione;

/**
 * Si sviluppi un applicativo dove dichiarare un array di 20 istanze di thread che tentino di 
 * accedere simultaneamente a una risorsa kebab condivisa, il kebabbaro consegna un kebab ogni 5 secondi.
 * Visualizzare a schermo in che ordine vengono soddisfatti i 20 clienti
 * 
 * @author siliprandi.diego
 */
public class Esercitazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Thread t[] = new Thread[20];
        Kebabbaro k = new Kebabbaro();
        
        for(int i=0; i<20; i++) {
            t[i] = new Thread(new utente(k, i));
        }
        for(int i=0; i<20; i++) {
            t[i].start();
        }
    }
    
}
