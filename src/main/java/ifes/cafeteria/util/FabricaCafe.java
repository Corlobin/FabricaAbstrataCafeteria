/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;
import java.util.HashMap;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaCafe {
    private static HashMap<String, Fabrica> dias;
    private FabricaCafe(){
        dias.put("segunda-feira", new FabricaCafeNormalPromocao());
        dias.put("quarta-feira", new FabricaCafeNormalPromocao());
        dias.put("sexta-feira", new FabricaCafeNormalPromocao());
        
        dias.put("terça-feira", new FabricaCafeSemCafeinaPromocao());
        dias.put("quinta-feira", new FabricaCafeSemCafeinaPromocao());
        dias.put("sábado", new FabricaCafeSemCafeinaPromocao());
        
        dias.put("domingo", new FabricaCafeCappuccinoPromocao());
    }
    public static Cafe criarCafe(String dia) {
        Fabrica fabrica;
        
        /*if(nome.equals("normal")) {
            fabrica = new FabricaCafeNormal();
        }else if(nome.equals("sem cafeína")) {
            fabrica = new FabricaCafeSemCafeina();            
        }else {
            fabrica = new FabricaCafeCappuccino();                        
        }*/
        fabrica = dias.get(dia);
         
        Cafe cafe = fabrica.criarCafe();
        cafe.setIngredientes(fabrica.criarIngredientes());
        
        return cafe;
        
    }
}
