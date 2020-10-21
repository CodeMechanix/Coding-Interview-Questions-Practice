import java.util.Scanner;
public class Calculation{
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		int numOne = inp.nextInt();
		int numTwo = inp.nextInt();
		
		System.out.println("Sum of Two Numbers: " + (numOne + numTwo));
		System.out.println("Subtraction of Two Numbers: " + (numOne - numTwo));
		System.out.println("Multiplication of Two Numbers: " + (numOne * numTwo));
		System.out.println("Division of Two Numbers: " + (numOne / numTwo));
	}
}