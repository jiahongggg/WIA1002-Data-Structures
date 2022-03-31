public class StorePairGeneric<E extends Comparable<E>> implements Comparable<StorePairGeneric<E>> {

    private E first, second;

    public StorePairGeneric(E first, E second) {
        this.first = first;
        this.second = second;
    }

    public E getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    public void setFirst(E first, E second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object obj) {
        StorePairGeneric<E> other = (StorePairGeneric<E>) obj;
        return this.first.equals(other.first);
    }

    @Override
    public int compareTo(StorePairGeneric<E> obj) {
        return this.first.compareTo(obj.first);
    }

    @Override
    public String toString() {
        return "first = " + first + " second = " + second;
    }

}
