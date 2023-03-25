import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str = "I like Java !!";
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a","o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace(str.substring(7, 11), ""));
        findPalindromesFromText(str);
        find3to5SymbolsWords(str);

    }
    public static void findPalindromesFromText(String str) {
        String[] strArr = new String[str.split(" ").length];
        strArr = str.split(" ");

        for (int i = 0; i < strArr.length; i++) {
            strArr[i].length();
        }
    }

    public static void find3to5SymbolsWords(String str) {
        String[] strArr = new String[str.split(" ").length];
        strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if(strArr[i].length() >= 3 && strArr[i].length() <= 5) {
                System.out.print(strArr[i] +"; ");
            }
        }
    }
}