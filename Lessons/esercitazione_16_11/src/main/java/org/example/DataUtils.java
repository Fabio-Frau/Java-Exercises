package org.example;

import org.example.domain.*;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class DataUtils {
    Aereo a1 = new Aereo(
            "000000001",
            "Boing777",
            10,
            2,
            800,
            "km/h",
            "nero",
            ClassType.LUXURY
    );

    Aereo a2 = new Aereo(
            "000000002",
            "Boing737",
            50,
            2,
            800,
            "km/h",
            "viola",
            ClassType.BUSINESS
    );

    Aereo a3 = new Aereo(
            "000000003",
            "Boing747",
            80,
            2,
            800,
            "km/h",
            "rosso",
            ClassType.ECONOMY
    );

    Passeggero p1 = new Passeggero(
            "0001",
            "Antonio",
            "Iovine",
            "Az12634",
            TipoDocumento.CARTA_IDENTITA,
            "prova@stamail.co"
    );

    Biglietto b1 = new Biglietto(
            "000001",
            "Napoli",
            "Milano",
            OffsetDateTime.parse("2023-11-17T09:10:40.000050Z"),
            OffsetDateTime.parse("2023-11-17T19:10:40.000050Z"),
            "1D",
            "G1",
            a1,
            p1
    );

    Passeggero p2 = new Passeggero(
            "0002",
            "Luca",
            "Il Magnifico",
            "AzImperatore",
            TipoDocumento.PASSAPORTO,
            "roma@imperatore.re"
    );

    Biglietto b2 = new Biglietto(
            "000001",
            "Napoli",
            "Milano",
            OffsetDateTime.parse("2023-11-17T10:10:40.000050Z"),
            OffsetDateTime.parse("2023-11-17T11:10:40.000050Z"),
            "1A",
            "G5",
            a1,
            p2
    );

    Passeggero p3 = new Passeggero(
            "0003",
            "Riccardo",
            "Merli",
            "AcGubbio",
            TipoDocumento.PASSAPORTO,
            "gubbio@nelcuore.co"
    );

    Biglietto b3 = new Biglietto(
            "000001",
            "Napoli",
            "Gubbio",
            OffsetDateTime.parse("2023-11-17T09:10:40.000050Z"),
            OffsetDateTime.parse("2023-11-17T19:10:40.000050Z"),
            "10F",
            "G6",
            a2,
            p3
    );

    ArrayList<Biglietto> biglietti = new ArrayList<>(Arrays.asList(b1, b2, b3));
    ArrayList<Aeromobile> aeromobili = new ArrayList<>(Arrays.asList(a1, a2, a3));
}
