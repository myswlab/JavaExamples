package it.unibs.ing.fp.esercizi_lezione.hello;

public class Hello {
    String msg;
	public Hello(String string) {
		msg=string;
	}
	
	public Hello() {
		msg="Hello";
	}
	
	public String sayHello() {
		return msg+", "+"World"+"!";
	}

	public String sayHelloTo(String string) {
		// TODO Auto-generated method stub
		return msg+", "+ string+"!";
	}

}
