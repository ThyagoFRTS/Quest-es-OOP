
package Questao7Facil;

import java.util.Scanner;
import java.lang.Math; 

public class Main {

  
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       
        int max=52;
        Carta[] cartas= new Carta[max];
        int i=0,j=0,k=0;
       String[] Nome = { "As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
       String[] Naipe = {"Paus", "Copas", "Espadas", "Ouros","Coringa"}; 
 
          for(i=0;i<5;i++){
          
           for(j=0;j<13;j++){
        
                    if(k>=48 && k<52){
            
        
            cartas[48] = new Carta("C",  Naipe[i]); 
            cartas[49] = new Carta("C",  Naipe[i]); 
            cartas[50] = new Carta("C",  Naipe[i]); 
            cartas[51] = new Carta("C",  Naipe[i]); 
   
        }else{  
           
             
            cartas[k] = new Carta(Nome[j],  Naipe[i]);   
        k++;
         
          
                    }
                   
           }} 
   

           
            
            System.out.println(cartas.length);
            
        
        
        int op=0;
        
       while(op!=5){ 
           
       System.out.println("1-Embaralhar\n2-Retirar a carta do Topo\n3-Procurar Carta\n4-ImprimirBaralho\n5-Sair ");
       op=input.nextInt();
               switch (op){
        
            case 1: 
             embaralhar(cartas);
        break;
         
            case 2:
      cartas=retiratop(cartas,max);
      max=max-1;
       System.out.println("Carta reirada do topo,quantidade atual: "+cartas.length);
           break;
            case 3:
                  System.out.println("Digite o nome: \n");
       String nome=input.next();
       
        System.out.println("\n Naipe da carta: ");
        String naipe=input.next(); 
        
           k=procurar(cartas,nome,naipe);   
           if(k==0){
               System.out.println("Carta não enncontrada no Baralho");
               
           }
               break;
            case 4:
                
        imprimir(cartas);
    break;
    }
}}
public static void imprimir(Carta[] c){ 
    int i=0;
         
         for(i=0;i<c.length;i++){
        System.out.println("Carta: "+c[i].getNome()+" Naipe: "+c[i].getNaipe());

}}
 public static void embaralhar(Carta[] cartas) {
        for (int i = 0; i < cartas.length; i++) {
            Carta temp = cartas[i];
            int tempi = (int) (Math.random() * cartas.length);
            cartas[i] = cartas[tempi];
            cartas[tempi] = temp;
            
              
        }
        imprimir(cartas);
   }
public static int procurar(Carta[] cartas,String nome,String Naipe){
     for (int i = 0; i < cartas.length; i++) {
         if(cartas[i].getNome().compareTo(nome)==0){
             if(cartas[i].getNaipe().compareTo(Naipe)==0){
                 System.out.println("CARTA ENCONTRADA NO BARALHO NA POSIÇÃO "+i);
               return 1;  
             }
         }
     }
  return 0;  
}
public static Carta[] retiratop(Carta[] c,int max){
    
      Carta[] vetorAux = new Carta[c.length-1];
       int index = 0;
          for(int i = 0; i <c.length-1; i++){
              
              vetorAux[index] = new Carta(c[i].getNome(),c[i].getNaipe());
            
          index++;
          }
         
       
       
 
 
 
return vetorAux;
}
}
