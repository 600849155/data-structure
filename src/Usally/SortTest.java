package Usally;

public class SortTest {
    public static void main(String[] agrs) {
        //定义一个一维组数
        int[] arr1 = {5, 8, 3, 9, 10, 55, 32};
        ArraySort.bubbleSort(arr1);
        printArray(arr1);
        int[] arr2 = {5, 8, 3, 9, 10, 55, 32};
        ArraySort.selectSort(arr2);
        printArray(arr2);
        int[] arr3 = {5, 8, 3, 9, 10, 55, 32};
        ArraySort.quickSort(arr3, 0, arr3.length - 1);
        printArray(arr3);
    }

    public static void printArray(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            str = str + arr[i] + ",";
        }
        str = str.substring(0, str.length() - 1);
        str = str + "]";
        System.out.print(str);
        System.out.println("");
    }
}

