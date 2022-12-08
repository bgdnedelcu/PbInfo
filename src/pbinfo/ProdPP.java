package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProdPP {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		
		int aux = 0;
		int produs = 1;

		for(int i = 1; i< 9999; i++){
			list.add(i*i);
		}
		
//		for(int i = 0; i < n; i++) {
//			produs *= list.get(i);
//		}
		
		
		while(aux < 4) {
			
			produs *= list.get(aux);
			aux++;
		}
		System.out.println(produs);
	}

}
