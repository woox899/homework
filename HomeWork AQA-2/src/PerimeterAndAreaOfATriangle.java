public class PerimeterAndAreaOfATriangle implements IGeometricFigure {
    String borderColor;
    String fillColor;
    double firstSide;
    double secondSide;
    double thirdSide;

    public PerimeterAndAreaOfATriangle(String borderColor, String fillColor, double firstSide, double secondSide, double thirdSide) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public double calculatePerimeter() {
        return firstSide + secondSide + thirdSide;
    }

    @Override
    public double calculateArea() {
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - firstSide) * (s - secondSide) * (s - thirdSide));
    }
}
