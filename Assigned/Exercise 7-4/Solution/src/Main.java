public class Main {

    public static void main(String[] args) {

        Shape circle = FactoryShape.getShape(ShapeType.CIRCLE);
        Shape square = FactoryShape.getShape(ShapeType.SQUARE);
        Shape rectangle = FactoryShape.getShape(ShapeType.RECTANGLE);
        Shape triangle = FactoryShape.getShape(ShapeType.TRIANGLE);

        System.out.println(circle.draw());
        System.out.println(square.draw());
        System.out.println(rectangle.draw());
        System.out.println(triangle.draw());

    }

}
