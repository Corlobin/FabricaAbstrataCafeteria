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
public class FabricaCafeCappuccino implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe();
    }

    @Override
    public Ingredientes criarIngredientes() {
        return new Ingredientes("100g de café solúvel, 200g de açúcar, 100g lata de leite em pó, 1 colher de chá de bicarbonato, 50g de chocolate em pó e 1 colher (sobremesa) de canela");
    }

}
