package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3976/prodimpare

public class ProdImpare {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int produs = 1;;

		for (int i = 1; i <= 9999; i++) {
			if (i % 2 != 0) {
				list.add(i);
			}
		}

		for (int i = 0; i < n; i++) {
			produs *= list.get(i);
		}
		
		System.out.println(produs);

	}

}
