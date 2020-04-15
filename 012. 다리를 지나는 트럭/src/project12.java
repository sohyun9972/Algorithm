import java.util.Arrays;

public class project12 {

	public static void main(String[] args) {

		int bridge_length = 2;
		int weight = 10;
		int[] truck_weights = {7,4,5,6};
		
		Arrays.sort(truck_weights);
				
		System.out.println(Arrays.toString(truck_weights));
		
		int remain = weight;
		int time = 0;

		// 수정 필요
		
		
		for(int i = 0; i < truck_weights.length; i++) {
	           if(truck_weights[i] < remain) {
	               remain -= truck_weights[i];
	               time += truck_weights[i];
	               System.out.println(time);

	           }else if(truck_weights[i] > remain) {
	               remain = bridge_length;
	           }
	      
		}
		
		System.out.println(time);
	}
}
