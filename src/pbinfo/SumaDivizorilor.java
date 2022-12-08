package pbinfo;

import java.util.ArrayList;
import java.util.List;

public class SumaDivizorilor {
	
	
	//https://www.pbinfo.ro/probleme/376/suma-divizori
	//suma divizorilor
	public static int sumaDivizorilor(int n) {
		int suma = 0;
		List<Integer> listaDivizor = new ArrayList<>();
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				listaDivizor.add(i);
			}
		}
		
		for(int j = 0; j < listaDivizor.size(); j++) {
			suma += listaDivizor.get(j);
		}
		
		return suma;
		
	}
	
	public static void main(String[] args) {
		
		int sumDiv = sumaDivizorilor(8);
		System.out.println(sumDiv);

	}

}
