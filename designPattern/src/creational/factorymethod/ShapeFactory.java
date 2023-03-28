package creational.factorymethod;

public class ShapeFactory {
	public Shape getShape(String shapeType){
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		} else if (shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		} else {
			return null;
		}
	}
}