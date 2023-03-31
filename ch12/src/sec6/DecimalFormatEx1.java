package sec6;

import java.text.DecimalFormat;

public class DecimalFormatEx1 {

	public static void main(String[] args) {
		int i = 123456789;
		double j = 12345.6789;
		int k = 123456789;
		
		DecimalFormat df1 = new DecimalFormat("##########.#####");
		DecimalFormat df2 = new DecimalFormat("0000000000.00000");
		DecimalFormat df3 = new DecimalFormat("$ #,##0");
		DecimalFormat df4 = new DecimalFormat("#,##0원");
		
		String dfd1 = df1.format(i);
		String dfd2 = df2.format(i);
		String dfd3 = df3.format(j);
		String dfd4 = df4.format(k);
		
		System.out.println(dfd1);
		System.out.println(dfd2);
		System.out.println(dfd3);
		System.out.println(dfd4);
		
	}
}