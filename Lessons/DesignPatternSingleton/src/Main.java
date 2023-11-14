import java.util.ArrayList;
import java.util.List;

public class Main {


    private static Database db;

    public static Database getDB() {
        if (db == null) {
            db = new Database();
        }

        return db;
    }

    public static void main(String[] args) {

        Database myLocalDB = getDB();



    }
}
