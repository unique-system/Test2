package JavaPolymorphism;

public class MethodOverloading {
void add(int d,int e){
	System.out.println("integer,int value");
}
void add(double a,int d){
	System.out.println("double,int value");
}
void add(int d,double e){
	System.out.println("integer,double value");
}
void add(double a,double d){
	System.out.println("double,double value");
}
	public static void main(String[] args) {
		MethodOverloading m=new MethodOverloading();
		m.add(10.5,0);
		m.add(5.5,7.7);
		m.add(10,7.6);
		m.add(5,7);
		

	}

}
