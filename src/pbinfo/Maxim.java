package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maxim {

	// https://www.pbinfo.ro/probleme/354/n-maxim

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> listaNr = new ArrayList<>();
		int cateNr = sc.nextInt();
		int count = 0;
		while (count < cateNr) {
			count++;
			int val = sc.nextInt();
			listaNr.add(val);
		}

		int max = 0;
		for (Integer elem : listaNr) {
			if (elem > max) {
				max = elem;
			}
		}
		System.out.println(max);

	}

}
