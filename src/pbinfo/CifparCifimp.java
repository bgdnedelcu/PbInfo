package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/3664/cifparcifimp

public class CifparCifimp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int count = 0;
		int[] arr = new int[n];
		int index = 0;
		while (count < n) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}

		List<String> list = new ArrayList<>();

		int pare = 0;
		int impare = 0;

		for (int i = 0; i < arr.length; i++) {
			String s = Integer.toString(arr[i]);
			list.add(s);
		}

		int ind = 0;

		for (int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) % 2 == 0) {
					pare++;
				}else {
					impare++;
				}
			}
		}
		
		System.out.println(pare);
		System.out.println(impare);

	}
}
