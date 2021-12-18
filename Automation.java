package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool  {

	public void Selenium() 
	{
		System.out.println("Selenium method in interface Testtool"); 
	}

	public void Java()
	{
		System.out.println("Java is a method from interface");
	}
	@Override
	public void ruby() {
		System.out.println("This is ruby from abstract class");
		
	}
	
	public static void main(String[] args) {
		Automation test=new Automation();
		test.Selenium();
		test.python();
		test.ruby();
		test.Java();

	}

	
}
