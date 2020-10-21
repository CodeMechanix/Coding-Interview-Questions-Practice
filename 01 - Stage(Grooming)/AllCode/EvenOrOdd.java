import java.util.Scanner;
public class EvenOrOdd{
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int num = inp.nextInt();
		
		if(num%2 == 0){
			System.out.println("Even Number\n");
		}else{
			System.out.println("Odd Number\n");
		}
	}
}