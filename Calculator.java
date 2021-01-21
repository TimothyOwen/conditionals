package operator;

public class Calculator {
	public static int addition(int Int1, int Int2) {
		int result = Int1 + Int2;
		return result;
	}
	public static int subtraction(int Int1, int Int2) {
		int result = Int1 - Int2;
		return result;
	}
	public static int multiplication(int Int1, int Int2) {
		int result = Int1 * Int2;
		return result;
	}
	public static double division(double Int1, double Int2) {
		if(Int1 < Int2) {
			double result = Int1 / Int2;
			return result;
		}else {
			System.out.println("Error: Second parameter must be greater than first");
			double error = 0;
			return error;
		}
	}
	public static void main(String[] args) {
		System.out.println("Addition: "+addition(10,5));
		System.out.println("Subtraction: "+subtraction(10,5));
		System.out.println("Multiplication: "+multiplication(10,5));
		System.out.println("Division: "+division(5,2));
	}
}
