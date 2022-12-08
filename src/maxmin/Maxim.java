package maxmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/54/maxim

public class Maxim {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();

		int val = sc.nextInt();
		
		if(val == 0) {
			System.out.println("Nu se poate ");
		}else {
			while (val != 0) {
				list.add(val);
				val = sc.nextInt();

			}
		}

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) > max) {
				max = list.get(i);
			}

		}
		
		System.out.println(max);

	}

}
