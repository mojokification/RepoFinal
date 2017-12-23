import java.lang.System;

abstract class Abs{
	
	abstract void m1();
	abstract void m2();
	abstract void m3();

	void m4(){

		System.out.println("this is the instance method m4");

	}
}

class Test extends Abs{

	void m1(){
		System.out.println("this is the instance method m1");
	}
	void m2(){
		System.out.println("this is the instance method m2");
	}
	void m3(){

		System.out.println("this is the instance method m3");
	}

}
public class Abstracty{

	public static void main(String args[]){
	
	new Test().m1();
	new Test().m2();
	new Test().m3();
	new Test().m4();
	}	
}
	
