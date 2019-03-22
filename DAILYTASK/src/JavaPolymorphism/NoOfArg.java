package JavaPolymorphism;

public class NoOfArg {
	static int add1(int a,int b){return a+b;}  
		static double add(int a,int b,int c){return a+b+c;}  
		static int sub(double a,double b){return (int) (a-b);}  
		static double sub1(double a,int b,int c){return a+b+c;}  
		}  
		class TestOverloading3{  
		public static void main(String[] args){  
		System.out.println(NoOfArg.add1(11,11));//ambiguity  
		System.out.println(NoOfArg.add(11,11,12));//ambiguity  
		System.out.println(NoOfArg.sub(11.5,11.9));//ambiguity  
		System.out.println(NoOfArg.sub1(11.7,11,12));
		}  
}
