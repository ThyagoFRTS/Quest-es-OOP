/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao10Facil;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        ComparaNumero a = new ComparaNumero();
        Scanner input = new Scanner(System.in);
        double x,y;
        System.out.println("Digitar um numero");
        x=input.nextDouble();
        System.out.println("Digitar um numero");
        y=input.nextDouble();
        a.comparaNumero(  x  , y);

        
    }
    
}
