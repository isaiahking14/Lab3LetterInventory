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

    public String printCharArray(){
        if (input_char_array.length == 0){
            return "[]";
        }
        String result = "[" + input_char_array[0];
        for (int i = 1; i<input_char_array.length; i++){
            result += input_char_array[i];
        }
        return result + "]";
    }

    // prints the LETTERCOUNT char array
    public String printLetterCount(){
        if (letter_count.length == 0){
            return "[]";
        }
        String result = "[a:" + letter_count[0];
        for (int i = 1; i<letter_count.length; i++){
            result += ", " + (char)('a' + i) + ": " + letter_count[i];
        }
        return result + "]";
    }

    public String addTotal(){
        int total = 0;
        for (int i = 0; i < letter_count.length; i++){
            total += letter_count[i];
        }
        return "The strings total letter count is " + total;
    }

    public String getChar(char input){
        if (Character.isLetter(input)) {
            input = Character.toLowerCase(input);
            if (input >= 'a' && input <= 'z') {
                return "The entered string contains " + letter_count[input - 'a'] + " " + input +"'s";
            }
            else{
                throw new IllegalArgumentException("Please enter a Char into the method");
            }
        }
        else{
            throw new IllegalArgumentException("Please enter a Char into the method");
        }
    }

    public void setChar(char input, int value){
        if (Character.isLetter(input)){
            input = Character.toLowerCase(input);
            if (input >= 'a' && input <= 'z' && value >= 0){
                letter_count[input - 'a'] = value;
            }
            else {
                throw new IllegalArgumentException("Please enter a valid value and character. Must be a alphabetic character," +
                " and the value must be positive");
            }
        }
        else {
            throw new IllegalArgumentException("Please enter a valid value and character. Must be a alphabetic character," +
            " and the value must be positive");
        }
    }

    

    // counts array for each of the char
    public int[] LetterInventory(){
        for (int i = 0; i < input_char_array.length; i++) {
            char strings_char = input_char_array[i];
            if (strings_char >= 'a' && strings_char <= 'z') {
                // increment the count for the corresponding char
                letter_count[strings_char - 'a']++;
            }
        }
        return letter_count;
    }
}
