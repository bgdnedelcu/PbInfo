package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3985/suma-c2

public class Count_c2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		int index = 0;
		
		while(count < n) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}
		
		int cuDouaCifre = 0;
		
		for(int i = 0; i < arr.length; i++) {
			String s = String.valueOf(arr[i]);
			if(s.length() == 2) {
				cuDouaCifre++;
				
			}
		}
		
		System.out.println(cuDouaCifre);

	}

}
