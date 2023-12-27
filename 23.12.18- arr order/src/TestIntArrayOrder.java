import java.util.Arrays;

public class TestIntArrayOrder {
	public static void main(String[] args) {
		// 학생들의 점수를 기록한 정수 배열
		int[] scores = { 10, 30, 20, 90, 70 };
		int[] sorted = Arrays.copyOf(scores, 5);
		// 오름차순으로 배열을 정리해줌
		Arrays.sort(scores);

		System.out.println(Arrays.toString(scores));
		System.out.println(Arrays.toString(sorted));

		System.out.println(scores[0]);

		int index = Arrays.binarySearch(scores, 70);
		System.out.println(index);

//		// 최대점수
//		int max = 0;
//		for(int i = 0; i < scores.length;i++) {
//			if (scores[i] >max) {
//				max = scores[i];
//			}
//		}
//		System.out.println(max);
//		
//		// 최소점수
//		int min = 100;
//		for(int i = 0; i < scores.length;i++) {
//			if (scores[i] <min) {
//				min = scores[i];
//			}
//		}
//		System.out.println(min);
//		// 중위점수
//		??

	}

}
