package SetAndMap.Map;

public class LinkedListMap<K,V> implements Map<K,V> {

    private class Node {
        public K key;
        public V value;
        public Node next;

        public Node(K key,V value , Node next) {
           this.key = key;
           this.value = value;
           this.next = next;
        }

        public Node(K key) {
            this(key, null,null);
        }

        public Node() {
            this(null, null,null);
        }

        @Override
        public String toString() {
            return key.toString() + " : " + value.toString();
        }

        private Node dummyHand;
        private int size;

        public LinkedListMap(){

        }

    }



    @Override
    public void add(K key, V value) {

    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public boolean contains(K keys) {
        return false;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void set(K key, V newValue) {

    }

    @Override
    public int getSize() {
        return list.getSize();
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
