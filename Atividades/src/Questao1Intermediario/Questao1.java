/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1Intermediario;

/**
 *
 * @author hazut
 */
public class Questao1 {

    public static void main(String[] args) {
        int cont = 0, k, cont2 = 0, l, auxi=0, i = 0, j = 0;
        int[] mat[] = {{0, -1, 0, -1, -1, 0, -1, 0}, {0, 0, 0, 0, -1, 0, 0, 0}, {0, 0, -1, -1, 0, 0, -1, 0}, {-1, 0, 0, 0, 0, -1, 0, 0}, {0, 0, -1, 0, 0, 0, -1, -1}};

        for (i = 0; i < 5; i++) {

            for (j = 0; j < 8; j++) {

                if (mat[i][j] != -1) {
                    k = j;
                    cont = 0;

                    while (k != 8 && mat[i][k] != -1) {
                        cont++;
                        k++;

                    }
                    if (cont >= 2) {
                        mat[i][j] = cont;
                    }
                    j = j + cont;


                }
            }

        }
 
        
        for (j = 0; j < 8; j++) {

            for (i = 0; i < 5; i++) {

                if (mat[i][j] != -1) {
                    k = i;
                    cont = 0;

                    while (k != 5 && mat[k][j] != -1) {
                        cont++;
                        k++;

                    }
                    if (cont >= 2) {
                        mat[i][j] = cont;
                    }
                    i = i + cont;


                }
            }

        }
        
        
        
        
        
        for (i = 0; i < 5; i++) {
            for (j = 0; j < 8; j++) {
                if(mat[i][j]>0){
                auxi++;
                mat[i][j]=auxi;
                }
                System.out.print(mat[i][j] + "| |");

            }
            System.out.println(" ");
        }
        System.out.println("Numero de palavras "+auxi);
    }

}
