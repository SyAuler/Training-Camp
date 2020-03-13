package prjSortMethods;

public class mergesortTeste {
	
	public static void interleave( int iStart, int iMidle, int iEnd) {
		int[] v = {0,3,6,1,2,4,5,7,8};
		iStart = 0; 
		iMidle = 3; 
		iEnd = 9;
		
		int[] w = new int[iEnd - iStart];
		
		for (int i = iStart; i < iMidle; i++) {
			w[i - iStart] = v[i];
		}
		for (int i = 0; i < iEnd - iMidle; i++) {
			w[iMidle - iStart + i] = v[iEnd - i - 1];
		}
		int i = 0; 
		int j = w.length-1; 
		int k = 0;
		
		while (i <= j) {
			if (w[i] < w[j]) {
				v[iStart + k++] = w[i++];
			} else {
				v[iStart + k++] = w[j--];
			}
		}
		
		for (int m = 0; m < w.length; m++) {
			System.out.print(w[i]);
		}			
	}
}
