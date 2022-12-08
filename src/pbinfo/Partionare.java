package pbinfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Partionare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int count = 0;
		int[] arr = new int[x];
		List<Integer> list = new ArrayList<>();	
		
		while(count < x) {
			int val = sc.nextInt();
			arr[count] = val;
			count++;
		}
		
		
		
//		Collections.sort(list, Collections.reverseOrder());
		int aux = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					aux = arr[i];
					arr[i] = arr[j];
					arr[j] = aux;
				}
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
