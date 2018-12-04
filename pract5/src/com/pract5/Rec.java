package com.pract5;

public class Rec {
	
	int recFunc(int n, int count, int a) {
		
		int check = 0;
		System.out.print(a + " ");
		count++;
		if (a == count) {
			a++;
			count = 0;
			check = 1;
		}	
		if ((n + 1 == a) && (check == 1)) {
			return 1;
		}
		return recFunc(n, count, a);
		
	}

}
