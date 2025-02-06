public class PerimeterAndAreaOfACircle implements IGeometricFigure {
    String borderColor;
    String fillColor;
    private double radius;

    public PerimeterAndAreaOfACircle(String borderColor, String fillColor, double radius) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}
