package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3979/suma37

public class SumCifreNrNenul {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		String x = String.valueOf(a);

		int sum = 0;
		
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < x.length(); i++) {
			String z = String.valueOf(x.charAt(i));
			int m = Integer.parseInt(z);
			if(m >= 3 && m <= 7 ) {
				sum += m;
			}
		}

		System.out.println(sum);


	}
}