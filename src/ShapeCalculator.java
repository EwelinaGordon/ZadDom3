public class ShapeCalculator {

    double squareArea(Square square) {
        double area = square.a * square.a;
        return area;
    }

     double circleArea(Circle circle){
        double area = 3.14 * circle.r * circle.r;
        return area;
    }

    double trianglePerimeter(Triangle triangle){
        double perim = triangle.a + triangle.b + triangle.c;
        return perim;
    }

    double recPerimeter(Rectangle rectangle){
        double perim = 2* rectangle.a + 2* rectangle.b;
        return perim;
    }

}
