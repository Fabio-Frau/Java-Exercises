public class Circle {

    private double radius;

    public double getArea() {
        return Math.pow(radius,2);
    }

    public double getCircumference() {
        return this.radius*2*Math.PI;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
