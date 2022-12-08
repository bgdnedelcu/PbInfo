package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/1360/suma-gauss

public class SumaGauss {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
	
		int sumaNr = 0;
		
		for(int i = 0; i <= x; i++) {
			sumaNr += i;
		}
		
		System.out.println(sumaNr);
	
	}

}
