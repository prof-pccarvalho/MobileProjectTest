package br.com.chronosAcademy.logica;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicaTest {

    Logica  logica = new Logica();
    @Test
    public void validaTerrenoGrande() {

        assertEquals("Terreno Grande", logica.getTipoTerreno(101));
        System.out.println("Teste Positivo com Sucesso");
    }

    @Test
    public void validaTerrenoPequeno() {
        assertEquals("Terreno Pequeno", logica.getTipoTerreno(99));
        System.out.println("Teste Negativo com Sucesso");
    }

}