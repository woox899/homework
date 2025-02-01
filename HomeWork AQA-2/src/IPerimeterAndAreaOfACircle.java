public interface IPerimeterAndAreaOfACircle {
    default double perimeterOfACircle(double radius) {
        double perimeter = 2.0 * 3.14 * radius;
        System.out.println("Периметр круга равен " + perimeter);
        return perimeter;
    }
    default double areaOfACircle(double radius) {
        double area = 3.14 * (radius * radius);
        System.out.println("Площадь круга равна " + area);
        return area;
    }
}
