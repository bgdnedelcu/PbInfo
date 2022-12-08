package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/347/summaxmin

public class SumMaxMin {

	public static void main(String[] args) {

		List<Integer> listaNr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		int count = 0;
		int x = sc.nextInt();

		while (count < x) {
			count++;
			int val = sc.nextInt();
			listaNr.add(val);

		}

		
		int max = 0;
		int min = 9999;

		for (int i = 0; i < listaNr.size(); i++) {
			if (listaNr.get(i) > max) {
				max = listaNr.get(i);
			}
			if (listaNr.get(i) < min) {
				min = listaNr.get(i);
			}

		}

//		for(Integer elem : listaNr) {
//			if(elem > max) {
//				max = elem;
//			}
//			
//			if(elem < min) {
//				min = elem;
//			}
//		}

		int sum = max + min;
		System.out.println(sum);

	}

}
