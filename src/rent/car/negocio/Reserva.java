/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rent.car.negocio;

/**
 *
 * @author PC
 */
public class Reserva {
    String nome_carro;
    String matricula_carro;
    String tempo_carro;

    public Reserva(String nome_carro, String matricula_carro,String tempo_carro) {
        this.nome_carro = nome_carro;
        this.matricula_carro = matricula_carro;
        this.tempo_carro = tempo_carro;
    }
    
    public Reserva() {
        
    }

    public void setNome_carro(String nome_carro) {
        this.nome_carro = nome_carro;
    }
    
    public void setTempo_carro(String tempo_carro) {
        this.tempo_carro = tempo_carro;
    }

    public void setMatricula_carro(String matricula_carro) {
        this.matricula_carro = matricula_carro;
    }
    public String getTempo_carro() {
        return tempo_carro;
    }
    public String getNome_carro() {
        return nome_carro;
    }

    public String getMatricula_carro() {
        return matricula_carro;
    }
   
}
