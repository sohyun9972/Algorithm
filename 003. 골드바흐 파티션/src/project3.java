import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class project3 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		int n = s.nextInt();
		boolean isPrime = false;
		
	
		boolean T = true;	// 소수 판별
		
		for(int i = 2; i < n; i++) {
			for(int j = 2; j< i; j++) {
				if(i%j == 0)			// 0이면 소수 false
					T = false;	}
			if(T) {
				list.add(i);	// list에 소수 입력
				list2.add(n-i);
			}
			T = true;
		}
		
		
	//	for(int r=0; r<n;r++)
	//		System.out.println(list.get(r));	// 소수 출력
		
		for(int g=0; g<n; g++) {
			
			if( (n-list.get(g)) < 0)
				break;
			System.out.println(list.get(n) + "," + list2.get(n));

		}
		
	}
	
	
	

}




