public class Main {
    public static void main(String[]args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1= shapeFactory.getShape(ShapeEnum.CIRCLE);
        shape1.draw();

        Shape shape2 = shapeFactory.getShape(ShapeEnum.RECTANGLE);
        shape2.draw();

        Shape shape3 = shapeFactory.getShape(ShapeEnum.SQUARE);
        shape3.draw();
    }
}
