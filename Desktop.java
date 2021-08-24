package week3.day3;

public class Desktop implements HardWare, Software {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop obj1 = new Desktop();
		obj1.softwareResources();
		obj1.hardwareResources();
		obj1.repairResources();		 
	}

	public void softwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Accessing Software Resources method from Software Interface");

	}

	public void hardwareResources() {
		// TODO Auto-generated method stub
		System.out.println("Accessing hardware Resources method from hardware Interface");

	}

	public void repairResources() {
		// TODO Auto-generated method stub
		System.out.println("Accessing own method in Desktop");
	}
	
	
	
}
