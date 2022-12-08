package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/122/cifrebinare

public class CifreBinare {
	
	public static int numara1(String nr) {
		int count = 0;
		
		for(int i = 0; i < nr.length(); i ++) {
			int m = Integer.parseInt(String.valueOf(nr.charAt(i)));
			if(m == 1) {
				count++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nr1 = sc.nextInt();
		int nr2 = sc.nextInt();
		
		String x = Integer.toBinaryString(nr1);
		String y = Integer.toBinaryString(nr2);
		
		System.out.println(x);
		System.out.println(y);
		
		int numaratoare1 = numara1(x);
		int numaratoare2 = numara1(y);
		
		
		if(numaratoare1 > numaratoare2) {
			System.out.println(x);
		}else if (numaratoare2 > numaratoare1) {
			System.out.println(y);
		}else {
			System.out.println("egalitate");
		}
		
	}

}
