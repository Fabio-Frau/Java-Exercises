package esempio1;

public class Test {

    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Test (int x) {
        System.out.println("Inside constructor");
        this.x = x;
    }

    public static void main(String[] args) {

        var pippo = new Test(313);
        var pippo2 = new Test(314);
        pippo2.setX(100);

        System.out.println(pippo);
        System.out.println(pippo2);

    }

    @Override
    public String toString() {
        return "Test{" +
                "x=" + x +
                '}';
    }
}
