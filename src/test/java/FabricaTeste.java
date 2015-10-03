/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ifes.cafeteria.cdp.Agua;
import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.cdp.Ingredientes;
import ifes.cafeteria.cdp.Leite;
import ifes.cafeteria.cdp.LeiteEmPo;
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
        Cafe cafe = FabricaCafe.criarCafe("segunda-feira");
        assertEquals(cafe.getPreco(), 2);        
    }
    @Test
    public void TesteCafeSemCafeina() {    
        Cafe cafe = FabricaCafe.criarCafe("sábado");
        assertEquals(cafe.getPreco(), 3);        
    }
   @Test
    public void TesteLeite() {    
        Leite leite = new LeiteEmPo(2);
        assertEquals(leite.getQuantidade(), 3);        
    }
   @Test
    public void TesteAgua() {    
        Ingredientes agua = new Agua(100);
        assertEquals(agua.getQuantidade(), 100);        
    }

}
