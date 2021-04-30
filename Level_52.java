import java.util.Arrays;
import java.util.Scanner;

public class Level_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];

		for(int i = 0; i< N; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int sum = 1 ;
		for(int i = 0; i < N; i++) {
			if(sum < arr[i]) {
				break;
			}
			sum += arr[i];
		}
		System.out.println(sum);
	}

}
