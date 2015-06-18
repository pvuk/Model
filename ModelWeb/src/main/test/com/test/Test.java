package com.test;

public class Test {
	public static void main(String a[]) {
		boolean isPrime = true;
		for (int i = 1; i <= 100; i++) {
			isPrime = true;
			if (i == 1 || i == 2) {
				isPrime = false;
			}

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.print(i);
			}
		}
	}
}
