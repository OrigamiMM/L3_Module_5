package algorithms;

import java.util.Stack;

public class FibSequence {
	static Stack<Integer> fib = new Stack<Integer>();
	static int stacklimit = 10;
	static int stackcount = 0;
public static void main(String[] args) {
	fib.push(0);
	System.out.println(0);
	System.out.println(1);
	fib.push(1);
	Fib();
	//syn
}
static void Fib() {
	Integer a;
	Integer b; 
	for (int j = 0; j < stacklimit; j++) {
		b = fib.pop();
		a = fib.pop();
		fib.push(a);
		fib.push(b);
		fib.push(a+b);
		System.out.println(a+b);
	}
}
}
