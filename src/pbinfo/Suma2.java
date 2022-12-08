package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/491/suma2

public class Suma2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nr = sc.nextInt();
		int count = 0;
		int[] arr = new int[nr];
		int index = 0;

		while (count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		int auxParStanga = 0;
		int auxParDreapta = 0;

//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] % 2 == 0) {
//				auxParDreapta = i;
//			}
//		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				auxParStanga = i;
				break;
			}
		}


//		for (int i = arr.length - 1; i >= 0; i--) {
//			if(arr[i] % 2 == 0) {
//				auxParStanga = i;
//			}
//			
//		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] % 2 == 0) {
				auxParDreapta = i;
				break;
			}
			
		}
		
		int sum = 0;
		
		for(int i = auxParStanga; i <= auxParDreapta; i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);
	}

}
