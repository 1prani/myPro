package com.amazon.mobileprice;

public class ArrayPractice_1D {

	public static void main(String[] args) {

		int a[] = new int[5];

		a[0] = 10;// initialization
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

		int b[] = { 7, 1, 3, 2, 2, 5, 5, 5, 8, 1 };

		int max = b[0];

		for (int i = 1; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];

			}

		}
		System.out.println(max);

	}

}
