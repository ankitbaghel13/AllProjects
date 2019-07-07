package Harman;

public class B{

	public static void main(String[] args) throws CloneNotSupportedException {
		/*B b = new B();
		B b1 = (B)b.clone();
		System.out.println(b1.toString());*/
		
		/*String str = new String("a");
		
		System.out.println(str=="a");*/
		B b = new B();
		System.out.println(b.stringSize(null));
		
	}
	
	public int stringSize(Object s){
		try{
			return s.toString().length();
		}catch(Exception ex){
			return -1;
		}finally{
			return 0;
		}
	}
}
