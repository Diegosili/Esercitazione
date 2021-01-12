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
public class utente implements Runnable{
    
    private boolean soddisfatto = false;
    private boolean stop = false;
    private Kebabbaro k = new Kebabbaro();
    private int numero;
    
    public utente(Kebabbaro k, int numero) {
        this.k = k;
        this.numero = numero;
    }
    
    @Override
    public void run() {
        while(!stop) {
            while(!soddisfatto) {
                soddisfatto = k.sfornaKebab();
                if(soddisfatto == true) {
                    System.out.println("THREAD SODDISFATTO: "+numero);
                }
            }
        }
    }
    
    public void termina() {
        stop = true;
    }
}
