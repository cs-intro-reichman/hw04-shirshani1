public class ArrayOps {
    public static void main(String[] args) {
        int[] array = { 3, 2, 1 };
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 2, 2, 1, 3, 3, 3 };
        System.out.println(findMissingInt(array));
        System.out.println(secondMaxValue(array));
        System.out.println(containsTheSameElements(array1, array2));
        System.out.println(isSorted(array));

    }

    public static int findMissingInt(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (isInArray(array, i) == false) {
                return i;

            }
        }
        return n;
    }

    public static int secondMaxValue(int[] array) {
        int Max = array[0];
        int[] array1 = new int[array.length - 1];
        int count = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > Max) {
                array1[count] = Max;
                Max = array[i];
                count++;
            } else {

                array1[count] = array[i];
                count++;
            }
        }
        int secondMax = array1[0];
        for (int j = 1; j < array1.length; j++) {
            if (array1[j] > secondMax) {
                secondMax = array1[j];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {

        for (int i = 0; i < array1.length; i++) {
            if (!isInArray(array2, array1[i]))
                return false;
        }
        return true;
    }

    public static boolean isSorted(int[] array) {

        if (array[0] > array[1]) {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    return false;
                }

            }

        }
        return true;
    }

    private static void elif(boolean b) {
    }

    public static boolean isInArray(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

}
