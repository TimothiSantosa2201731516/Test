package kuis_2;

import java.util.Vector;

public abstract class Component {
	protected String name;

	public Component(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public abstract void manage(Component c);
	
	public final void print() {
	    printUsingIndentation(0);
	  }

	  protected abstract void printUsingIndentation(int indentation);
	  protected void printIndent(int n) {
	    for(int i = 0; i < n; i++) { System.out.print(" "); }
	  }

}
