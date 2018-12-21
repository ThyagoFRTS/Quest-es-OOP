/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao9Intermediario;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int []m[]={{0,1,0,0},{1,1,1,1},{0,1,0,0},{0,0,0,0}};
        int cont=0,k,cidademaior=0,maior=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o numero da cidade\n0<c=idade<4");
        k=input.nextInt();
        cont=0;
        for(int i=0;i<4;i++){
            if(m[k][i]!=m[i][k]){
                cont=-1;
                break;
            }
        }
        
        if(cont!=0){
            System.out.println("Todas as entradas não são de via dupla");
        }else{
            System.out.println("Todas as entradas são de via dupla");
        }        
    }
    
}
