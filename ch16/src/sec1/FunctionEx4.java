package sec1;
class MyFunction4{
	int add(int x, int y){	return x+y;	}
	int sub(int x, int y){	return x-y;	}
	int mul(int x, int y){	return x*y;	}
	double div(int x, int y){	return (double)x/y;	}
	
}
public class FunctionEx4 {

	public static void main(String[] args) {
		MyFunction4 f4 = new MyFunction4();
		int a = f4.add(5, 10);
		System.out.println(a);
		int b = f4.sub(10, 5);
		System.out.println(b);
		int c = f4.mul(5, 10);
		System.out.println(c);
		double d = f4.div(5, 2);
		System.out.println(d);
	}
}