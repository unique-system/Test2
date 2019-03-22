package JavaPolymorphism;

public class OverloadMain {
public static void main1(int a){
	System.out.println("main overload1");
}
static public void main2(int b,int c){
	System.out.println("main overload2");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method");
main1(20);
main2(12,14);
	}

}
