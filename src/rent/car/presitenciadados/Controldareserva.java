/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.car.presitenciadados;

import java.util.ArrayList;
import rent.car.negocio.Reserva;

/**
 *
 * @author PC
 */
public class Controldareserva {
    
        private final ArrayList <Reserva> Carro_reservado =new ArrayList<>();
     
        public boolean alugar_carro(Reserva c){
        if(c!=null){
            Carro_reservado.add(c);
            return true;
        }else{
         return false;
        }
    }
     public boolean devolver_carro(Reserva c, int index){
        if(c!=null){
            
            Carro_reservado.remove(index);
            return true;
        }else{
         return false;
        }
    }

    
    public ArrayList <Reserva> retonaTodos(){return Carro_reservado;}
    
}
