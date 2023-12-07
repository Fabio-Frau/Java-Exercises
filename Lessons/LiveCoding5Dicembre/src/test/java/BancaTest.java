import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class BancaTest {


        ContoBancario cb1 = new ContoBancario("blabla", BigDecimal.valueOf(1000));
        ContoBancario cb2 = new ContoBancario("12345", BigDecimal.valueOf(90000));
        ContoBancario cb3 = new ContoBancario("9999", BigDecimal.valueOf(30000));

        Banca banca = new Banca("Bancamia", new ArrayList<ContoBancario>(List.of(cb1)),2);




    @org.junit.Test
    public void aggiungiContoOk() {
        ArrayList<ContoBancario> contiNuovi =  banca.aggiungiConto(cb2);
        Assert.assertEquals(2,contiNuovi.size());
    }

    @org.junit.Test
    public void aggiungiContoNoSpazio() {
        ArrayList<ContoBancario> conti = banca.aggiungiConto(cb3);
        conti =  banca.aggiungiConto(cb3);
        Assert.assertNull(conti);
    }

    @org.junit.Test
    public void saldoTotale() {
        Assert.assertEquals(BigDecimal.valueOf(1000), banca.saldoTotale());
    }
}