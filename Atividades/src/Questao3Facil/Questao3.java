/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Facil;

/**
 *
 * @author hazut
 */
public class Questao3 {

    public static void main(String[] args) {
    double b=10.5,h=50.0,r=10;
    Quadrado quadrado = new Quadrado();
    Triangulo triangulo = new Triangulo();
    Circulo circulo = new Circulo();
    Retangulo retangulo = new Retangulo();
    
        System.out.println("Area quadrado "+quadrado.calc_area(b, b));
        System.out.println("Area triangulo "+triangulo.calc_area_triangulo(b, h));
        System.out.println("Area retangulo "+retangulo.calc_area(b, h));
        System.out.println("Area circulo "+circulo.calc_area(r));
    
    
    }   
}
