import java.io.*;
import java.util.*;

public class LetterFreq {

	public static void main(String[] args) throws IOException {
	System.out.println("Please enter the name of the file (don't include the .txt postfix!!!): ");
        Scanner s = new Scanner(System.in);
        String file_name = s.nextLine();

        //read the file
        File file = new File(file_name);
        BufferedReader in_file = new BufferedReader(new FileReader(file));

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        int ascii;
        char ch;
        while ((ascii = in_file.read()) != -1) {
        	ch = (char)ascii;
        	Integer counter = map.get(ch);
        	//if the character does not exist in the current hashmap
        	if(map.get(ch) == null) {
        		map.put(ch, 1);
        	}
        	//if the character already exist in the map
        	else {
        		map.put(ch, ++counter);
        	}
        }

        for (Map.Entry m: map.entrySet()) {
        	System.out.println ("frequency of " + m.getKey() + " is " + m.getValue());
        }
	}
}