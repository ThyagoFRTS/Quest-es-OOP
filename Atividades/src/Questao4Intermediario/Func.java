/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao4Intermediario;

/**
 *
 * @author wesley
 */
public class Func {
    String NOME;
    double SAL;
    int HED;
    int HEN;
    int ND;
    int FAL;
    double DE;
    double REF;
    double VAL;
    
   
    
    public void emitir_inf(){
        System.out.println("--Dados--");
        System.out.println("Nome: " + this.NOME);
        System.out.println("Salario: R$ "+ this.SAL);
        int hr_ex = (int) (((this.HED * this.SAL)/160)+((this.HEN * 1.2 * this.SAL)/160));
        System.out.println("Horas Extras R$ " + hr_ex);
        double sal_f = this.ND * 0.05 * 960;
        System.out.println("Salário Família: R$ "+ sal_f);
        double sal_br = this.SAL + hr_ex + sal_f;
        System.out.println("Salário Bruto: R$ "+ sal_br);
        System.out.println("\n");
        
        System.out.println("--Descontos Efetuados--");
        
        double inamps = 0.08 * this.SAL;
        System.out.println("INAMPS: R$ "+inamps);
        double faltas = this.FAL * (this.SAL/160);
        System.out.println("Faltas: R$ "+ faltas);
        System.out.println("Refeições: R$ "+ this.REF);
        System.out.println("Vale: R$"+ this.VAL);
        System.out.println("Descontos Eventuais: R$"+ this.DE);
        double ir = 0.08 * this.SAL;
        System.out.println("Imposto de renda: R$ "+ ir);
        double des_total = inamps + faltas + this.REF + this.VAL + this.DE + ir;
        System.out.println("\n");
        double sal_li = sal_br - des_total;
        System.out.println("Salário Líquido: R$ "+sal_li);
        System.out.println("------------------------------------------------------------------");
    }

    public String getNOME() {
        return NOME;
    }

    public void setNOME(String NOME) {
        this.NOME = NOME;
    }

    public double getSAL() {
        return SAL;
    }

    public void setSAL(double SAL) {
        this.SAL = SAL;
    }

    public int getHED() {
        return HED;
    }

    public void setHED(int HED) {
        this.HED = HED;
    }

    public int getHEN() {
        return HEN;
    }

    public void setHEN(int HEN) {
        this.HEN = HEN;
    }

    public int getND() {
        return ND;
    }

    public void setND(int ND) {
        this.ND = ND;
    }

    public int getFAL() {
        return FAL;
    }

    public void setFAL(int FAL) {
        this.FAL = FAL;
    }

    public double getDE() {
        return DE;
    }

    public void setDE(double DE) {
        this.DE = DE;
    }

    public double getREF() {
        return REF;
    }

    public void setREF(double REF) {
        this.REF = REF;
    }

    public double getVAL() {
        return VAL;
    }

    public void setVAL(double VAL) {
        this.VAL = VAL;
    }
   


    
    
}
