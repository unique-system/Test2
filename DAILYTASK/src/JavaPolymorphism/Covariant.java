package JavaPolymorphism;
class Animal{
	String name="tommy";int legs=4;
	void color(){
		System.out.println("color is white");}}
public class Covariant extends Animal{
	String type="lovebirds";int count=2;
	void color(){
		System.out.println("color is green with blue");
	}
	public static void main(String[] args) {
		Covariant  c=new Covariant ();
		System.out.println(c.type);
		c.color();
		Animal a=new Animal();
		System.out.println(a.name);
		a.color();
		//covariat type
		Animal an=new Covariant();
		System.out.println(an.name);
		System.out.println(an.legs);
		//System.out.println(an.type);
		an.color();
		//Covariant co=new Animal();[error]
		}}
