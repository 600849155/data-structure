import java.util.Random;

public class Main {


    private static double testQueue(Queue<Integer>q,int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0;i < opCount;i ++){
            q.enqueue(random.nextInt(Integer.MAX_VALUE));//生成[0，int能表示最大值)的数
        }
        for(int i =0;i < opCount;i ++){
            q.dequeue();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    private static double testStack(Stack<Integer>stack,int opCount){
        long startTime = System.nanoTime();

        Random random = new Random();
        for (int i = 0;i < opCount;i ++){
            stack.push(random.nextInt(Integer.MAX_VALUE));//生成[0，int能表示最大值)的数
        }
        for(int i =0;i < opCount;i ++){
           stack.pop();
        }
        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }
    public static void main(String[] args) {
        /**
         * 数组
         */
//        Array<com.Integer> arr = new Array<>();
//        for (int i = 0;i<10;i++){
//            arr.addLast(i);
//        }
//        System.out.println(arr);
//        arr.addLast(90);
//        System.out.println(arr);
//        arr.add(3,300);
//        System.out.println(arr);
//        arr.set(3,400);
//        System.out.println(arr);
//        arr.removeLast();
//        System.out.println(arr);
//        arr.removeElement(1);
//        System.out.println(arr);
        /**
         * 栈
         */
//        ArrayStack<com.Integer> arrayStack = new ArrayStack<>();
//        for (int i =0;i<5;i++){
//            arrayStack.push(i);
//            System.out.println(arrayStack);
//        }
//        arrayStack.pop();
//        System.out.println(arrayStack);
        /**
         * 队列：数组队列和循环队列的比较
         */
        int opCount = 10000000;
//
//        ArrayQueue<com.Integer>arrayQueue = new ArrayQueue<>();
//        double time1 = testQueue(arrayQueue,opCount);
//        System.out.println("ArrayQueue, time: " + time1 + " s");
//
//        LoopQueue<com.Integer>loopQueue = new LoopQueue<>();
//        double time2 = testQueue(loopQueue,opCount);
//        System.out.println("LoopQueue, time: " + time2 + " s");
        /**
         * 链表
         */
//        LinkedList<com.Integer>ll = new LinkedList<>();
//        for (int i =0;i<5;i++){
//            ll.addFirst(i);
//            System.out.println(ll);
//        }
//        ll.add(2,123);
//        System.out.println(ll);
//        ll.set(0,9);
//        System.out.println(ll);
//        ll.remove(2);
//        System.out.println(ll);
//        ll.removeLast();
//        System.out.println(ll);

        ArrayStack<Integer>arrayStack = new ArrayStack<>();
        double time1 = testStack(arrayStack,opCount);
        System.out.println("ArrayStack, time: " + time1 + " s");

        LinkedListStack<Integer>linkedListStack = new LinkedListStack<>();
        double time2 = testStack(linkedListStack,opCount);
        System.out.println("LinkedListStack, time: " + time2 + " s");
        /**
        * 二叉树
        */
//        BST<com.Integer>bst = new BST<com.Integer>();
//        int[] nums = {5,3,6,8,4,2};
//        for (int num:nums)
//            bst.add(num);

        /////////////////////////
        //         5           //
        //       /    \        //
        //      3      6       //
        //     / \      \      //
        //    2  4       8     //
        /////////////////////////
//        bst.preOrder();
//        System.out.println();
//        bst.preOrderNR();

//        bst.levelOrder();

//        System.out.println(bst);
//
//        bst.inOrder();
//
//        System.out.println();
//        bst.postOrder();

//        System.out.println( bst.removeMin());
//        System.out.println(bst.removeMax());




    }
}

