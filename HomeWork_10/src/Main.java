public class Main {
    public static void main(String[] args) {
        String str = "I like Java !!!";
        String str2 = "Мадам и казак построили шалаш и поселились тут";
        System.out.println(str.charAt(str.length() - 1));
        System.out.println(str.endsWith("!!!"));
        System.out.println(str.startsWith("I like"));
        System.out.println(str.contains("Java"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.replace("a", "o"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.replace(str.substring(7, 11), ""));
        find3to5SymbolsWords(str);
        System.out.println("Самое маленькое слово - " + getSmallestWordFromText(str));
        System.out.println("Самое большое слово - " + getBiggestWordFromText(str));
        concat1stWordBeginningAnd2ndWordEnding("test","dama");
        findPalindromesFromText(str2);

        StringBuilder builder = new StringBuilder("3 + 56 = ");
        System.out.println(builder.append(59));

        builder.replace(2,3,"-");
        System.out.println(builder.delete(9,11).append(-53));

        builder.replace(2,3,"*");
        System.out.println(builder
                .deleteCharAt(9)
                .deleteCharAt(9)
                .deleteCharAt(9)
                .append(1)
                .append(6)
                .append(8));

    }
    public static void findPalindromesFromText(String str) {
        String[] strArr = str.toLowerCase().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            if(isPalindrome(strArr[i])) {
                System.out.print(strArr[i] + "; ");
            }
        }
        System.out.println();
    }

    public static boolean isPalindrome(String word){
        char[] letters = word.toCharArray();
        boolean isPalindrome = true;
        int j = letters.length-1;
        for (int i = 0; i < j; i++) {
            if(letters[i] != letters[j]) isPalindrome = false;
            j--;
        }
        if(letters.length == 1) isPalindrome = false;
        return isPalindrome;
    }

    public static void find3to5SymbolsWords(String str) {
        String[] strArr = new String[str.split(" ").length];
        strArr = str.split(" ");
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() >= 3 && strArr[i].length() <= 5) {
                System.out.print(strArr[i] + "; ");
            }
        }
        System.out.println();
    }

    public static String getSmallestWordFromText(String text) {
        String strArr[] = new String[text.split(" ").length];
        strArr = text.split(" ");
        int smallestWordIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() < strArr[smallestWordIndex].length()) {
                smallestWordIndex = i;
            }
        }
        return strArr[smallestWordIndex];
    }

    public static String getBiggestWordFromText(String text) {
        String strArr[] = new String[text.split(" ").length];
        strArr = text.split(" ");
        int biggestWordIndex = 0;
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].length() > strArr[biggestWordIndex].length()) {
                biggestWordIndex = i;
            }
        }
        return strArr[biggestWordIndex];
    }

    public static void concat1stWordBeginningAnd2ndWordEnding (String word1, String word2) {
        int firstWordLastSymbolNum = word1.length()/2;
        int secondWordFirstSymbolNum = word2.length()/2;
        String beginning = word1.substring(0,firstWordLastSymbolNum);
        String ending = word2.substring(secondWordFirstSymbolNum);
        System.out.println(beginning+ending);
    }
}