public class Rectangle {

    double a;
    double b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double recPerimeter() {
        double perim = 2 * a + 2 * b;
        return perim;
    }
}