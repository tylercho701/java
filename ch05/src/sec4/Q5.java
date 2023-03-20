package sec4;

public class Q5 {

	public static void main(String[] args) {
		// 순서대로 정렬 (selection sort)
		int[] arr = {70, 50, 90, 80, 40, 60};
		System.out.print("정렬 전 : \t");
		for(int i = 0; i<arr.length; i++){
			System.out.printf("%d\t", arr[i]);
		}
		System.out.println();
		
		// 오름차순
		System.out.print("오름차순 : \t");
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if (arr[i]>arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}	
			System.out.printf("%d\t",arr[i]);
		}
		System.out.println();
		
		// 내림차순
		System.out.print("내림차순 : \t");
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if (arr[i]<arr[j]){
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}	
			System.out.printf("%d\t",arr[i]);
		}
	}
}