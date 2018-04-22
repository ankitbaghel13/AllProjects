package org.maven.SpringBasics;

public class HelloWorld {

	private String message;

	public void getMessage() {
		System.out.println("World message : "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void init(){
		System.out.println("INIT");
	}
	
	public void destroy(){
		System.out.println("DESTROY");
	}
}
