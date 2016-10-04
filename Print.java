// Write a program to print the result of the following expressions provided the integer variable a is 20 and b is 10

public class Print {
	
	public static void main(String[] args){
	// Given Variable with Value
	int a = 20;
	int b = 10;
	
	// Given Expression
	    b = a-- - --a;
	int c = a--;
	int d = a>>2;
	int e = a&b;
	
	// Printing all expressions one by one
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	
	
}
}