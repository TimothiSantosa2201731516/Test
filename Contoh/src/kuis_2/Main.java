package kuis_2;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
		Manager mainman = new Manager("mainman");
		Manager man1 = new Manager("man1");
		Manager man2 = new Manager("man2");
		Developer dev1 = new Developer("dev1");
		
		mainman.manage(man1);
		mainman.manage(man2);
		mainman.manage(dev1);
		
		man1.manage(new Manager("man1a"));
		man2.manage(new Developer("dev2a"));
		dev1.manage(new Manager("mandev1a"));
		
		mainman.print();
		
		dev1.work();
		
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
