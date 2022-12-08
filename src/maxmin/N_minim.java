package maxmin;

import java.util.Scanner;

public class N_minim {

	// https://www.pbinfo.ro/probleme/355/n-minim

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nr = sc.nextInt();
		int[] arr = new int[nr];
		int count = 0;
		int index = 0;

		while (count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		int min = 99999;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println(min);

	}

}
