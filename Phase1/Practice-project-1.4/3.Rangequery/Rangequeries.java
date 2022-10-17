package Rangequery;

public class Rangequeries {
	
		
		public static void main(String args[]) 
	    { 
	        int arr[] = { 4, 3, 2, 1, 9, 5,6,8 }; 
	        int n = arr.length;

	        Rangequeries.buildSparseTable(arr, n); 
	        
	        System.out.println(Rangequeries.query(0, 4)); 
	        System.out.println(Rangequeries.query(2, 5)); 
	        System.out.println(Rangequeries.query(3, 5)); 
	    } 
		static int k = 16;
		static int N = 100000;
		
		static long table[][] = new long[N][k + 1];

		static void buildSparseTable(int arr[], int n) {
			
			for (int i = 0; i < n; i++)
				table[i][0] = arr[i];
			for (int j = 1; j <= k; j++)
				for (int i = 0; i <= n - (1 << j); i++)
					table[i][j] = table[i][j - 1] + table[i + (1 << (j - 1))][j - 1];
		}

		static long query(int L, int R) {
			long answer = 0;
			for (int j = k; j >= 0; j--) {
				if (L + (1 << j) - 1 <= R) {
					answer = answer + table[L][j];
					L += 1 << j;
				}
			}
			return answer;
		}

}