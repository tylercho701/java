package sec1;

public class Mammal extends Animal {
	private String foods;		// 먹이 - 새로 추가된 멤버
	private String birthType;	// 난생 | 태생 | 반태생
	
	
	public String getFoods() {
		return foods;
	}

	public void setFoods(String foods) {
		this.foods = foods;
	}

	public String getBirthType() {
		return birthType;
	}

	public void setBirthType(String birthType) {
		this.birthType = birthType;
	}
	
	// 상속 받은 메소드 (getter, setter, cry)
	// 오버라이딩(overriding) : 상속 받은 메소드에 대하여 처리할 내용을 새로 기술하는 것

	@Override
	public void cry() {
		System.out.println("척추 동물이 웁니다.");
	}
}