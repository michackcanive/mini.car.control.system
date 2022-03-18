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
public class Carro {
    String nomeOrganizacao;
    String marcaAutomovel;
    String matricula;
    String anoDefabrico;
    String tipoDeconbustival;
    String nomeDousuario;
    String preco;
    String data;
    String hora;

    public Carro(String nomeOrganizacao, String marcaAutomovel, String matrucula, String anoDefabrico, String tipoDeconbustival, String nomeDousuario, String preco, String data, String hora) {
        this.nomeOrganizacao = nomeOrganizacao;
        this.marcaAutomovel = marcaAutomovel;
        this.matricula = matrucula;
        this.anoDefabrico = anoDefabrico;
        this.tipoDeconbustival = tipoDeconbustival;
        this.nomeDousuario = nomeDousuario;
        this.preco = preco;
        this.data = data;
        this.hora = hora;
    }

    public void setNomeOrganizacao(String nomeOrganizacao) {
        this.nomeOrganizacao = nomeOrganizacao;
    }

    public void setMarcaAutomovel(String marcaAutomovel) {
        this.marcaAutomovel = marcaAutomovel;
    }

    public void setMatricula(String matrucula) {
        this.matricula = matrucula;
    }

    public void setAnoDefabrico(String anoDefabrico) {
        this.anoDefabrico = anoDefabrico;
    }

    public void setTipoDeconbustival(String tipoDeconbustival) {
        this.tipoDeconbustival = tipoDeconbustival;
    }

    public void setNomeDousuario(String nomeDousuario) {
        this.nomeDousuario = nomeDousuario;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getNomeOrganizacao() {
        return nomeOrganizacao;
    }

    public String getMarcaAutomovel() {
        return marcaAutomovel;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getAnoDefabrico() {
        return anoDefabrico;
    }

    public String getTipoDeconbustival() {
        return tipoDeconbustival;
    }

    public String getNomeDousuario() {
        return nomeDousuario;
    }

    public String getPreco() {
        return preco;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }
    
    
    public Carro(){
    
    }
    
    
   
    
}

