/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade03;

import atividade02.Data_Teste;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author senai
 */
public class Voo {

    private int num_voo;
    private Data_Teste data;
    private int[] acentos = new int[100];
    
    public Voo(int num_voo, Data_Teste data) {
        this.num_voo = num_voo;
        this.data = data;
    }

    public int getNum_voo() {
        return num_voo;
    }

    public void inicializaAcentos() {
        for (int i = 0; i < this.acentos.length; i++) {
            this.acentos[i] = -1;
        }
    }

    public boolean verifica(int cadeira) {
        boolean res = false;
        
        if (this.acentos[cadeira] == -1){
            res = true;
        }
        return res;
    }
    
    public boolean ocupa (int cadeira){
       boolean res = verifica(cadeira);
       if(res == false){
       }else{
           this.acentos[cadeira] = 1;
       }
       return res;       
    }
    
    public int proximoLivre() {
        int acentoLivre = 0;

        for (int i = 0; i < this.acentos.length; i++) {
            if (this.acentos[i] == -1) {
                return i;
            }
        }
        
        return acentoLivre;
    }
    public int vagas (){
        int j =0;
           for (int i = 0; i < this.acentos.length; i++) {
            if (verifica(i) == true) {
                j++;
            }
        } 
        return j;
    }
    
    public Voo clone(){
        Data_Teste data = new Data_Teste(this.data.getDia(), this.data.getMes(), this.data.getAno());
        Voo v2 = new Voo(this.num_voo, data);
        v2.setAcentos(this.acentos);
        
        return v2;
    }
    public void setNum_voo(int num_voo) {
        this.num_voo = num_voo;
    }

    public Data_Teste getData() {
        return data;
    }

    public void setData(Data_Teste data) {
        this.data = data;
    }

    public int[] getAcentos() {
        return acentos;
    }

    public void setAcentos(int[] acentos) {
        this.acentos = acentos;
    }


}
