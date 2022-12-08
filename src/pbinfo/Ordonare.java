package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/509/ordonare

public class Ordonare {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		int index = 0;
		
		for(int i = 0; i < n; i++) {
			int val = sc.nextInt();
			arr[index++] = val;
			count++;
		}
		
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
