import java.util.Arrays;

public class Top {

	public static void main(String[] args) {

		int[] heights = {6,9,5,7,4};
		int[] result = new int[heights.length];
		
		// System.out.println(Arrays.toString(result));
		// 왼->오
		for(int i = heights.length-1; i>0; i--) {	// 4~
			for(int j=i-1; j>=0; --j) {				// 7~
				if(heights[j]>heights[i]) {			
					result[i] = j+1;				// 4->7 (4)
					break;							// 신호를 받은게 있으면 그다음 인덱스 검사
				}
			}
		}
		System.out.println(Arrays.toString(result));
		// return 12345
	}

}
