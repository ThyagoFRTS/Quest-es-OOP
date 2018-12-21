/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao6Facil;

/**
 *
 * @author hazut
 */
public class Questao6 { 

  public int numNegativos(int vet[]){
   int cont=0;
  for(int i=0;i<vet.length;i++){
  if(Integer.signum(vet[i])==-1){
      cont++;
  }
  
  }  
   return cont;
}       

}