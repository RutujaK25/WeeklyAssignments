package week3.day1;

public class StudentOverloading {
	
	public void getStudentInfo(int id)
	{
		
	}
	
	public void getStudentInfo(int id,String name)
	{
		
	}
	
	public void getStudentInfo(String email,long phone)
	{
		
	}
	
	public static void main(String[] args) {
		
		StudentOverloading student = new StudentOverloading();
		
		student.getStudentInfo(234);
		
		student.getStudentInfo(2344, "Emma");
		
		student.getStudentInfo("emmawatson.@gmsil.co.uk", 3992090);
		
	}
	

}
