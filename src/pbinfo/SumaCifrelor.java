package pbinfo;

import java.util.Scanner;

// https://www.pbinfo.ro/probleme/10/suma-cifrelor

public class SumaCifrelor {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		String y = String.valueOf(x);
		int sumaCifrelor = 0;
		
		for(int i = 0; i < y.length(); i++) {
			char s = y.charAt(i);
			int m = Integer.parseInt(String.valueOf(s));
			sumaCifrelor += m;
		}
		
		
		System.out.println(sumaCifrelor);
		
		
		
	}

}
