package kuis_2;

import java.util.Vector;

public class Manager extends Component {
	Vector<Component> mancomponents;

	public Manager(String name) {
		// TODO Auto-generated constructor stub
		super(name);
		mancomponents = new Vector<Component>();
	}
	
	@Override
	public void manage(Component c) {
		// TODO Auto-generated method stub
		mancomponents.add(c);
	}

	@Override
	protected void printUsingIndentation(int indentation) {
		// TODO Auto-generated method stub
		  printIndent(indentation);
		    System.out.println(name);

		    for(Component c : mancomponents) {
		      c.printUsingIndentation(indentation + 2);
		  	}

}

}
