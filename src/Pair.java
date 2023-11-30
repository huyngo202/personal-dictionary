public class Pair<K,E> {
    private K key;
    private E value;

    public Pair(K key, E value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public E getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(E value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + key + ", " + value + "}";
    }
}

