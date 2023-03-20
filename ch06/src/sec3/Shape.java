package sec3;

public class Shape {
	int shapeType;			// 0-원, 3-삼각형, 4-사각형
	int length;
	int height;
	double result;
	
	public int getShapeType() {
		return shapeType;
	}
	public void setShapeType(int shapeType) {
		this.shapeType = shapeType;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getResult(int length) {
		if(this.shapeType == 0){
			return ((length * length) * 3.14);
		}
	}
	public double getResult(int length, int height) {
		if(this.shapeType ==3 ) {
			return (length * height) / 2;
		} else {
			return length*height;
		}
	}

	
}