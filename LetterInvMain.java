
public class LetterInvMain {

    public static void main(String[] args) {
        LetterInv letterinv1 = new LetterInv();
        letterinv1.convertStringToCharArray(letterinv1.getInput());
        letterinv1.LetterInventory();
        letterinv1.printLetterCount();
        System.out.println(letterinv1.getChar('g'));
        System.out.println(letterinv1.addTotal());
        letterinv1.setChar('h', 65);
        letterinv1.printLetterCount();
        System.out.println(letterinv1.toString());

        LetterInv letterinv2 = new LetterInv();
        letterinv2.convertStringToCharArray(letterinv2.getInput());
        letterinv2.LetterInventory();
        letterinv2.printLetterCount();
        
    }
    
}
