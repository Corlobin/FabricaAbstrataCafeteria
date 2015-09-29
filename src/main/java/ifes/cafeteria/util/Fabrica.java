/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.cdp.Ingredientes;
import java.util.ArrayList;


/**
 *
 * @author 20122bsi0387
 */
public interface Fabrica {
    public Cafe criarCafe();
    public ArrayList<Ingredientes> criarIngredientes();
}
