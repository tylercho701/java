package sec2;

public class Food2 {
	String name;
	int quantity;
	int weight;
	
	public Food2() {
		this("제육볶음");
	}
	public Food2(String name) {		
		this(name, 2);
	}
	public Food2(String name, int quantity) {		
		this(name, quantity, 230);
	}
	public Food2(String name, int quantity, int weight) {		
		this.name = name;
		this.quantity = quantity;
		this.weight = 230;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Food2 [name=" + name + ", quantity=" + quantity + ", weight="
				+ weight + "]";
	}

}