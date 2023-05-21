package GeometricShapeDrawing;

public class ShapeFactory {

    public Shape getShape (String typeShape){
        if (typeShape == null){
            return null;
        }
        if (typeShape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if (typeShape.equalsIgnoreCase("SQUARE")) {
            return new Square();
        } else if (typeShape.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }

}
