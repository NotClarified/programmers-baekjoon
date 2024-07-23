import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);

		int Num = in.nextInt();
		int[] arr = new int[Num];
		
		for(int i = 0; i < Num; i++) {
			arr[i] = in.nextInt();
		}
 
		for(int i = 0; i < Num - 1; i++) {
			for(int j = i + 1; j < Num; j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		}
		for(int val : arr) {
			System.out.println(val);
		}
	}
}