import java.util.Arrays;

public class lesson_3 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));
        array(arr);
        System.out.println(Arrays.toString(arr));
        int[] nineArr = fillArray(100,1);
        System.out.println(Arrays.toString(nineArr));
        int[] arr1 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(arr1));
        six(arr1);
        System.out.println(Arrays.toString(arr1));
        int[][] diagonalArr = diagonalArr(3, 3);
        printArr(diagonalArr);
          System.out.print(Arrays.toString(createArr(4,6)));
    }

    private static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    private static int[] fillArray(int size, int step) {
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * step;
        }
        return arr;
    }

    private static void six(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] < 6 ? arr1[i] * 2 : arr1[i];
        }
    }

    private static int[][] diagonalArr(int size, int d) {
        int[][] diagonalArr = new int[size][d];
        for (int i = 0; i < size; i++) {
            diagonalArr[i][i] = d;
            diagonalArr[i][diagonalArr.length - i - 1] = d;

        }
        return diagonalArr;
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private static int[] createArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
