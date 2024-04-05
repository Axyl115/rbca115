package git115;

public class program5 {
	public static boolean isArmstrong(int number) {
		int originalNumber=number;
		int numDigits=String.valueOf(number).length();
		int sum=0;
		
		while (number>0) {
			int digit=number%10;
			sum+=Math.pow(digit, numDigits);
			number /=10;
		}
		return originalNumber==sum;
	}

}
