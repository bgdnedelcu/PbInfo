package pbinfo;

import java.util.Scanner;

// https://www.pbinfo.ro/probleme/974/resturi

public class Resturi {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i % k;
		
		}
		
		System.out.println(sum);

	}

}
