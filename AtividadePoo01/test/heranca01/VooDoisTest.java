/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca01;

import atividade02.Data_Teste;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author joaov
 */
public class VooDoisTest {

    //Cria os objetos para realizar o teste
    private Data_Teste dataV1;
    private Data_Teste dataV2;
    private VooDois v1;
    private VooDois v2;

    public VooDoisTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    //Quando o teste for ser executado os seguintes objetos serão instanciados
    @Before
    public void setUp() {
        dataV1 = new Data_Teste(27, 10, 2018);
        v1 = new VooDois(001, dataV1, 50, 100);

        dataV2 = new Data_Teste(4, 9, 2018);
        v2 = new VooDois(002, dataV2, 80, 100);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of tipo method, of class VooDois.
     */
    @Test
    public void testTipoFumante() {
        assertEquals("Fumante", v2.tipo(10));
        assertEquals("Geral", v2.tipo(81));
    }

    @Test
    public void testTipoGeral() {
        assertEquals("Geral", v2.tipo(81));
    }

    @Test
    public void testTipoOcupada() {
        v2.ocupa(10);
        assertEquals("Ocupada", v2.tipo(10));
    }

    @Test
    public void testOcupaTodosOcupados() {
        for (int i = 0; i < v1.getNum_vagas().length; i++) {
            v1.ocupa(i + 1);
        }
        assertEquals(false, v1.ocupa(1)); //Inserir em posicao ocupada.
    }

    @Test
    public void testOcupaAlgunsLivres() {
        for (int i = 0; i <= 10; i++) {
            v1.ocupa(i + 1);
        }
        assertEquals(true, v1.ocupa(40)); //Inserir em posicao vaga.
    }

    @Test
    public void testProximoLivreTodosOcupados() {
        for (int i = 0; i < v1.getNum_vagas().length; i++) {
            v1.ocupa(i + 1);
        }
        assertEquals(-1, v1.proximoLivre()); //todos ocupados
    }

    @Test
    public void testPrimeiroLivre() {

        assertEquals(1, v2.proximoLivre()); // primeira posicao livre
    }
    
    @Test
    public void testOcupaPosicaoInexistente() {
        assertEquals(false,v2.ocupa(999));
    }

}
