/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4Facil;
import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        Scanner input = new Scanner(System.in);
        int quanti;
        double soma=0,media;
        System.out.println("Entre com a quantidade de alunos para a operacao");
        quanti=input.nextInt();
        
        Aluno []vet = new Aluno[quanti];
        for(int i=0;i<quanti;i++){
        vet[i].nome= input.nextLine();
        vet[i].nota= input.nextInt();
        input.nextLine();
        soma+=vet[i].nota;
        }
        media=soma/quanti;
        System.out.println("Media :"+media+"\nAlunos acima da media:");
        for(int i=0;i<quanti;i++){
            if(vet[i].nota>media){
                System.out.println(vet[i].nome);
            }
        }        
        
        
    }
}
