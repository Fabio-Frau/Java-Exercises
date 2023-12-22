public class Main {

    public static void main(String[] args) {

        Sensor s = new Sensor();
        DataReader dr = new DataReader("reader 1");
        DataReader dr2 = new DataReader("reader 2");
        s.register(dr);
        s.register(dr2);
        s.readData();
        s.unregister(dr);
        s.readData();

    }

}
