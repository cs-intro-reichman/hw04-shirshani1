public class ArrayOps {
    public static void main(String[] args) {
        int[] array = {1,-2,3,-4,5};
        int[] array1 = { 1, 2, 3 };
        int[] array2 = { 2, 2, 1, 3, 3, 3, 4 };
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
        int secondMax = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > Max) {
                Max = array[i];
            }
        }
        for (int j = 1; j < array.length; j++) {
            if (array[j] > secondMax && array[j] < Max) {
                secondMax = array[j];
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
        int chekingup = Integer.MIN_VALUE;
        int chekingdown = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > chekingup) {
                chekingup = array[i];
            } else if (array[i] < chekingdown) {
                chekingdown = array[i];
            } else {
                return false;
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
