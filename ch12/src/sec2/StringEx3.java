package sec2;

import java.util.StringTokenizer;

public class StringEx3 {

	public static void main(String[] args) {
		String i = "자.바.웹.프.로.그.래.밍";
		StringTokenizer stz = new StringTokenizer(i, ".");
		while(stz.hasMoreTokens()){
			String token = stz.nextToken();
			System.out.print(token+" ");
		}
		
		String[] j = i.split(".");
		for(String token1 : j){
			System.out.print(token1+", ");
		}
	}
}