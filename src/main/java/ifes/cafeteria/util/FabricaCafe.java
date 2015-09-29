/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaCafe {
    public static Cafe criarCafe(String nome) {
        Fabrica fabrica;
        
        if(nome.equals("normal")) {
            fabrica = new FabricaCafeNormal();
        }else if(nome.equals("sem cafeína")) {
            fabrica = new FabricaCafeSemCafeina();            
        }else {
            fabrica = new FabricaCafeCappuccino();                        
        }
        
        Cafe cafe = fabrica.criarCafe();
        cafe.setIngredientes(fabrica.criarIngredientes());
        return cafe;
    }
}
