import java.util.Scanner;

/**
 * Given a number, figure out the English translation for it
 * @author pbhatnagar
 * If you have any questions or comments, please feel free to contact
 * me at pbhatnagar3@gatech.edu
 *
 * MAY THE FORCE OF COMPILER BE WITH YOU. :D
 *
 */
public class EnglishConverter {

	String[] units = {"one", "two", "three", "four", "five",
			"six", "seven", "eight", "nine"};
	String[] tens = {"ten", "twenty", "thirty", "forty", "fifty",
			"sixty", "seventy", "eighty", "ninty"};
	String[] teens = {"eleven", "twelve", "thirteen", "fourteen", "fifteen",
			"sixteen", "seventeen", "eighteen", "ninteen"
	};

	public String converter(int num){
		if(num == 0){
			return "";
		}
		String output = "";
		if(num >= 1000000){
			output = output + converter(num/1000000) + " million ";
			num = num % 1000000;
		}
		if(num >= 1000){
			output = output + converter(num/1000) + " thousand ";
		}
		output = output + converter100(num%1000) + " "+ converter10(num%100);
		return output;
	}

	public String converter10(int num){

		String output = "";
		if(num > 10 && num < 20){
			output = teens[num%10 - 1];
			return output;
		}
		else if(num > 20 || num == 10){
			output = tens[num/10-1];
		}
		int unit = num % 10;
		if(unit == 0)
			return output;
		output = output + " " + units[unit - 1];

		return output;
	}
	public String converter100(int num){
		if(num < 100)
			return "";
		num /= 100;
		return units[num-1] + " hundred";
	}

	public static void main(String[] args) {
		while(true){
			System.out.println("enter the number to be converted");
			Scanner scan = new Scanner(System.in);
			int num = scan.nextInt();
			EnglishConverter converter = new EnglishConverter();
			//		System.out.println(converter.converter100(num));
			System.out.println(converter.converter(num));
		}
	}
}
