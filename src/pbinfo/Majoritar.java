package pbinfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//https://www.pbinfo.ro/probleme/497/majoritar

public class Majoritar {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		class Foo 
        {
            public int i = 3;
        } 
		Object a = new Object();
        Object o = (Object)new Foo();
        Foo foo = (Foo)a;
		
		Scanner sc = new Scanner(System.in);
		
		int nr = sc.nextInt();
		int count = 0;
		int[] arr = new int[nr]; 
		int index = 0;
		
		while(count < nr) {
			count++;
			int val = sc.nextInt();
			arr[index++] = val;
		}
		
		Map<Integer, Integer> mapAp = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if (mapAp.containsKey(arr[i])) {
				mapAp.put(arr[i], mapAp.get(arr[i]) + 1);
			} else {
				mapAp.put(arr[i], 1);
			}

		}
		
		for (Integer i : mapAp.keySet()) {
			if (mapAp.get(i) > arr.length / 2) {
				System.out.println("DA " + i);
			}
		}

	}

}
