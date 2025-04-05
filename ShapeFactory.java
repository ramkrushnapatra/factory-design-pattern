public class ShapeFactory {
    public  Shape getShape(ShapeEnum shape){
        if(shape ==null){
            return null;
        } else if (shape == ShapeEnum.CIRCLE) {
            return new Circle();
        } else if (shape==ShapeEnum.RECTANGLE) {
            return new Rectangle();
        }else {
            return new Square();
        }
    }
}
