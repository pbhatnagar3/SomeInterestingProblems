import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * Compare two sequences and print out how many direct hit and how many partial hits
 * @author pbhatnagar
 *
 */
public class ComparingSequences {

	public void comparingSequences(String str1, String str2){
		if(str1.length() != str2.length()){
			System.out.println("Invalid input");
			return;
		}
		final Map<Character, Integer> mapper = new HashMap<Character, Integer>();
		final Set<Integer> recordKeeper = new HashSet<Integer>();
		int directHit = 0;
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) == str2.charAt(i)){
				directHit++;
				recordKeeper.add(i);
			}
			else{
				if(mapper.containsKey(str1.charAt(i)))
					mapper.put(str1.charAt(i), mapper.get(i));
				else
					mapper.put(str1.charAt(i), 1);
			}

			//the above code will take care of directHit
		}
		//taking care of partialHits
		int partialHit = 0;
		for(int i = 0; i < str2.length(); i++){
			if(recordKeeper.contains(i))
				continue;
			if(mapper.containsKey(str2.charAt(i))){
				partialHit++;
				if( mapper.get(str2.charAt(i)) == 1)
					mapper.remove(str2.charAt(i));
				else
					mapper.put(str2.charAt(i), mapper.get(str2.charAt(i))-1);
			}
		}
		System.out.println(String.format("The strings have %d directHits and %d partialHits", directHit, partialHit));
	}

	public static void main(String[] args) {
		ComparingSequences analyser = new ComparingSequences();
		System.out.println("Enter the string 1 and string 2 that need to be compared");
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		analyser.comparingSequences(s1, s2);

	}

}
