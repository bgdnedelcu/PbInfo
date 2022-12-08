package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumaDivizorilorImpari {

	public static void main(String[] args) {
		
		List<Integer> listaDivizori = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		for(int i = 1; i <= x; i++) {
			if(x % i == 0) {
				listaDivizori.add(i);
			}
		}
		
		int sumaDivizoriImpari = 0;
		for(Integer elem : listaDivizori) {
			if(!(elem % 2 == 0)) {
				sumaDivizoriImpari += elem;
			}
		}

		System.out.println(sumaDivizoriImpari);
	}

}
