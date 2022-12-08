package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/4279/sumcnt2

public class SumCnt2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int[] arr = new int[n];
		int count = 0;
		int index = 0;
		
		while(count < n) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}
		
		int sumImpare = 0;
		int divizibileK = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				sumImpare += arr[i];
			}
			if(arr[i] % k == 0) {
				divizibileK++;
			}
		}
		
		System.out.println(sumImpare);
		System.out.println(divizibileK);

	}

}
