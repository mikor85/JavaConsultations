package Consult20220917;

import java.util.Arrays;

public class InvertArray {
    public static void main(String[] args) {

        int[] arrayOne = new int[]{1, 1, 1, 0, 0, 0};
        int[] arrayTwo = new int[]{1, 0, 1, 0, 1, 0};
        System.out.println(arrayOne[6]);
        System.out.println(Arrays.toString(invertArray(arrayOne)));
        System.out.println(Arrays.toString(invertArray(arrayTwo)));
    }

    public static int[] invertArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0){
                array[i] = 1;
            } else if (array[i] == 1){
                array[i] = 0;
            }
        }
        return array;
    }
}
