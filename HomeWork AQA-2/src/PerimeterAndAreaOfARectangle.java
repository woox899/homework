public class PerimeterAndAreaOfARectangle implements IPerimeterAndAreaOfARectangle {
    String borderColor;
    String fillColor;
    double firstSide;
    double secondSide;

    public PerimeterAndAreaOfARectangle(String borderColor, String fillColor, double firstSide, double secondSide) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;
        this.firstSide = firstSide;
        this.secondSide = secondSide;

        System.out.println("У прямоугольника " + borderColor + " цвет границы и " + fillColor + " цвет фона.");

        perimeterOfARectangle(firstSide, secondSide);
        areaOfARectangle(firstSide, secondSide);
    }

    @Override
    public double perimeterOfARectangle(double firstSide, double secondSide) {
        return IPerimeterAndAreaOfARectangle.super.perimeterOfARectangle(firstSide, secondSide);
    }

    @Override
    public double areaOfARectangle(double firstSide, double secondSide) {
        return IPerimeterAndAreaOfARectangle.super.areaOfARectangle(firstSide, secondSide);
    }
}
