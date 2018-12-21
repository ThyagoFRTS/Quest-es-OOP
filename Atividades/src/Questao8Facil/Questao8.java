package Questao8Facil;

import java.util.Scanner;

public class Questao8 {

    public static void main(String[] args) {
        int escolha = 0;
        Scanner input = new Scanner(System.in);
        double saldo;
        System.out.println("Digitar ");
        saldo = input.nextDouble();
        if (saldo>=0 && saldo<=200) {
         escolha=1;
        } else if (saldo>=0 && saldo<=400) {
            escolha=2;
        }else if(saldo>=0 && saldo<=600){
            escolha=3;
        }else if(saldo>=0){
            escolha=4;
        
        }
        

        switch (escolha) {
            case 1:
                   System.out.println("Nenhum credito");
                break;
            case 2:
                saldo= saldo*0.2;
                System.out.println("Credito "+saldo);
                break;
            case 3:
                saldo= saldo*0.3;
                System.out.println("Credito "+saldo);
                break;
            case 4:
                saldo= saldo*0.4;
                System.out.println("Credito "+saldo);
                break;
            default:
                System.out.println("Invalido");  
                break;

        }

    }

}
