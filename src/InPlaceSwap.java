/**
 * Does the inplace swap. Written for fun. 
 */
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements swapping of two integers without using a temprary buffer
 * @author pbhatnagar
 *  * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 *
 */
public class InPlaceSwap {
	public static void swap(Integer a, Integer b){
		b = a + b;
		a = (b + (b-2*a))/2;
		b = b - a;
		System.out.println("The damade has been done :P. Lol jk, the swap has successfully completed");
		System.out.println(String.format("The new value of the first number is %d and second number is %d.", a, b));

	}
	
	public static void swapEfficient(Integer a, Integer b){
		a = a - b;
		b = a + b;
		a = b - a;
		System.out.println("the new values of a and b are" + a + " & " + b);
	}
	
	public static void swapSuperEfficient(Integer a, Integer b){
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("The new values are " + a + " & "+ b );
	}
	public void testing(Integer a){
		a = a + 7;
	}
	public static void main(String[] args) {
		System.out.println("Enter two numbers of your choice");
		Scanner scan = new Scanner(System.in);
		Integer num1 = scan.nextInt();
		Integer num2 = scan.nextInt();
		swapSuperEfficient(num1, num2);

	}
}
