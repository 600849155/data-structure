package Usally;

public class ArraySort {
    //冒泡
    public static void bubbleSort(int[] arr) {
                        /*两个for循环嵌套，
                         *外面的for循环决定一个长度为m的数据要比较多少轮才能完成排序。
		 *利用举例归类的方式，比如长度为5、8、9，需要4（第一轮：1和2，2和3，3和4，4和5；
		 *第二轮：1和2，2和3，3和4，5号位置已经上一次中排列好，不需要在参与比较；第三轮：1和2
		 *，2和3；第四轮：1和2）,7,8轮;
		 *里面的for循环决定每次一轮循环中要做多少次才能结束，这里面的规律就在长度为5的举例中，
		 *可以归类，就是4、3、2、1,,也就是它跟轮数有关系，轮数增加，比较次数就减少，比较次数
		 * n = m - i，i轮数
		 */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //从小到大，大的值放后面位置。
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void main(String[] args) {

    }
    //选择
    public static void selectSort(int[] arr) {
		/*
		 * 同理两个for循环，外面的for是几轮，因为最后一个不需要比较，所以是长度的m-1轮
		 * 里面的for是指每一轮比较的过程，一个就是起始位随着轮数后移，另外比较的次数也随着减少
		 * 规律同冒泡
		 */
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
            }

        }
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    //快速排序

    public static void quickSort(int[] arr, int left, int right) {
        int l = left;
        int h = right;
        //基数
        int povit = arr[left];
        //一趟快速排序，即l = h，这时povit的位置就固定了，左边都是小于它的值，右边都是大于它的值。
        while (l != h) {//哨兵ih没有相遇
            //从右边开始，通过高位角标h的自减，从最右位向低位逐一取出数组中的值。l < h排除了l=h情况
            while (povit < arr[h] && l < h) {
                h--;
            }
            //如果上面的循环结束，且l != h，说明右边出现小于povit元素，需要互换位置
            if (l < h) {
                swap(arr, l, h);
                l++;//从后一位开始读取数组
            }
            //从左边开始，通过低位角标l的自增，从最左边向高位逐一取出数值中的值。
            while (povit > arr[l] && l < h) {
                l++;
            }
            //如果上面的循环结束，且l != h，说明左边出现大于povit元素，需要互换位置
            if (l < h) {//当哨兵i和h没有相遇时
                swap(arr, l, h);
                h++;
            }
            //向下继续最外面的while循环，直到l = h
        }
        //递归，povit左边继续调用quickSort
        if (l > left) quickSort(arr, left, l - 1);
        //递归，povit右边继续调用quickSort
        if (h < right) quickSort(arr, l + 1, right);

    }


}

