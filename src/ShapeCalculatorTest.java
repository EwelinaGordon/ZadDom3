public class ShapeCalculatorTest {
    public static void main(String[] args) {


        Square sqr = new Square(5);
        Rectangle rct = new Rectangle(8, 8);
        Circle crc = new Circle(1);
        Triangle trg = new Triangle(2,4,4);
        ShapeCalculator shp = new ShapeCalculator();

        double resultSquare = shp.squareArea(sqr);
        System.out.println("Pole kwadratu: " + resultSquare);

        double resultRectangle = shp.recPerimeter(rct);
        System.out.println("Obwod prostokata: " + resultRectangle);

        double resultCircle = shp.circleArea(crc);
        System.out.println("Pole koła: " + resultCircle);

        double resultTriangle = shp.trianglePerimeter(trg);
        System.out.println("Obwod trojkata: " + resultTriangle);
    }

}
