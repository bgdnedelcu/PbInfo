package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/332/expresie2

public class Expresie2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			sum += i * (i + 1);

		}

		System.out.println(sum);
	}

}
