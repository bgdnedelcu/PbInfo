package pbinfo;

import java.util.Scanner;

//https://www.pbinfo.ro/probleme/487/numarare2

public class Numarare2 {

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
		
		int sumaElem = 0;
		int media = 0;
		int countFinal = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sumaElem += arr[i];
			media = sumaElem / nr;

		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < media) {
				countFinal++;
			}
		}
		
		System.out.println(countFinal);

	}

}
