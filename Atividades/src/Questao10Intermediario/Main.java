/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao10Intermediario;

/**
 *
 * @author hazut
 */
public class Main {
    public static void main(String[] args) {
        int []m[]={{0,1,0,0},{1,1,1,1},{0,1,0,0},{0,0,0,0}};
        int cont=0,k,cidademaior=0,maior=0;
        //I
        cont=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[i][j]==1){
                    cont=0;
                break;
                }
                if(m[i][j]==0&&m[j][i]==0){
                    cont=1;
                }
            }
            if(cont==1){
                break;
            }
        }  
        if(cont==1){
            System.out.println("Existem cidades isoladas");
        }else{
            System.out.println("Não existem cidades isoladas");
        }
        //II
        cont=0;
        k=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[j][i]==1){
                    cont=0;
                break;
                }
                cont=1;
            }
            if(cont==1){
                k=i;
                break;
            }
        }
        if(k!=-1){
        for(int i=0;i<4;i++){
            if(m[k][i]==1){
            cont=1;
            break;
            }
            cont=0;
        }
        }
         if(cont==1 && k!=-1){
            System.out.println("Existem cidades que há entrada e não há saída");
        }else{
            System.out.println("Não existem cidades que há entrada e não há saída");
        }       
        //III
        cont=0;
        k=-1;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(m[i][j]==1){
                    cont=0;
                break;
                }
                cont=1;
            }
            if(cont==1){
                k=i;
                break;
            }
        }
        if(k!=-1){
            for(int i=0;i<4;i++){
                if(m[i][k]==1){
                cont=1;
                break;
                }
                cont=0;
            }
        }
         if(cont==1 && k!=-1){
            System.out.println("Existem cidades que há saída e não há entrada");
        }else{
            System.out.println("Não existem cidades que há saída e não há entrada");
        }        
        
    }
}
