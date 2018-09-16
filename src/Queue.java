public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);//进队列
    E dequeue();//出队列
    E getFront();//
}
