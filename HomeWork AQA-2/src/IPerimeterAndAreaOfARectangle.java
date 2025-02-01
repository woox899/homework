public interface IPerimeterAndAreaOfARectangle {
    default double perimeterOfARectangle(double firstSide, double secondSide) {
        double perimeter = 2 * (firstSide + secondSide);
        System.out.println("Периметр прямоугольника равен " + perimeter);
        return perimeter;
    }

    default double areaOfARectangle(double firstSide, double secondSide) {
        double area = firstSide * secondSide;
        System.out.println("Площадь прямоугольника равна " + area);
        return area;
    }
}
