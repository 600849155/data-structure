public interface Stack<E>  {
    int getSize();
    boolean isEmpty();
    void push(E e);//进栈
    E pop();//出栈
    E peek();

}
