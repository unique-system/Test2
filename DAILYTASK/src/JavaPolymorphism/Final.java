package JavaPolymorphism;
class Bike{
	final void m1(){
		System.out.println("final");
	}}

	class Car{
		void m2(){
			System.out.println("m2 method");
		}
		final void m1(){
			System.out.println("final not override");
		}
	}

public class Final {
	public static void main(String[] args) {
		Bike b=new Bike();
		b.m1();
		Car c=new Car();
		c.m2();
		c.m1();
		
	}

}
