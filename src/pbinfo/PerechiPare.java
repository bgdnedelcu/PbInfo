package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3622/perechipare

public class PerechiPare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int r = sc.nextInt();

		List<Integer> list = new ArrayList<>();

		for (int i = n; i <= r; i++) {
			if (i % 2 == 0) {
				list.add(i);
			}
		}

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size(); j++) {
				System.out.println(list.get(i) + ", " + list.get(j));
//				if(i != j) {                                                                pentru perechi unice
//					System.out.println(list.get(i) + ", " + list.get(j));
//				}
			}
		}
	}

}
