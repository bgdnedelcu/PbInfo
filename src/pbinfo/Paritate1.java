package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/633/paritate1

public class Paritate1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nr = sc.nextInt();
		int count = 0;
		int[] arr = new int[nr];
		int index = 0;
		
		while(count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
			
		}
		
		int maxPar = 0;
		int maxImpar = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				if(arr[i] > maxPar) {
					maxPar = arr[i];
				}
			}
			if(arr[i] % 2 != 0) {
				if(arr[i] > maxImpar) {
					maxImpar = arr[i];
				}
			}
		}
		
		System.out.println(maxPar);
		System.out.println(maxImpar);
		int diferenta = maxPar - maxImpar;
		System.out.println(diferenta);

	}

}
