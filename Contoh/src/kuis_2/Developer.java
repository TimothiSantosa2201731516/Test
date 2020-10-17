package kuis_2;

import java.util.Vector;

public class Developer extends Component{

	Vector<Component> devcomponents;

	public Developer(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		devcomponents = new Vector<Component>();
	}
	
	public void work() {
		System.out.println(name+ " is working");
	}

	@Override
	public void manage(Component c) {
		// TODO Auto-generated method stub
		devcomponents.add(c);
	}

	@Override
	protected void printUsingIndentation(int indentation) {
		// TODO Auto-generated method stub
		printIndent(indentation);
	    System.out.println(name);
	    for(Component c : devcomponents) {
		      c.printUsingIndentation(indentation + 2);
		  	}
	}

}
