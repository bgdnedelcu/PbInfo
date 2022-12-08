package pbinfo;

import java.util.Scanner;

public class MaxAndAp {
	
	//https://www.pbinfo.ro/probleme/346/maxandap

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int nrNr = sc.nextInt();
		int count = 0;
		int index = 0;
		int[] arr = new int[nrNr];
		
		while(count < nrNr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}
		
		int max = 0;
		int countMax = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] == max) {
				countMax++;
			}
		}
		
		System.out.println(max);
		System.out.println(countMax);

	}

}
