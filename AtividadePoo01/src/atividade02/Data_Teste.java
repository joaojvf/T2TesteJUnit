/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade02;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author senai
 */
public class Data_Teste {
    private int dia;
    private int mes;
    private int ano;
    private LocalDate ldata;
    
    public Data_Teste(int dia, int mes, int ano) {
        
        if(dia > 31 || dia < 1){
            dia = 01;
        }
        
        if(mes > 12 || mes < 1){
            mes = 01;
        }
        
        if(ano < 0){
            ano = 0001;
        }
        
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.ldata = LocalDate.of(ano, mes, dia);       
        
    }

    public int getDia() {
        
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public int compara(LocalDate data){
        int res = -999;
        
        LocalDate data_atual = LocalDate.now();
        res = data.compareTo(data_atual);    
        
        if(data.compareTo(data_atual) == 0){
           res = 0; 
        }else if(data.compareTo(data_atual) > 0){
            res = -1;
        }else{
            res = 1;
        }
        return res;
    }

    public LocalDate getLdata() {
        return ldata;
    }

    public void setLdata(LocalDate ldata) {
        this.ldata = ldata;
    }
    
    public boolean isBissexto(LocalDate data){
        boolean res = false;
            if(data.getYear() % 400 == 0 || data.getYear() % 4 == 0 && data.getYear() %100 != 0){
                res = true;
            }        
        return res;
    }
    
    public LocalDate clone (Data_Teste data){
        LocalDate novaData = LocalDate.of(data.getAno(), data.getMes(), data.getDia());
        return novaData;
    }
    
    public Month getMesExtenso(){
        
        Month mesExtenso = null;
        mesExtenso = this.ldata.getMonth();
        
        return mesExtenso;
    }
    
}
