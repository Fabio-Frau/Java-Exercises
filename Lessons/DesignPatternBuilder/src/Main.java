public class Main {
    public static void main(String[] args) {

        CarBuilder builder = new CarBuilder();
        builder.setColore("Bianco");
        builder.setNumeroDiPorte(2);
        builder.setPropulsione("Benzina");
        builder.setTipo("Sportiva");

        Car myCar = builder.build();
        System.out.println(myCar);

//        Car myCar2 = new Car(4, "Rosso", "Diesel", "SUV");
//        System.out.println(myCar2);



    }
}
