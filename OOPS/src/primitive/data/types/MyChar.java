package primitive.data.types;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public boolean isVowel() {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    public boolean isConsonant() {
        if(!isVowel() && isAlphabet()) {
            return true;
        }
        return false;
    }

    public boolean isDigit() {
        if(ch >= 48 && ch <=57) { // '0' - '9'
            return true;
        }
        return false;
    }

    public boolean isAlphabet() {
        if(ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) { // 'A' - 'Z' or 'a' - 'z'
            return true;
        }
        return false;
    }

    public static void printLowerCaseAlphabets() {
        for(char c = 'a'; c <= 'z'; c++) {
            System.out.println(c);
        }
    }

    public static void printUpperCaseAlphabets() {
        for(char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c);
        }
    }
}
