package week1.day2;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String name="ChangeOddIndexToUpperCase";
		
		name=name.toLowerCase();
		
		char[] charArray = name.toCharArray();
		
		for (int i = 0; i < charArray.length; i++) {
			
			if(i%2==1)
			{
				charArray[i] = Character.toUpperCase(charArray[i]);
			}
		}
			String str=new String(charArray);
			
			System.out.println(str);
			
		}
	}


