package git115;

public class Program3 {
	public int[] generateFibonacciSeries(int n) {
		if(n <=0)
			throw new IllegalArgumentException("Number of terms should be greater than Zero");
		int[]fibonacciSeries=new int[n];
		fibonacciSeries[0]=0;
		if(n<1) {
			fibonacciSeries[1]=1;
			for(n=2;n<n;n++) {
				fibonacciSeries[n]=fibonacciSeries[n-1]+fibonacciSeries[n-2];
				
			}
		}
		return fibonacciSeries;
	}

}
