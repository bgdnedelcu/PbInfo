package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/48/sumapatrate1

public class SumaPatrate1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int suma = 0;
		
		for(int i = 1; i < 1000; i++) {
			list.add(i*i);
		}
		
		for(Integer elem : list) {
			if(elem <= n) {
				suma += elem;
			}
		}
		
		System.out.println(suma);

	}

}
