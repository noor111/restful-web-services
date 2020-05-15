package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

public class MagicSquare {
	
	private static int N = 3; 
	
	public static boolean isMagicSquare(int mat[][]) {
		
		int sum = 0;
		int sum2 = 0;				
		
		// sum of prime diagonal
		for (int i = 0; i < N; i++) {
			sum = sum + mat[i][i];
		}
		
		// sum of secondary diagonal
		for (int i = 0; i < N; i++) {
			sum2 = sum2 + mat[i][N-1 - i];
		}
		
		if (sum != sum2) {
			return false;
		}
		
	
		
		// sum of rows
		for (int i = 0; i < N; i++) {
			int rowSum = 0;
			for (int j = 0; j < N; j++) {
				rowSum = rowSum + mat[i][j];
			}
			if (sum != rowSum) {
				return false;
			}
		}
		
		for (int i = 0; i < N; i++) {
			int colSum = 0;
			for (int j = 0; j < N; j++) {
				colSum = colSum + mat[j][i];
			}
			if (sum != colSum) {
				return false;				
			}
		}
		
		return true;
	}

}
