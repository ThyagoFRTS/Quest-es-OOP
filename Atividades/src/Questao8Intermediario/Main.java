/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao8Intermediario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] m[] = {{0, 1, 0, 0}, {1, 1, 1, 1}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int cont = 0, k, cidademaior = 0, maior = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (m[i][j] != 0) {
                    cont++;
                }
            }
            if (cont > maior) {
                maior = cont;
                cidademaior = i;
            }
        }
        System.out.println("Cidade: " + cidademaior);
    }

}
