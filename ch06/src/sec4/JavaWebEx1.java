package sec4;

public class JavaWebEx1 {

	public static void main(String[] args) {
		JavaWeb jw1 = new JavaWeb();
		JavaWeb jw2 = new JavaWeb();
		JavaWeb jw3 = new JavaWeb();
		
		/*
		jw1.name = "조교행1";
		jw2.name = "조교행2";
		jw3.name = "조교행3";
		*/
		jw1.partName = "자바1";
		jw2.partName = "자바2";
		jw3.partName = "자바3";
		
		System.out.println("jw1 name : "+jw1.name+", jw1 part name : "+jw1.partName);
		System.out.println("jw2 name : "+jw2.name+", jw2 part name : "+jw2.partName);
		System.out.println("jw3 name : "+jw3.name+", jw3 part name : "+jw3.partName);
		System.out.println("jw4 name : "+JavaWeb.name);
		System.out.println("jw5 name : "+JavaWeb.name);
	}
}