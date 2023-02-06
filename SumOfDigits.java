package week1.day1;

public class SumOfDigits {

	public static void main(String[] args) {
		
		int no=123;
		
		int sum=0;
		
		while(no>0)
			
		{
			int temp;
			
			temp=no%10;
			
			sum=sum+temp;
			
			no=no/10;
		}
		
		System.out.println("sum of digits : " + sum);
	}

}
