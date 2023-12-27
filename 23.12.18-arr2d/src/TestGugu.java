import java.util.Arrays;

public class TestGugu {
	public static void main(String[] args) {
		//구구단 값을 가지는 2차원 배열 생성하기
		int gu [][] = new int[8][9];
		
		for (int i =0 ; i < gu.length;i++) {
			for(int j = 0;j < gu[i].length;j++) {
				gu[i][j] =(i+2)*(j+1); 
			}
		}
		System.out.println(Arrays.deepToString(gu));
	}
}
