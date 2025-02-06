public interface IGeometricFigure {
    default double calculatePerimeter() {
        return 0;
    }
    double calculateArea();
}
