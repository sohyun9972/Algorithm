// k번째 수

import java.util.Arrays;

class project4 {
	
	public static void main(String[] args) {
		
		project4 test = new project4();
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 2, 3 }, { 1, 2, 5 }, { 1, 3, 3 } };
		
		System.out.println(Arrays.toString(test.Solution(array, commands)));

	}
	
	public int[] Solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];

		for (int i = 0; i < commands.length; i++) {
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1] - 1);
			// Arrays.copyOfRange(복사할 배열, 시작인덱스, 끝인덱스)
			// {2,2,3} array(5~3) 
			Arrays.sort(temp);
			// temp (2356)
			answer[i] = temp[commands[i][1]];
			// temp(2)
		}

		return answer;
	}
	
}
 


