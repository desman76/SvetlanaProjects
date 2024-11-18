package Lesson23;

import java.util.Arrays;

public class My232Project {
    public static void main(String[] args) {
        String[] array1 = {"A", "B", "C"};
        String[] array2 = {"1", "2", "3", "4", "5"};
        String[] mergedArray = mergeArrays(array1, array2);
        System.out.println(Arrays.toString(mergedArray));
    }
    public static String[] mergeArrays(String[] array1, String[] array2) {
        int maxLength = Math.max(array1.length, array2.length);
        String[] mergedArray = new String[array1.length + array2.length];

        int index = 0;
        for (int i = 0; i < maxLength; i++) {
            if (i < array1.length) {
                mergedArray[index++] = array1[i];
            }
            if (i < array2.length) {
                mergedArray[index++] = array2[i];
            }
        }
        return mergedArray;
    }
}
