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
        String string = " tWo    wordS";
        // System.out.println(capVowelsLowRest(string));
        System.out.println(camelCase(string));
    }

    public static String capVowelsLowRest(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u') {
                newString += (char) (string.charAt(i) - 32);
            } else {
                if (string.charAt(i) == 'A' || string.charAt(i) == 'E' || string.charAt(i) == 'I'
                        || string.charAt(i) == 'O' || string.charAt(i) == 'U') {
                    newString += (char) (string.charAt(i));
                } else {
                    if (string.charAt(i) == ' ') {
                        newString += ' ';
                    } else {
                        if (string.charAt(i) > 64 && string.charAt(i) < 91) {
                            newString += (char) (string.charAt(i) + 32);

                        } else {
                            newString += string.charAt(i);
                        }
                    }
                }
            }
        }

        return newString;
    }

    public static String camelCase(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ' && string.charAt(i) > 64 && string.charAt(i) < 91) {
                newString += (char) (string.charAt(i) + 32);

            } else {
                if (string.charAt(i) != ' ') {
                    newString += string.charAt(i);
                } else {
                    if (string.charAt(i + 1) != ' ' && newString != "") {
                        if (string.charAt(i + 1) > 96 && string.charAt(i + 1) < 122) {
                            newString += (char) (string.charAt(i + 1) - 32);
                        } else {
                            newString += string.charAt(i + 1);
                        }
                        i++;
                    }
                }
            }

        }
        return newString;
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
