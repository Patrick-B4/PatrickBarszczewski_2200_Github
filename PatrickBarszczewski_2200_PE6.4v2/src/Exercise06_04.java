/***************************************************
 * 
 * @author Patrick Barszczewski 
 * Date: 11/16/2022 [w]
 *
 */
import java.util.Scanner;
public class Exercise06_04 {
	public static void main(String[] args) {
		System.out.print("Enter an integer: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		if (number < 0) {
			System.out.print("-");
			reverse(number);
		}else {
			reverse(number);
		}
		input.close();
		
	}
	public static void reverse(int n) {
		if ( n == 0) {
			System.out.print(n);
		}
		while (n != 0) {
			System.out.print(Math.abs(n % 10));
			n = n/10;
		}
	}
}
