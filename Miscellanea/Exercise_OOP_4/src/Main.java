public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(1);
        System.out.println("The area is " + circle.getArea());
        System.out.println("The circumference is " + circle.getCircumference());

        circle.setRadius(2);
        System.out.println();
        System.out.println("The area is " + circle.getArea());
        System.out.println("The circumference is " + circle.getCircumference());

    }

}
