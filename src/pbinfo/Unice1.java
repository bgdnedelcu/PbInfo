package pbinfo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Unice1 {
	
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
		
		Set<Integer> list = new HashSet<>();
		
		for(int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		System.out.println(list.size());
		
	}

}
