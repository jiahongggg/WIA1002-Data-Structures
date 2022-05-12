import java.util.LinkedList;

public class MyQueue<E> {

    private java.util.LinkedList<E> list = new java.util.LinkedList<>();

    public MyQueue() {
    }

    public MyQueue(E[] e) {
        for (E value : e) {
            enqueue(value);
        }
    }

    public void enqueue(E e) {
        list.addLast(e);
    }

    public E dequeue() {
        return list.removeFirst();
    }

    public E getElement(int i) {
        return list.get(i);
    }

    public E peek() {
        return list.peek();
    }

    public int getSize() {
        return list.size();
    }

    public boolean contains(E e) {
        return list.contains(e);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public String toString() {
        return "Queue: " + list.toString();
    }

    public static void main(String[] args) {

        String[] Fruit = {"Durian", "Blueberry"};
        MyQueue<String> fruitQ = new MyQueue<>(Fruit);
        fruitQ.enqueue("Apple");
        fruitQ.enqueue("Orange");
        fruitQ.enqueue("Grapes");
        fruitQ.enqueue("Cherry");
        System.out.println(fruitQ);
        System.out.println("Top: " + fruitQ.peek());
        System.out.println("Queue size: " + fruitQ.getSize());
        System.out.println("Deleted: " + fruitQ.dequeue());
        System.out.println("Index 2: " + fruitQ.getElement(2));
        System.out.println("The queue consists of Cherry: " + fruitQ.contains("Cherry"));
        System.out.println("The queue consists of Durian: " + fruitQ.contains("Durian"));

        while(!fruitQ.isEmpty()){
            System.out.print(fruitQ.dequeue() + " ");
        }
    }

}
