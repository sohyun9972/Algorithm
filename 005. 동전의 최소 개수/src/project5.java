// 동전 0
import java.util.Scanner;

public class project5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("동전 종류 개수 : ");
		int N = s.nextInt();
		System.out.println("동전 합 : ");
		int K = s.nextInt();
		int count = 0;		// 답
		int[] Money = new int[N];
		
		System.out.println("동전 종류 : ");
		for(int i=0; i<N; i++) {
			Money[i] = s.nextInt();
		}
		int tmp = K;

			for(int i=N; i>=0 && tmp > 0; i--) {
				if(tmp % Money[i] < K) {		// (4200 % 10000 -> x)
					count += tmp / Money[i];	// (4200 / 1000 -> 4)
					tmp %= Money[i];	// 계산한 나머지를 다시 계산하기 위해
				}
			}
			
		System.out.println("필요한 동전수 : " + count);
	}

}
