import java.util.Scanner;
public class AddTwoNums{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int numOne = inp.nextInt();
		int numTwo = inp.nextInt();
		System.out.println("Sum of Two Numbers is: " + (numOne + numTwo));
	}
}