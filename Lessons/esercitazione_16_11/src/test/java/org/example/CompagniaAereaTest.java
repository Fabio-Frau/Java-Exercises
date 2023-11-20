package org.example;

import org.example.domain.Aeromobile;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class CompagniaAereaTest {

    DataUtils du = new DataUtils();
    CompagniaAerea ca = new CompagniaAerea(du.aeromobili, du.biglietti);

    @Test
    public void testCercaVolo() {
        ArrayList<Aeromobile> risultato = ca.cercaVolo("Napoli", "Milano");
        assertEquals(1, risultato.size());
        assertEquals(du.a1, risultato.get(0));
    }

    @Test
    public void testCercaVoloWithNullValues() {
        ArrayList<Aeromobile> risultato = ca.cercaVolo(null, null);
        assertTrue(risultato.isEmpty());
    }

    @Test
    public void testCercaVoloWithEmptyFields() {
        ArrayList<Aeromobile> risultato = ca.cercaVolo("", "");
        assertEquals(0, risultato.size());
    }

    @Test
    public void testCercaVoloWithBlankFields() {
        ArrayList<Aeromobile> risultato = ca.cercaVolo(" ", " ");
        assertEquals(0, risultato.size());
    }

    @Test
    public void testverificaDisponibilita() {
        Boolean risultato = ca.verificaDisponibilita(du.a1);
        assertTrue(risultato);
    }

    @Test
    public void testConteggioVenduti() {
        int risultato = ca.conteggioVenduti(du.a1);
        assertEquals(2, risultato);
    }
}
