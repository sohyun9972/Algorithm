import java.util.Scanner;

public class project8 {

	public static void main(String[] args) {

		Solution so = new Solution();
		Scanner s = new Scanner(System.in);
		System.out.println("수를 입력하세요 : ");
		String n = s.nextLine();
		System.out.println("제거할 갯수를 입력하세요 : ");
		int K = s.nextInt();
		
		System.out.println("결과 : " + so.solution(n,K));
		
	}

}

class Solution {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        // StringBuilder() -> 문자열 연산을 위해
        
        char[] numbers = number.toCharArray();
        // toCharArray() -> 문자열을 나누기 위해
        // "hello" -> h e l l o
        int index = 0;
        
        // 수정 필요
        
        for(int i = 0; i < number.length()-k; i++) {
        	// -k한수의 자릿수 만큼 answer에 담기위해
            char max = '0';
            
            for(int j=index; j<=number.length()-i; j++){
                if(numbers[j] > max) {
                    max = numbers[j];
                    index = j+1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
        // toString() -> 문자열 String으로 변환
    }
}