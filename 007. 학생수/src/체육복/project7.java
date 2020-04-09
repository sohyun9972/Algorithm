package 체육복;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("학생수 입력 : ");
		int n = s.nextInt();
		
//		int[] answer = new int[n];
		int[] lost = {2,4,5,7};
		int[] reserve = {1,2,4};
		int count = 0;
	
		
		for(int i = 0; i<lost.length; i++) {
			for(int j=0; j<reserve.length; j++) {
				if(lost[i] == reserve[j] -1 || lost[i] == reserve[j] +1 || lost[i] == reserve[j]) {
					count++;
					reserve[j]=0;
					break;
				}
			}
		}
	
		System.out.println("잃어버린 학생수 : " + lost.length);
		System.out.println("빌려준 학생수 : " + count);
		System.out.println("학생수 : " + (n - lost.length + count) );
	}

}
