/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca01;

import atividade02.Data_Teste;
import atividade03.Voo;

/**
 *
 * @author senai
 */
public class Teste {

    public static void main(String[] args) {
        Data_Teste data = new Data_Teste(10, 10, 2018);
        VooDois v1 = new VooDois(5, data, 8, 10);
        
//        for(int i = 0; i < v1.getNum_vagas().length; i++){
//            v1.ocupa(i+1);
//        }
        
        v1.print();
        
    }

}
