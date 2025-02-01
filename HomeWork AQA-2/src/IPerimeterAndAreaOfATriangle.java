public interface IPerimeterAndAreaOfATriangle {
    default double perimeterOfATriangle(double firstSide, double secondSide, double thirdSide) {
        double perimeter = firstSide + secondSide + thirdSide;
        System.out.println("Периметр треугольника равер " + perimeter);
        return perimeter;
    }

    default double areaOfATriangle(double firstSide, double secondSide, double thirdSide) {
        double semiperimeter = (firstSide + secondSide + thirdSide) / 2;
        double area = java.lang.Math.sqrt(semiperimeter * (semiperimeter - firstSide) * (semiperimeter - secondSide) *
                (semiperimeter - thirdSide));
        System.out.println("Площадь треугольника равна " + area);
        return area;
    }
}
