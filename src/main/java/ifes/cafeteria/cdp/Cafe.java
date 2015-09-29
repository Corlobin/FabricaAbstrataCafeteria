/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20122bsi0387
 */
public class Cafe {
    private ArrayList<Ingredientes> ingredientes;
    private int preco;
    public Cafe() {
    }

    public Cafe(int preco, ArrayList<Ingredientes> ingredientes){
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        for (Ingredientes ingrediente: ingredientes) {
            st.append(ingrediente);
            st.append(" ");
        }
        return st.toString();
    }
    
    
}
