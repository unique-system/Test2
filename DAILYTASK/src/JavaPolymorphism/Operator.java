package JavaPolymorphism;

public class Operator {
	public static void main(String[] args) {
int v=24; int s=-24; int d=0;
System.out.println("24=" +Integer.toBinaryString(v));
System.out.println("-24=" +Integer.toBinaryString(s));
d=v>>1;
System.out.println("24>>1" +Integer.toBinaryString(d));

d=v>>>1;
System.out.println("24>>>1" +Integer.toBinaryString(d));

d=s>>1;
System.out.println("-24>>1" +Integer.toBinaryString(d));

d=s>>>1;
System.out.println("-24>>>1" +Integer.toBinaryString(d));
	}

}
