package primitive.data.types;

public class MyCharRunner {

    public static void main(String[] args) {

        MyChar ch = new MyChar('B');
        System.out.println(ch.isVowel());
        System.out.println(ch.isConsonant());
        System.out.println(ch.isDigit());
        System.out.println(ch.isAlphabet());
        MyChar.printLowerCaseAlphabets();
        MyChar.printUpperCaseAlphabets();
    }
}
