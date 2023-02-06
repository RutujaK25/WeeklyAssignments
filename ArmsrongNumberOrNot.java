package week1.day1;

public class ArmsrongNumberOrNot {

	public static void main(String[] args) {
		
		int no=153;
		
		int sum=0,r;
		
		int temp=no;
		
		while(no>0)
			
		{
			r=no%10;
			
			no=no/10;
			
			sum=sum+r*r*r;
		}
		
		if(temp==sum)
			
		{
			
			System.out.println("It's an Armstrong number!");
			
		}
	
		else
						
			System.out.println("It's not an Armstrong number!");

	}

}
