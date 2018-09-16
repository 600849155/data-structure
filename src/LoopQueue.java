public class LoopQueue<E> implements Queue<E> {


    private E[] data;
    private int front,tail;//前后指针
    private int size;//有多少个成员变量

    public LoopQueue(int capacity){
        data = (E[]) new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCapacity(){
        return data.length - 1;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    /**
     * 进队列
     * 例如队列长度3 tail在0的位置，front在1 （0+1）%3余1 说明队列已满
     * @param e 元素
     */
    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front) {
            resize(getCapacity() * 2);//扩容  0123456
        }
        data[tail] = e;//尾指针指向进队列的元素e
        tail = (tail + 1) % data.length;
        size ++;

    }

    /**
     * 将data[]数组内容复制到newData[]上
     * i + front 从front指针位置开始复制
     * % data.length防止超出data数组长度从而把tail指针后的数组重复复制到newDate上
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0 ;i < size ; i++){
            newData[i] = data[(i + front) % data.length];
        }
        data = newData;
        front = 0;//data扩容后重置指针位置到0上
        tail = size;//tail指针指向数组最右（尾巴）


    }


    /**
     * 出队列
     * @return
     */
    @Override
    public E dequeue() {
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from am empty queue.");
        }
        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCapacity() / 4 && getCapacity() / 2 != 0){
            resize(getCapacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty()){
            throw new IllegalArgumentException("Cannot dequeue from am empty queue.");
        }
        return data[front];
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append(String.format("LoopQueue: size = %d, capacity = %d\n",size,getCapacity()));
        res.append("front [");
        for (int i = front;i != tail;i=(i + 1)%data.length){
            res.append(data[i]);
            if ((i+1)%data.length != tail){
                res.append(",");
            }
        }
        res.append("] tail");
        return res.toString();
    }


    public static void main(String[] args) {
        LoopQueue<Integer>queue = new LoopQueue<>();
        for (int i = 0;i<10;i++){
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
