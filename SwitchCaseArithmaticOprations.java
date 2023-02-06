package week1.day2;

public class SwitchCaseArithmaticOprations {

	public static void main(String[] args) {
		
		int no1 = 1,no2 = 2;
		
		String opration = " ";
		
		switch(opration) {
		
		case "Add":
			
		int add = no1+no2;
			
			System.out.println("Addition : " + add);
			
			break;
			
		case "Sub":
			
			int sub = no1-no2;
				
				System.out.println("Subtraction : " + sub);
				
				break;
			
		case "Mul":
			
			int mul= no1*no2;
				
				System.out.println("Multiplication : " + mul);
				
				break;
				
		case "Div":
			
			int div = no1/no2;
				
				System.out.println("Division : " + div);
				
				break;
				
				default:
					
					System.out.println("Invalid choice of opration!");
					
					break;
			
		}
		
		

	}

}
