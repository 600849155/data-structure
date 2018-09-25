package SetAndMap.MaxHeap;


public class MaxHeap<E extends Comparable<E>> {

    private Array<E> data;

    public MaxHeap() {
        data = new Array<>();
    }

    public MaxHeap(int capacity) {
        data = new Array<>(capacity);
    }

    //返回堆中元素个数
    public int size() {
        return data.getSize();
    }

    //返回一个布尔值，表示堆中是否为空
    public boolean isEmpty() {
        return data.isEmpty();
    }

    //返回完全二叉树的数组表示，一个索引所表示的元素的父亲节点的索引；
    public int parent(int index) {
        if (index == 0) {
            throw new IllegalArgumentException("index == 0");
        }
        return (index - 1) / 2;

    }

    //返回完全二叉树的数组表示，一个索引所表示的元素的右孩子的索引；
    public int rightChild(int index) {
        return index * 2 + 2;
    }

    //返回完全二叉树的数组表示，一个索引所表示的元素的左孩子的索引；
    public int leftChild(int index) {
        return index * 2 + 1;
    }

    //向堆中添加元素
    public void add(E e){
        data.addLast(e);
        siftUp(data.getSize() - 1 );
    }

    private void siftUp(int k) {
        while(k > 0 && data.get(parent(k)).compareTo(data.get(k)) < 0){
            data.swap(k,parent(k));
            k = parent(k);
        }
    }

    //看堆中的最大元素
    public E findMax(){
        if (data.getSize() == 0)
            throw new IllegalArgumentException("Can not find maxEle when size == 0");
       return data.get(0);
    }
    
    //取出堆中最大元素
    public E extractMax(){
        E ret = findMax();
        
        data.swap(0,data.getSize() - 1);
        data.removeLast();
        siftDown(0);
        return ret;
    }

    private void siftDown(int k) {

        while (leftChild(k) < data.getSize()){

            int j = leftChild(k);
            if (j + 1 < data.getSize() && data.get(j + 1).compareTo(data.get(j)) > 0){
                j = rightChild(k);
            }
            if (data.get(k).compareTo(data.get(j)) >= 0){
                break;
            }
            data.swap(k,j);
            k = j;
        }
    }

}
