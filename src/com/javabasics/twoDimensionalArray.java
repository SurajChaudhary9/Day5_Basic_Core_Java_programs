package com.javabasics;

import java.util.Scanner;

public class twoDimensionalArray {
	public static void print2DArray(int a[][]) {
		System.out.println("The two dimentional array is");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void scan2Darray(int arr[][]) {
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = scanner.nextInt();
				scanner.close();
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the value of M rows and N columns");
		Scanner scanner = new Scanner(System.in);
		int M = scanner.nextInt();
		int N = scanner.nextInt();
		int[][] arr = new int[M][N];
		scan2Darray(arr);
		print2DArray(arr);
		scanner.close();

	}

}
