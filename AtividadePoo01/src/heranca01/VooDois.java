/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca01;

import atividade02.Data_Teste;
import atividade03.Voo;

public class VooDois extends Voo {

    private int num_vagas[];
    private int num_vagas_fum;

    public VooDois(int num_voo, Data_Teste data, int num_vagas_fum, int max_vagas) {
        super(num_voo, data);
        this.num_vagas_fum = num_vagas_fum;
        maxVagas(max_vagas);
        inicializaAcentos();

    }

    public void maxVagas(int i) {
        int[] vagas = new int[i];
        this.num_vagas = vagas;
    }

    //inicializa acentos
    public void inicializaAcentos() {
        for (int j = 0; j < this.num_vagas.length; j++) {
            if (j < this.num_vagas_fum) { //as primeiras cadeiras serão destinadas a fumantes
                this.num_vagas[j] = 1; //representa que é uma cadeira destinada a fumantes destinada
            } else {
                this.num_vagas[j] = 2; //representa que é uma cadeira destinada ao publico geral destinada
            }
        }
    }

    //recebe uma cadeira e verifica se ela está disponível.
    public boolean verifica(int cadeira) {
        if (this.validaTamanho(cadeira)) {
            return (this.num_vagas[cadeira] == 1 || this.num_vagas[cadeira] == 2) ? true : false;
        } else {
            System.out.println("POSICAO INEXISTENTE!");
            return false;
        }
    }

    //ocupa uma cadeira vazia
    public boolean ocupa(int cadeira) {
        cadeira --;
        
        boolean res = verifica(cadeira);
        if (res) {
            this.num_vagas[cadeira] = 0; //Se a posição estiver marcado como 0 significa que está ocupado
        }
        return res;
    }

//recebe uma cadeira e verifica se ela é destinada para fumante ou não
    public String tipo(int cadeira) {
        cadeira--;
        if (this.validaTamanho(cadeira)) {
            if (this.num_vagas[cadeira] == 1) {
                return "Fumante";
            } else if (this.num_vagas[cadeira] == 2) {
                return "Geral";
            } else if (this.num_vagas[cadeira] == 0) {
                return "Ocupada";
            } else {
                return "ERRO AO ACESSAR TIPO.";
            }
        } else {
            return "Número Inválido!!!";
        }
    }

    public boolean validaTamanho(int num) {
        return (num < this.num_vagas.length && num >= 0) ? true : false;
    }

    //verifica o primeiro acento livre
    public int proximoLivre() {

        for (int i = 0; i < this.num_vagas.length; i++) {
            if (this.num_vagas[i] == 1 || this.num_vagas[i] == 2) {
                return i + 1;
            }
        }

        return -1;
    }

    public int[] getNum_vagas() {
        return num_vagas;
    }

    public void setNum_vagas(int[] num_vagas) {
        this.num_vagas = num_vagas;
    }

    public int getNum_vagas_fum() {
        return num_vagas_fum;
    }

    public void setNum_vagas_fum(int num_vagas_fum) {
        this.num_vagas_fum = num_vagas_fum;
    }

    public void print() {
        for (int i = 0; i < this.num_vagas.length; i++) {
            System.out.println("\tCadeira: " + (i + 1)
                    + "\tTipo: " + this.num_vagas[i]);
        }
    }

}
