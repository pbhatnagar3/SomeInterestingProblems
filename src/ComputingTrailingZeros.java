import java.util.Scanner;

/**
 * Computing the number of trailing zeros of a factorial
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 *
 */
public class ComputingTrailingZeros {

	public int numberOfTrailingZeros(int num){
		int count = 0;
		for(int i = 0; i < num; i++){
			count += noOfFives(i);
		}
		
		return count;
	}
	
	public int noOfFives(int num){
		int factor = 5;
		int count = 0;
		while(true){
			count += num/factor;
			factor *= 5;
			if(factor > num)
				break;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number for which you want to find the number of trailing zeros");
		int num = scan.nextInt();
		ComputingTrailingZeros compute = new ComputingTrailingZeros();
		System.out.println("The number of trailing zeros in the factorial is " + compute.noOfFives(num));
	}
}
