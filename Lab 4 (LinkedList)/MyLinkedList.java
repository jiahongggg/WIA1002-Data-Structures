package tutorial4;

public class MyLinkedList <E> {

    Node<E> head,tail;
    int size;

    public MyLinkedList() {
    }

    public void addFirst(E e){
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null){
            tail = head;
        }
    }

    public void addLast(E e){
        if(tail == null){
            head = tail = new Node<>(e);
        }
        else {
            tail.next = new Node<>(e);
            tail = tail.next;
        }
        size++;
    }

    public void add(int index, E e){
        if (index == 0){
            addFirst(e);
        }
        else if(index >= size){
            addLast(e);
        }
        else {
            Node<E> current = head;
            for(int i=0; i<index-1; i++){
                current = current.next;
                Node<E> temp = current.next;
                current.next = new Node<>(e);
                (current.next).next = temp;
                size++;
            }
        }
    }

    public E removeFirst(){
        if(size == 0){
            return null;
        }
        else {
            Node<E> temp = head;
            head = head.next;
            size--;
            if(head == null){
                tail = null;
            }
            return temp.element;
        }
    }

    public E removeLast() {
        if(size== 0){
            return null;
        }
        else if (size == 1){
            Node<E> temp = head;
            head = tail = null;
            size = 0;
            return temp.element;
        }
        else {
            Node<E> current = head;
            for (int i=0; i<size-2; i++){
                current = current.next;
            }
            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    public E remove(int index){
        if (index<0 || index>=size){
            return null;
        }
        else if (index== 0){
            return removeFirst();
        }
        else if (index == size-1){
            return removeLast();
        }
        else {
            Node<E> previous = head;
            for (int i=0; i<index-1; i++){
                previous = previous.next;
            }
            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    public void add(E e){
        addLast(e);
    }

    public boolean contains(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public E get(int index){
        if(index <0 || index>=size){
            return null;
        }
        Node<E> current = head;
        for(int i=0; i<index; i++){
            current = current.next;
        }
        return current.element;
    }

    public E getFirst(){
        return head.element;
    }

    public E getLast(){
        return tail.element;
    }

    public int indexOf(E e){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                return i;
            }
            current = current.next;
        }
        return -1;
    }

    public int lastIndexOf(E e){
        int index = -1;
        Node<E> current = head;
        for(int i=0; i<size; i++){
            if(current.element.equals(e)){
                index = i;
            }
            current = current.next;
        }
        return index;
    }

    public E set(int index, E e){
        if (index<0 || index>= size){
            return null;
        }
        else {
            Node<E> current = head;
            for (int i=0; i<index-1; i++){
                current = current.next;
            }
            current.element = e;
            return current.element;
        }
    }

    public void clear(){
        while(size!=0){
            removeLast();
        }
    }

    public void print(){
        Node<E> current = head;
        for(int i=0; i<size; i++){
            System.out.print(current.element + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse(){
        Node<E> current = head;
        String[] str = new String[size];
        for(int i=str.length-1; i>=0; i--){
            str[i] = current.element.toString();
            current = current.next;
        }
        for(String e: str){
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public int getSize(){
        return size;
    }
}
