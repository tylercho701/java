package sec1;

public class LambdaEx4 {
	@FunctionalInterface
	interface MyFnc4 {
		int getCalc(int i, int j);
	}
	
	public static void main(String[] args) {
	MyFnc4 add = (x, y)	-> { return x+y; };
	MyFnc4 sub = (x, y)	-> { return x-y; };
	MyFnc4 mlt = (x, y)	-> { return x*y; };
	MyFnc4 div = (x, y)	-> { return x/y; };
	
	System.out.println(add.getCalc(100, 150));
	System.out.println(sub.getCalc(150, 100));
	System.out.println(mlt.getCalc(5, 5));
	System.out.println(div.getCalc(100, 3));	
	}
}