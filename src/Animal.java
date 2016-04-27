/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elsro
 */
public class Animal {
    
    private String nome;
    
    private String especie;
    
    private Float peso;
    
    public Animal () { }
    


public Animal(String nome, String especie, Float peso) {
    this.nome = nome;
    this.especie = especie;
    this.peso = peso;



}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }


}
