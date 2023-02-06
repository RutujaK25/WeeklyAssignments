package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		int num=30;
		boolean isPrime=true;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num + " is a Prime");
		}
		else
		{
			System.out.println(num + " is not a prime");
		}

	}

}
