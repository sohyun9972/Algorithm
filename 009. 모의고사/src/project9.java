import java.util.ArrayList;
import java.util.Scanner;

public class project9 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
//		ArrayList<Integer> list = new ArrayList<Integer>();
		int answers[] = new int[5];
		
		System.out.println("정답을 입력하세요 : ");
		for(int i = 0; i<answers.length; i++) {
			answers[i] = s.nextInt();
		}

//		int[] answers = {1,2,3,4,5};
	    int[] one = {1,2,3,4,5};
	    int[] two = {2,1,2,3,2};
	    int[] three = {3,3,2,2,2};
	    int st1=0;
	    int st2=0;
	    int st3 = 0;
	    int result;
	      
	    for(int j=0; j<answers.length; j++) {
	       if(answers[j] == one[j]) {
	    	   st1++;
	        		}
	        	}
	     for(int j=0; j<answers.length; j++) {
	       if(answers[j] == two[j]) {
	       		st2++;
	        		}
	        	}
	      for(int j=0; j<answers.length; j++) {
	       	if(answers[j] == three[j]) {
	       		st3++;
	        		}
	        	}
	      if(st1>st2 && st1>st3) {
	    	  result = 1;
	    	  System.out.println("가장많이 맞춘사람 번호 : " + result);
	      }
	      else if(st2>st1 && st2>st3)  {
	    	  result = 2;
	    	  System.out.println("가장많이 맞춘사람 번호 : " + result);
	      }
	      else if(st3>st1 && st3>st2) {
	    	  result = 3;
	    	  System.out.println("가장많이 맞춘사람 번호 : " + result);
	      }
		 
		
	}

}


