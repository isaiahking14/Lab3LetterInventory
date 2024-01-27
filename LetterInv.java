import java.util.*;

public class LetterInv {
private int[] letter_count;
private char[] input_char_array;

    public LetterInv() {
        letter_count = new int[26];
    }

    // get string from user to count
    public String getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the String you would like to count. ");
        String input = scan.nextLine();
        return input.toLowerCase();
    }


    // converts the input string into a char array
    public char[] convertStringToCharArray(String input) {
        input_char_array = input.toCharArray();
        Arrays.sort(input_char_array);
        return input_char_array;
    }

    // prints the LETTERCOUNT char array
    public String printLetterCount(){
        if (letter_count.length == 0){
            return "[]";
        }
        String result = "[" + letter_count[0];
        for (int i = 1; i<letter_count.length; i++){
            result += ", " + letter_count[i];
        }
        return result + "]";
    }

    // counts array for each of the char
    public int[] LetterInventory(){
        for (int i = 0; i < input_char_array.length; i++) {
            char currentChar = input_char_array[i];
            if (currentChar >= 'a' && currentChar <= 'z') {
                // increment the count for the corresponding char
                letter_count[currentChar - 'a']++;
            }
        }
        return letter_count;
    }
}
