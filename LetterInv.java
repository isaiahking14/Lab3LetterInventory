import java.util.*;

public class LetterInv {
private int[] letter_count;
private char[] input_char_array;
private int sum = -1;

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

    public String toString(){
        if (input_char_array.length == 0){
            return "[]";
        }
        String result = "[" + input_char_array[0];
        for (int i = 1; i<input_char_array.length; i++){
            result += input_char_array[i];
        }
        return result + "]";
    }

    public boolean isEmpty(){
        if (this.size() == 0){
            return true;
        }
        return false;
    }

    // prints the LETTERCOUNT char array
    public void printLetterCount(){
        String result;
        if (sum == 0){
            result = "[]";
        }
        result = "[a:" + letter_count[0];
        for (int i = 1; i<letter_count.length; i++){
            result += ", " + (char)('a' + i) + ": " + letter_count[i];
        }
            result = result + "]";
        System.out.println(result);
    }

    public int size(){
        return this.sum;
    }

    public String getChar(char input){
        input = Character.toLowerCase(input);
          
        if (input >= 'a' && input <= 'z') {
            return "The entered string contains " + letter_count[input - 'a'] + " " + input +"'s";
        }
            
        else{
            throw new IllegalArgumentException("Please enter a Char a-z into the method");
        }
    }

    public void setChar(char input, int value){
        input = Character.toLowerCase(input);
        if (input >= 'a' && input <= 'z' && value >= 0){
            this.letter_count[input - 'a'] = value;
        }
           
        else {
            throw new IllegalArgumentException("Please enter a valid value and character. Must be a alphabetic character," +
            " and the value must be positive");
        }
    }

    public LetterInv add(LetterInv other){
        StringBuilder sb = new StringBuilder();
        sb.append(this.input_char_array);
        sb.append(other.input_char_array);
        char[] result = sb.toString().toCharArray();
        LetterInv addLetterInv = new LetterInv();
        addLetterInv.input_char_array = result;
        addLetterInv.LetterInventory();
        return addLetterInv;
    }

    public LetterInv subtract(LetterInv other){
        LetterInv subtractLetterInv = new LetterInv();
        subtractLetterInv.input_char_array = this.input_char_array;
        subtractLetterInv.LetterInventory();
        
        for (int i = 0; i < subtractLetterInv.letter_count.length; i++){
            subtractLetterInv.letter_count[i] = subtractLetterInv.letter_count[i]
            - other.letter_count[i];
            if (subtractLetterInv.letter_count[i] < 0){
                subtractLetterInv.letter_count[i] = 0;
            }
        }
        return subtractLetterInv;
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
        int total = 0;
        for (int i = 0; i < letter_count.length; i++){
            total += letter_count[i];
        }
        this.sum = total;
        return letter_count;
    }
}
