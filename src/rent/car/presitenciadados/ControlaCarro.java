/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.car.presitenciadados;

import java.util.ArrayList;
import rent.car.negocio.Carro;

/**
 *
 * @author PC
 */
public class ControlaCarro {
    private ArrayList <Carro> carros=new ArrayList<>();
    
    public boolean cadastrar(Carro c){
        if(c!=null){
            carros.add(c);
            return true;
        }else{
         return false;
        }
    }
    public ArrayList <Carro> retonaTodos(){return carros;}
    
}
