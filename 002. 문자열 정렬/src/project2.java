import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class project2 {

	public static void main(String[] args) {

		  String[] str = {"sun","bed","car"};
	        
		  Scanner s = new Scanner(System.in);
		  System.out.println("정수를 입력하세요 : ");
		  int n = s.nextInt();
		  
	        ArrayList<String> list = new ArrayList<String>();
	        // 문자열을 검색하고 더하기 위해 list 생성
	        
	        for(int i = 0; i < str.length; i++) {
	            list.add(str[i].charAt(n)+str[i]);
	            // list에 strings에 있는 문자열에 n번째 문자를 더한 문자열을 add 한다.
	            // ex) n=1, list[usun, ebed, acar]
	        }
	        
	        Collections.sort(list);
	        // list 정렬 (abc,123 순으로)
	        
	        String[] result = new String[list.size()];
	        // list 크기 만큼 result 배열 생성
	        
	        for(int j = 0; j < result.length; j++) {
	            result[j] = list.get(j).substring(1);
	            // result 배열에 list의 문자열 첫번째 요소 빼서 넣음
	            System.out.print(result[j]);
	            System.out.print(" ");
	           
	        }
	}
}
