
public class LetterInvMain {

    public static void main(String[] args) {
        LetterInv letterinv1 = new LetterInv();
        letterinv1.convertStringToCharArray(letterinv1.getInput());
        letterinv1.LetterInventory();
        System.out.println(letterinv1.printLetterCount());
        System.out.println(letterinv1.getChar('g'));
        System.out.println(letterinv1.addTotal());
        
    }


}
