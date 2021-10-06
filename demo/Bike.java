package demo;

public class Bike {

	private int var;
	private int var2;

	public int getVar() {
		return var;
	}

	public void setVar(int var) {
		this.var = var;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public void run() {
	}; // declaration

	public void method1() {

	}

}

class Honda extends Bike {

	@Override
	public void run() {
		System.out.println("jsbdjsbd");

	}
	
	Bike obj = new Bike();
	int a = obj.getVar();

}
