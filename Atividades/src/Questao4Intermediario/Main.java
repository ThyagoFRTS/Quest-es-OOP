
package Questao4Intermediario;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Func> func = new ArrayList<>();   
        
        String name;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidae de funcionários");
        int n = input.nextInt();
        int i= 0 ;
        do{
            input.nextLine();
            i++;
            Func f = new Func();
            
            System.out.println("Digite o nome:");
            name = input.nextLine();
            f.setNOME(name);
            
            System.out.println("Digite o salario");
            double sal = input.nextDouble();
            f.setSAL(sal);
            
            System.out.println("Horas extras diurnas");
            int hed = input.nextInt();
            f.setHED(hed);
            
            System.out.println("Horas extras noturnas");
            int hen = input.nextInt();
            f.setHEN(hen);
            
            System.out.println("Número de dependentes");
            int nd = input.nextInt();
            f.setND(nd);
            
            System.out.println("Faltas em horas");
            int fal = input.nextInt();
            f.setFAL(fal);
            
            System.out.println("Descontos eventuais");
            double de = input.nextDouble();
            f.setDE(de);
            
            System.out.println("Gastos com refeições na empresa");
            double ref = input.nextDouble();
            f.setREF(ref);
            
            System.out.println("Vales retirados duarante o mês");
            double val = input.nextDouble();
            f.setVAL(val);
            
                      
            func.add(f);
        }while(i<n);
        
        for (i = 0; i < func.size(); i++) {
            func.get(i).emitir_inf();
        }
        
        
        
    }
    
}
