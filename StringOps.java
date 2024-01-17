public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String string = "Hello World";
        System.out.println(capVowelsLowRest(string));
    }

    public static String capVowelsLowRest(String string) {
        char[] Arrey = conversToArray(string);
        char[] array = { 'a', 'e', 'i', 'o', 'u' };
        for (int i = 0; i < Arrey.length; i++) {
            if (isInArray(array, Arrey[i])) {
                Arrey[i] -= 32;
            } else {
                if (Arrey[i] == ' ') {
                    Arrey[i] = ' ';
                } else {
                    if (Arrey[i] >= 'A' && Arrey[i] <= 'Z') {
                        Arrey[i] += 32;
                    } else {
                        Arrey[i] = Arrey[i];
                    }
                }
            }
        }
        String NewString = conversToString(Arrey);
        return NewString;
    }

    public static String camelCase(String string) {
        // Write your code here:
        return "";
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }

    public static char[] conversToArray(String string) {
        char[] charArray = new char[string.length()];
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }

    public static String conversToString(char[] Char) {
        String NewString = "";
        for (int i = 0; i < Char.length; i++) {
            NewString += Char[i];
        }
        return NewString;
    }

    public static boolean isInArray(char[] array, char Char) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == Char) {
                return true;
            }
        }
        return false;
    }
}
