package JavaPolymorphism;
class Cons{
	int a;
	String s;
	int id;
	Cons(int a,String s,int id){
		this.a=a;
		this.s=s;
		this.id=id;
	}
	/*Cons(int a,String s,int id){
		this.a=a;
		this.s=s;
		this.id=id;
	}*/
	Cons(Cons s){
		this.a=s.a;
		this.s=s.s;
		this.id=s.id;
	}
	void display(){
		System.out.println(a+" "+s+" "+id);
	}
}
public class Constructor {
	public static void main(String[] args) {
Cons c=new Cons(1,"sure",102);	
Cons c1=new Cons(c);
c.display();
c1.display();
	}

}
