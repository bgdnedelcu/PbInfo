package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/388/numarul-divizorilor-pari

public class NrDivizoriPari {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		List<Integer> listaDivizori = new ArrayList<>();

		for (int i = 1; i <= x; i++) {
			if (x % i == 0) {
				listaDivizori.add(i);
			}

		}
		
		int nrDivizoriPari = 0;
		for(int j = 0; j < listaDivizori.size(); j++) {
			if(listaDivizori.get(j) % 2 == 0) {
				nrDivizoriPari++;
			}
			
		}
		
		System.out.println("Lista divizorilor numarului " + x + ": " + listaDivizori);
		System.out.println("Numarul " + x + " are " + nrDivizoriPari + " divizori pari");

	}

}
