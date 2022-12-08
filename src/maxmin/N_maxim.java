package maxmin;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/354/n-maxim

public class N_maxim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nr = sc.nextInt();
		int count = 0;
		int index = 0;
		int[] arr = new int[nr];

		while (count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println(max);
	}

}
