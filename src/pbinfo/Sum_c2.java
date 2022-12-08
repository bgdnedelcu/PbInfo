package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3985/suma-c2

public class Sum_c2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		int index = 0;

		while (count < n) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			String s = String.valueOf(arr[i]);
				if(s.length() == 2) {
					list.add(Integer.parseInt(s));
			}

		}
		
		int sum = 0;
		for(Integer elem : list) {
			sum+= elem;
		}
		
		System.out.println(sum);

	}

}
