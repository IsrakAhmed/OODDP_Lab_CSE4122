public class RoundShapeFactory extends ShapeFactory {
    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        } 
        return null;
    }
    
}
