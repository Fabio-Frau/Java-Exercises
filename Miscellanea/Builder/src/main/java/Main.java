public class Main {

    //Negozio negozio = new Negozio(2345, "Pinco Pallo", "Via Roma 1, Cagliari", false);
    Negozio negozio = new Negozio.Builder(2345)
            .setProprietario("pinco pallo")
            .setIndirizzo("via roma")
            .setInCentroCommerciale(false)
            .build();

}
