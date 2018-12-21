
package Questao2Intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []tabuleiro[]= new int[8][8];
        int i,j;
        for(i=0;i<3;i++){
            for(j=0;j<8;j++){
                if(j%2==0 && i%2==0 || j%2!=0 && i%2!=0){
                    tabuleiro[i][j]=0;
                }else{
                    tabuleiro[i][j]=-1;
                }
            }
        }
        for(i=3;i<5;i++){
            for(j=0;j<8;j++){
                tabuleiro[i][j]=0;               
            }
        }        
        for(i=5;i<8;i++){
            for(j=0;j<8;j++){
                if(j%2==0 && i%2==0 || j%2!=0 && i%2!=0){
                    tabuleiro[i][j]=0;
                }else{
                    tabuleiro[i][j]=1;
                }               
            }
        }
        for(i=0;i<8;i++){
            for(j=0;j<8;j++){
                System.out.printf("[%d] ", tabuleiro[i][j]);
        }        
        System.out.println("");
    }
        
    //LETRA A (OBS: não printei a matriz depois desta parte, só decomentar se quiser ver)

    i=3;j=0;
    tabuleiro[i][j]=-1;
    tabuleiro[4][1]=0;
    tabuleiro[5][2]=0;

    /*
        for(i=0;i<8;i++){
            for(j=0;j<8;j++){
                System.out.printf("[%d] ", tabuleiro[i][j]);
        }        
        System.out.println("");
    }    
    i=3;j=0;
    
    */

    
    if(tabuleiro[i][j]==-1 && i+2<8 ){
        if(j+2<8 && tabuleiro[i+1][j+1]==1 && tabuleiro[i+2][j+2]==0){
            System.out.printf("Peça [%d][%d] pode tomar a peça [%d][%d]%n",i,j,i+1,j+1);
        }else if(j-2>-1 && tabuleiro[i-1][j-1]==1 && tabuleiro[i-2][j-2]==0){
            System.out.printf("Peça [%d][%d] pode tomar a peça [%d][%d]%n",i,j,i-1,j-1);
        }else{
            System.out.printf("Peça [%d][%d] não pode tomar peças%n",i,j);
        }
    }
    
    //LETRA B E C
    if(tabuleiro[i][j]==-1 && i+2<8 ){
        if(j+2<8 && tabuleiro[i+1][j+1]==0){
            System.out.printf("Peça [%d][%d] pode mover [%d][%d]%n",i,j,i+1,j+1);
        }else if(j-2>-1 && tabuleiro[i-1][j-1]==0 ){
            System.out.printf("Peça [%d][%d] pode mover para [%d][%d]%n",i,j,i-1,j-1);
        }else{
            System.out.printf("Peça [%d][%d] não pode se moover%n",i,j);
        }
    }    
    
}
}
