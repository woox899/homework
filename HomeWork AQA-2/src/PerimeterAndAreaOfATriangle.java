public class PerimeterAndAreaOfATriangle implements IPerimeterAndAreaOfATriangle {
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

        System.out.println("У треугольника " + borderColor + " цвет границы и " + fillColor + " цвет фона.");

        perimeterOfATriangle(firstSide, secondSide, thirdSide);
        areaOfATriangle(firstSide, secondSide, thirdSide);
    }

    @Override
    public double perimeterOfATriangle(double firstSide, double secondSide, double thirdSide) {
        return IPerimeterAndAreaOfATriangle.super.perimeterOfATriangle(firstSide, secondSide, thirdSide);
    }

    @Override
    public double areaOfATriangle(double firstSide, double secondSide, double thirdSide) {
        return IPerimeterAndAreaOfATriangle.super.areaOfATriangle(firstSide, secondSide, thirdSide);
    }
}
