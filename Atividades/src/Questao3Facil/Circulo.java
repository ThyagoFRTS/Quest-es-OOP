/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questao3Facil;

import Questao3Facil.Poligonos;

/**
 *
 * @author hazut
 */
public class Circulo extends Poligonos{
    public double calc_area(double raio){
    this.area= raio * raio * 3.14159;
    return this.area;
    }
}
