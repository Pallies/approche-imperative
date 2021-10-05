package fr.algorithmie;

public class InteractifFibonacci {

	public static void main(String[] args) {

		fibonacci(10);
		fibonacciRecursif(10);
	}

	public static void fibonacci(int nb) {
		int fib1 = 0;
		int fib2 = 1;
		for (int index = fib1; index <= nb; index++) {
			if (index == 0) {
				System.out.print(fib1 + " ");
			}
			System.out.print(fib2 + " ");
			int t = fib2;
			fib2 += fib1;
			fib1 = t;
		}
	}

	public static int fibonacciRecursif(int nb, int fib1, int fib2) {
		if (nb < 0) {
			return 0;
		}
		if (fib1 == 0) {
			System.out.print(fib1 + " " + fib2 + " ");
		} else {
			System.out.print(fib2 + " ");
		}
		return fibonacciRecursif(nb - 1, fib2, fib2 + fib1);
	}

	public static int fibonacciRecursif2(int nb) {
		return 0;
	}
}
