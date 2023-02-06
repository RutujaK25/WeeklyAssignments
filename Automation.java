package week3.day1;

public class Automation extends MultipleLangauge{
	
	@Override
	public void java() {
		System.out.println("Java Language");
	}

	@Override
	public void Selenium() {
		
		System.out.println("Selenium Automation Tool");
		
	}

	@Override
	void ruby() {
	
	}
	
	public static void main(String[] args) {
		
		Automation tool = new Automation();
		
		tool.java();
		
		tool.Selenium();
		
		tool.python();
		
		tool.ruby();

	}
}

	
	
	
