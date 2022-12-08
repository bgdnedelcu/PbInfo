package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/46/sumapare

public class SumaPare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();

		int sum = 0;
		for (int i = 2; i <= n * 2; i++) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}
		
		for(int i = 0; i < list.size(); i++) {
			sum+=list.get(i);
		}
		
		System.out.println(sum);

	}

}
