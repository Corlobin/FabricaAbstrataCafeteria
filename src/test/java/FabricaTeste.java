/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.util.FabricaCafe;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Ricardo
 */
public class FabricaTeste {
    
    public FabricaTeste() {
    }
    
    @Test
    public void TesteCafeNormal() {    
        Cafe cafe = new Cafe();
        cafe = FabricaCafe.criarCafe("normal");
        assertEquals(cafe.getIngredientes().contem("açúcar"), true);    
    }
    @Test
    public void TesteCafeCapuccino(){
        Cafe cafe = new Cafe();
        cafe = FabricaCafe.criarCafe("cappuccino");
        assertEquals(cafe.getIngredientes().contem("chocolate em pó"), false);    
        
    }
}
