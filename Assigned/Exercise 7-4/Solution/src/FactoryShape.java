public class FactoryShape {

    public static Shape getShape(ShapeType type) {
        Shape shape =
                switch (type) {
                    case CIRCLE -> new Circle();
                    case RECTANGLE -> new Rectangle();
                    case SQUARE -> new Square();
                    case TRIANGLE -> new Triangle();
                    default -> null;
                };

                return shape;
    }
}
