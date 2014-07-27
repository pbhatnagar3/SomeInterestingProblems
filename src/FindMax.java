import java.util.Scanner;

/**
 * Trying to find the maximum of two numbers without using any comparison. Now that is interesting :D
 * @author pbhatnagar
 * NOTE: this does not take care of the overflow error
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D*
 */
public class FindMax {
	final static int MACHINE_BIT = 31;
	//The following would return 1 if the number is positive and 0 when the number is negative
	public int findDSign(int num){
//		System.out.println(Integer.toBinaryString(num) +  Integer.toBinaryString(num).length());
//		System.out.println((num >> MACHINE_BIT) & 1);
		return ((num >> MACHINE_BIT) & 1) ^ 1; 
	}
	
	public int findMax(int a, int b){
		
		int k = findDSign(a-b);
		int q = k^1;
		return k * a + q * b;
	}
	
	public static void main(String[] args) {
		//this variable is cool because, without using any comparison, it finds the max
		//which is awesome. PS: I am getting bored on a weekend and this is what I will name it. :P :D
		FindMax cool = new FindMax();
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("The bigger number is " + cool.findMax(a, b));
	}
}
