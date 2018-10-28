/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.time.LocalDate;

/**
 *
 * @author senai
 */
public class Teste {
    public static void main(String[] args) {
        
        Data_Teste data = new Data_Teste(04,9,-21);
        LocalDate ldate = LocalDate.of(data.getAno(), data.getMes(), data.getDia());
        
        System.out.println("A qual data é maior? "+data.compara(ldate));
        System.out.println("O ano é bissexto? "+data.isBissexto(ldate));
        System.out.println("Primeira data: " + data.getLdata() + " Segunda data: " + data.clone(data));
        System.out.println(data.getMesExtenso());
        
    }
}
