package pbinfo;

import java.util.Scanner;

public class Afisare0 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nr = sc.nextInt();
		int count = 0;
		int[] arr = new int[nr];
		int index = 0;
		
		while(count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		for(int i = 0; i < arr.length; i++) {
			if((arr[i] % arr[arr.length - 1]) == 0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
