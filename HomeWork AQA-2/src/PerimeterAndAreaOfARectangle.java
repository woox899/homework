public class PerimeterAndAreaOfARectangle implements IGeometricFigure {
    String borderColor;
    String fillColor;
    private double firstSide;
    private double secondSide;

    public PerimeterAndAreaOfARectangle(String borderColor, String fillColor, double firstSide, double secondSide) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (firstSide + secondSide);
    }

    @Override
    public double calculateArea() {
        return firstSide * secondSide;
    }
}
