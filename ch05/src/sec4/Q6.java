package sec4;

public class Q6 {

	public static void main(String[] args) {
		// 
		int[] score = {90, 80, 86, 49, 76, 99};
		int[] rank = {1, 1, 1, 1, 1, 1};
		
		for (int i=0; i<score.length; i++){
			for (int j=0; j<score.length; j++){
				if (score[i]<score[j]){
					rank[i]++;
				}
			}System.out.println("점수 : "+score[i]+"\t"+"석차 : "+rank[i]);
		}
	}

}
