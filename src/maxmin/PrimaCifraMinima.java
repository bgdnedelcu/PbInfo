package maxmin;

import java.util.Scanner;

public class PrimaCifraMinima {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int nr = sc.nextInt();
		String[] arr = new String[nr];
		int index = 0;
		int count = 0;
		while(count < nr) {
			int val = sc.nextInt();
			arr[index++] = String.valueOf(val);
			count++;
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
			}
		}

	}

}
