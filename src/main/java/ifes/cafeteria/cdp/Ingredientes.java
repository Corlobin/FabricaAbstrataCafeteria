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
public class Ingredientes {
    private String ingredientes = "1 xícara de água 100 ml";

    public Ingredientes() {
    }


    public Ingredientes(String ingredientes) {
        String concat = this.ingredientes.concat(ingredientes);
        this.ingredientes = concat;
        System.out.println(concat);
    }

    /**
     * @return the ingredientes
     */
    public String getIngredientes() {
        return ingredientes;
    }

    /**
     * @param ingredientes the ingredientes to set
     */
    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
