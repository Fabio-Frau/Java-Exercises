import Esempio.*;
import org.junit.jupiter.api.BeforeEach;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.EnumSet;


class PasticceriaTest {

 @BeforeEach
 void init() {
      Dolce d = new Dolce("dolcetto", BigDecimal.TEN, TipoDolce.TORTA);
      DolceInventario di = new DolceInventario(d,30);
      ArrayList<DolceInventario> prova = new ArrayList<DolceInventario>();
      prova.add(di);
 }








 @org.junit.jupiter.api.Test
 void rimuoviDolce() {


 }

 @org.junit.jupiter.api.Test
 void aggiungiDolce() {
 }

 @org.junit.jupiter.api.Test
 void calcolaVenditeTotale() {
 }

 @org.junit.jupiter.api.Test
 void stampaInventario() {
 }
}