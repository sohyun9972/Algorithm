import java.util.Scanner;

public class project10 {

	public static void main(String[] args) {

		int money  = 1000;
		
		Scanner s = new Scanner(System.in);
		System.out.println("금액을 입력하세요 : "); // 620
		int buy = s.nextInt();
		buy = money - buy;			// 
		int n = 0;
		int[] no = {500, 100, 50, 10, 5, 1};
		
		for(int i = 0; buy>0; i++) {
			if(buy/no[i] > 0) {
				n += buy/no[i];
				buy = buy%no[i];
			}
		}
		System.out.println("잔돈 : " + n);
		
		/*
		while(buy>0) {
			if(buy/500>0) {
				n = buy/500;
				buy = buy%500;
			}
			else if(buy/100>0) {
				n = buy/100;
				buy = buy%100;
			}
		}
		*/
		
		
		
		
	}

}
