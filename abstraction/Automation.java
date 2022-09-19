package abstraction;

public  class Automation extends MultiLanguage{
	 @Override
	public void selenium() {
		 System.out.println("Testtool:selenium");
		
	}

	@Override
	public void java() {
		 System.out.println("Java support selenium");
		
	}
	@Override
	public void ruby() {
		 System.out.println("Selenium supports Ruby Language");
	}

	public static void main(String[] args) {
		 System.out.println();

		Automation obj=new Automation();
		 
		obj.python();
		obj.ruby();
		obj.java();
		obj.selenium();
		
		
	}

		}

	 

	   



