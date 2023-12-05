public class Main {

    public static void main(String[] args) {

        Rectangle rect1 = new Rectangle(1,1);
        System.out.println("The area of the rectangle is " + rect1.getArea());
        System.out.println("The perimeter of the rectangle is " + rect1.getPerimeter());

        rect1.setHeight(5);
        rect1.setWidth(10);

        System.out.println("The area of the rectangle is " + rect1.getArea());
        System.out.println("The perimeter of the rectangle is " + rect1.getPerimeter());

    }

}
