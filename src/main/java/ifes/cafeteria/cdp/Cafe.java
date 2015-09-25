/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.cdp;

/**
 *
 * @author 20122bsi0387
 */
public class Cafe {
    private Ingredientes ingredientes;

    public Cafe() {
    }

    public Cafe(Ingredientes ingredientes) {   
        this.ingredientes = ingredientes;
    }

    /**
     * @return the ingredientes
     */
    public Ingredientes getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(Ingredientes ingredientes) {
        this.ingredientes = ingredientes;
    }

    
}
