/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao1Dificil;

import java.util.Scanner;


public class TorreHanoi {
 
    // Método que realiza (imprime) o movimento
    // de um disco entre dois pinos
    private static void mover(int O, int D) {
        System.out.println(O + " -> " + D);
    }
 
    // Método que implementa a recursão
    // O = pino origem
    // D = pino destino
    // T = pino de trabalho
    static void hanoi(int n, int O, int D, int T) {
 
        if (n > 0) {
            hanoi(n - 1, O, T, D);
            mover(O, D);
            hanoi(n - 1, T, D, O);
        }
 
    }
 
    public static void main(String[] args) {
 
        int n; // número de discos
 
        // recebe o número de discos digitado pelo usuário
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número de discos: ");
        n = entrada.nextInt();
 
        // executa o hanoi!, pah, recursão
        TorreHanoi.hanoi(n, 1, 3, 2);
    }
}


