package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/49/factorial

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int nFactorial = 1;
		
		
		for(int i = 2; i <= n; i++) {
			nFactorial *= i;
		}
	
		System.out.println(nFactorial);
	}

}
