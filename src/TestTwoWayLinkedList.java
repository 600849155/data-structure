import java.util.stream.IntStream;

/**
 * @Author:WhomHim
 * @Description:
 * @Date: Create in 2019-11-13 00:16:34
 * @Modified by:
 */
public class TestTwoWayLinkedList {

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 3, 4, 5, 6};
        TwoWayLinkedList twoWayLinkedList = new TwoWayLinkedList();
        IntStream.range(0, 7).forEach(i -> twoWayLinkedList.addTail(nums[i]));
        twoWayLinkedList.display();


    }
}
