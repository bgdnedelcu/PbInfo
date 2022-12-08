package maxmin;

import java.util.Scanner;

public class SumMaxMin {

//	https://www.pbinfo.ro/probleme/347/summaxmin

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int nrIntrod = sc.nextInt();
		int[] arr = new int[nrIntrod];
		int index = 0;
		int count = 0;

		while (count < nrIntrod) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;

		}

		int min = 99999;
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		int sum = min + max;
		System.out.println(sum);

	}

}
