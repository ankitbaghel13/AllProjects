package Harman;

public class A {

	int i=0;
	
	public A(){
		i=8;
	}
	public static void main(String[] args) {
		A h = new A();
		while(h.i<=10)
			h.doIt();
	}
	
	private static void doIt() {
		i++;
		System.out.println("hello");
	}

}
