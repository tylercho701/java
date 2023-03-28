package creational.abstractfactory;

public class AbstractFactoryEx1 {
	public static void main(String[] agrs){
		// 추상화 객체 생성
		AbstractFactory shapeFactoryN = FactoryProducer.getFactory(false);
		
		// 추상화 객체를 활용하여 직사각형 만들기
		Shape shape1 = shapeFactoryN.getShape("RECTANGLE");
		shape1.draw();
		
		// 추상화팩토리 객체 생성
		AbstractFactory shapeFactoryR = FactoryProducer.getFactory(true);
		
		// 추상화 객체를 활용하여 모서리가 둥근 정사각형 만들기
		Shape shape2 = shapeFactoryR.getShape("Square");
		shape2.draw();
		
	}
}