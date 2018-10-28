/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import atividade02.Data_Teste;

/**
 *
 * @author senai
 */
public class Teste {
    public static void main(String[] args) {
        Data_Teste data = new Data_Teste(4,9,2018);
        Voo v1 = new Voo(0, data);
        v1.inicializaAcentos();
        
        System.out.println(v1.proximoLivre()+1);
        System.out.println(v1.verifica(10));
        System.out.println(v1.ocupa(3));
        System.out.println(v1.verifica(3));
        System.out.println(v1.vagas());
        System.out.println(v1.clone());
    }
}
