/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.cdp.Ingredientes;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaCafeNormal implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe();
    }

    @Override
    public Ingredientes criarIngredientes() {
        return new Ingredientes("50 g de café solúvel, 2 xícaras de açúcar, 1 xícara de leite com 100 ml");
    }

}
