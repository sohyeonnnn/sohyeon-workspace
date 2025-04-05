package study.basic.generic.test.ex1;

public class Pair<K,V> {
    private K first;
    private V second;

    public void setFirst(K k) {
        this.first = k;
    }

    public void setSecond(V v) {
        this.second = v;
    }

    public K getFirst() {
        return first;
    }

    public V getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
