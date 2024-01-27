
public class LetterInvMain {

    public static void main(String[] args) {
        LetterInv letterinv1 = new LetterInv();
        letterinv1.convertStringToCharArray(letterinv1.getInput());
        letterinv1.LetterInventory();
        printABC();
        System.out.println(letterinv1.printLetterCount());

        LetterInv letterinv2 = new LetterInv();
        letterinv2.convertStringToCharArray(letterinv2.getInput());
        letterinv2.LetterInventory();
        printABC();
        System.out.println(letterinv2.printLetterCount());
    }


    public static void printABC(){
        System.out.println(" a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z");
    }

}
