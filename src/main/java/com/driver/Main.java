package com.driver;

class A {
	public String meth(){
		return "Invoking method from class A";
	}
}
class B extends A {
 public String meth() {
	 return "Method is overridden in Extendend class B";
 }
}
public class Main {
  public static void main(String[] args){
	  A a = new A();
	  a.meth();
	  B b = new B();
	  b.meth();
  }
}