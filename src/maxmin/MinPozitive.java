package maxmin;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/55/minimpozitive

public class MinPozitive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Integer> list = new ArrayList<>();
		int nr = sc.nextInt();

		while (nr != 0) {
			if (nr > 0) {
				list.add(nr);
			}
			nr = sc.nextInt();
		}
		
		int min = 99999;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) < min) {
				min = list.get(i);
			}
		}
		
		System.out.println(list);
		System.out.println(min);
	}

}
