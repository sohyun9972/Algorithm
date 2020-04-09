import java.util.Scanner;

public class so1 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = 0;
		
		while(true) {
		System.out.println("수를 입력하세요 : ");
		n = s.nextInt();
		
		if(n < 0 || 20 < n) 
			System.out.println("다시 ");
		else 
			break;
		}
		
		
		int[] a = new int[25];
		int result = 0;
		
		a[0] = 0;
		for(int i = 1; i <= n; i++) {
			if(i <=2) {
				a[i] =1;
			}
			else {
				a[i] = a[i-1] + a[i-2];
			}	
		}
		
		result = a[n];
		System.out.println("결과 : " + result);
		
	}
}
