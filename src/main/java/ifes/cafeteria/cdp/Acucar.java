/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.cdp;

/**
 *
 * @author Ricardo
 */
public class Acucar extends Ingredientes {

    public Acucar(int qtd) {
        this.quantidade = qtd;
    }
    @Override
    public String toString() {
        return quantidade + "g de acucar";
    }
    
    
}
