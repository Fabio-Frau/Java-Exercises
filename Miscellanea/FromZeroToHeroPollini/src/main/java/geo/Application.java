package geo;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        var app = new Application();
        app.run();

    }

    private void run() {
        var p = new Punto(10, 20);
        var p1 = new Punto(10, 20);
        System.out.println(p == p1);
        System.out.println(p.equals(p1));
    }

}
