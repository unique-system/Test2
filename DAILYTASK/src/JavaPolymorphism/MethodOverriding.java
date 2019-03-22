package JavaPolymorphism;
class Overriding{
	void dog(){
		System.out.println("color is white");
	}
}
public class MethodOverriding extends Overriding{
	void dog(){
		System.out.println("name is tommy");
	}

	public static void main(String[] args) {
		MethodOverriding m=new MethodOverriding();
		m.dog();
		Overriding o=new Overriding();
		o.dog();
	}

}
