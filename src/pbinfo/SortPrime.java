package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/510/sortprime

public class SortPrime {
	
	public SortPrime() {
		
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int index = 0;

		while (count < n) {
			int val = sc.nextInt();
			arr[index++] = val;
			count++;
		}

		List<Integer> listPrime = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = 2; j <= arr[i] / 2; ++j) {
				if (arr[i] % j != 0) {
					listPrime.add(arr[i]);
				}
			}
		}
		
		for(Integer elem : listPrime) {
			System.out.println(elem);
		}
		
		SortPrime obj1 = new SortPrime();
		SortPrime obj2 = null;
		obj2 = obj1;

	}
}
