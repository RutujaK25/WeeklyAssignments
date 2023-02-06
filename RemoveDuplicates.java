package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "We learn java basics as part of java sessions in java week1";

		int count = 0;

		String[] split = text.split(" ");

		for (int i = 0; i <split.length; i++) {
			
				for (int j = i+1; j < split.length; j++) {
				
				if (split[i].equalsIgnoreCase(split[j])) {
					
					count++;
				}

				if (count > 0) {

					split[j] = "";
					
					count =0;
				}
			}
			
			System.out.print(split[i] + " ");
		}
	}
}
