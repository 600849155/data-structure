public class Array<E> {
    private E[] data;
    private int size;

    //构造函数
    public Array(int capacity) {
        data = (E[]) new Object[capacity];//合法的固定写法
        size = 0;
    }

    //无参数的构造函数
    public Array() {
        this(10);
    }

    //获取数组中元素个数
    public int getSize() {
        return size;
    }

    //获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    //返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }

    //往数组头添加元素
    public void addFirst(E e) {
        add(0, e);
    }

    //往数组尾添加元素
    public void addLast(E e) {
        add(size, e);
    }

    //在第index位置添加一个e元素
    public void add(int index, E e) {
        if (size == data.length) {
            resize(2 * data.length);
        }
        if (index < 0 || index > size) {
            throw new IllegalArgumentException("index < 0 || index > size");
        }

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }


    private void resize(int newCapacity) {
        E[] newData = (E[]) new Object[newCapacity];
        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    //获取index索引位置的元素
    E get(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index < 0 || index >= size");
        }
        return data[index];
    }


    //修改index索引位置的元素为e
    void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index < 0 || index >= size");
        }
        data[index] = e;
    }

    //查找数组中元素e是否存在
    public boolean contains(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    //查找数组中元素e是否存在,并返回索引，不存在则返回-1
    public int find(E e) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(e)) {
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IllegalArgumentException("index < 0 || index >= size");
        }
        E ret = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i - 1] = data[i];
        }
        size--;
        data[size] = null;
        if (size == data.length / 4 && data.length / 2 != 0) {//防止复杂度震荡
            resize(data.length / 2);
        }
        return ret;
    }

    //从数组中删除第一个元素，返回删除的元素
    public E removeFirst() {
        return remove(0);
    }

    //从数组中删除最后一个元素，返回删除的元素
    public E removeLast() {
        return remove(size - 1);
    }

    public void removeElement(E e) {
        if (contains(e)) {
            remove(find(e));
        }
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array : size = %d , capacity = %d\n", size, data.length));
        res.append("[");
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1) {
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
}
