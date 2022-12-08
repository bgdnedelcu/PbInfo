package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaximPanaLa0 {
	
	//https://www.pbinfo.ro/probleme/54/maxim

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int stop = 0;
		
		
		MaximPanaLa0 obj = new MaximPanaLa0();
		List<Integer> listaNr = new ArrayList<>();
		
		int[] a = new int[x];
		int index = 0;
		
		int val = sc.nextInt();
		while(val != 0) {
			
			a[index++] = val;
//		  listaNr.add(val);
		  val = sc.nextInt();
			
		}
		

		for(int i = 0; i < index; i++) {
			System.out.println(a[i]);
		}
		
		int max = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println(max);
	}

}
