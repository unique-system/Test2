package JavaPolymorphism;

class Superc{
	Superc(){
		System.out.println("parent class constructor");
	}
}
class Child extends Superc{
	Child(){
		//super();
		//System.out.println("child class constructor");
	}
}
public class SuperCons {
	public static void main(String[] args) {
		Child c=new Child();
	}

}
