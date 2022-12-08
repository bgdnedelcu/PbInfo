package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/559/5numere

public class Numere5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[5];
		int count = 0;
		int index = 0;
		List<Integer> list = new ArrayList<>();
		while (count < 5) {
			list.add(sc.nextInt());
			count++;
		}

		List<Integer> list2 = new ArrayList<>();
		
		
		
		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
				
				list2.add(max);
				list.remove(list.indexOf(max) == max);
			}
		}
		
		System.out.println(list);
		System.out.println(list2);
		
//		System.out.println(list2);
//		System.out.println(list);

//		for(int i = 0; i < 5; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}

	}
}
