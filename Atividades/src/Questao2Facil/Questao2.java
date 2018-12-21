
package Questao2Facil;
import java.util.Scanner;
/**
 *
 * @author hazut
 */
public class Questao2 {
    
    public static void main(String[] args) {
        int controle,idad;
        String nome;
        Scanner input = new Scanner(System.in);
        Pessoa temp = new Pessoa();
        System.out.println("(qualquer numero inteiro)-Adicionar\n2-Sair");
        controle=input.nextInt();
        input.nextLine();
        
        while(controle!=2){
            
            System.out.println("Digitar nome");
            temp.nome=input.nextLine();
            System.out.println("Digitar idade");
            temp.idade=input.nextInt();
            temp.pai= new Pessoa();
            System.out.println("Digitar nome pai");
            input.nextLine();
            temp.pai.nome=input.nextLine();
            temp.mae= new Pessoa();
            System.out.println("Digitar nome mae");
            temp.mae.nome=input.nextLine();
            
            System.out.println("(qualquer numero inteiro)-Adicionar\n2-Sair");
            
            controle=input.nextInt();
            input.nextLine();
        }
        
    }
    
}
