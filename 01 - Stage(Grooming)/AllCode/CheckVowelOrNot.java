import java.util.Scanner;

public class CheckVowelOrNot{
	public static void main(String[] args) {
		
		Scanner inp = new Scanner(System.in);
		char ch = inp.next().charAt(0);

		if (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'O' || ch == 'o' || ch == 'U' || ch == 'u' ) {
			System.out.println(ch + " is a Vowel\n");
		}else{
			System.out.println(ch + " is a Consonant\n");
		}
	}
}