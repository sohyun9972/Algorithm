import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class project11 {

	public static void main(String[] args) {

//      ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        
        System.out.println("사람수를 입력하세요 : ");
        int n = s.nextInt();
        int[] people = new int[n];
        System.out.println("시간을 입력하세요 : ");
        for(int i=0; i<n; i++) {
        	people[i] = s.nextInt();
        }

		Arrays.sort(people);
		
		int count = 0;
		int time = 0;
		for(int i = 0; i<people.length; i++) {
			count += people[i];
			time += count;
		}
		
		System.out.println(time);
		
	}

}
