/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao7Facil;

public class Carta {
    
    private String Nome;
    private String Naipe;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getNaipe() {
        return Naipe;
    }

    public void setNaipe(String Naipe) {
        this.Naipe = Naipe;
    }
   

     public Carta(String nome, String naipe) {
        setNome(nome);
        setNaipe(naipe);
        
         }

     
     
     
}