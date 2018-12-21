
package Questao9Facil;

import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    double custo_fabrica,per_distribuidor,perc_impostos;
        System.out.println("Digitar custo de fabrica");
        custo_fabrica = input.nextDouble();
        custo_fabrica= custo_fabrica+custo_fabrica*0.28+custo_fabrica*0.45;
        System.out.println("Custo "+custo_fabrica);
    }
    
}
