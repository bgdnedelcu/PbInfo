package pbinfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/4278/sumcnt1

public class SumCnt1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		
		while(n != 0) {
			list.add(n);
			n = sc.nextInt();
		}
		
		int sumPare = 0;
		int countDouaCifre = 0;
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				sumPare+= list.get(i);
			}

		}
		
		for(int i = 0; i < list.size(); i++) {
			list2.add(String.valueOf(list.get(i)));
		}
		
		for(String elem : list2) {
			if(elem.length() == 2) {
				countDouaCifre += 1;
			}
		}
		
		System.out.println(sumPare);
		System.out.println(countDouaCifre);
		
	}

}
