package JavaPolymorphism;

class Dog{
	String Type="pug";
	String name="tommy";
	void color(){
		System.out.println("super class method:Dog color is brown");
	}}
public class Super extends Dog{
	int legs=4;
	String name="jeeva";
	void color(){
		System.out.println("super class:" +super.name);
		System.out.println("super class:" +super.Type);
		super.color();
		System.out.println("child class method:Dog color is white");
	}
	public static void main(String[] args) {
		Super s=new Super();
		s.color();
		//System.out.println("child class:" + s.legs);
		//System.out.println("child class:" + s.name);
	}}
