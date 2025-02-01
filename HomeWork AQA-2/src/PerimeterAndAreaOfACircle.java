public class PerimeterAndAreaOfACircle implements IPerimeterAndAreaOfACircle {
    String borderColor;
    String fillColor;
    double radius;

    public PerimeterAndAreaOfACircle(String borderColor, String fillColor, double radius) {
        this.borderColor = borderColor;
        this.fillColor = fillColor;

        System.out.println("У круга " + borderColor + " цвет границы и " + fillColor + " цвет фона.");

        perimeterOfACircle(radius);
        areaOfACircle(radius);
    }

    @Override
    public double perimeterOfACircle(double radius) {
        return IPerimeterAndAreaOfACircle.super.perimeterOfACircle(radius);
    }

    @Override
    public double areaOfACircle(double radius) {
        return IPerimeterAndAreaOfACircle.super.areaOfACircle(radius);
    }
}
