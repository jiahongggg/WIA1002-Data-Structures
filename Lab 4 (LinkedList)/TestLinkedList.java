package tutorial4;

public class TestLinkedList {

    public static void main(String[] args) {

        MyLinkedList<Character> list = new MyLinkedList<>();

        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');

        System.out.print("Print all the elements in the list: ");
        list.print();

        System.out.print("Print the elements in reverse order: ");
        list.reverse();

        System.out.println("Number of elements in the list: " + list.getSize());
        System.out.println("First value: " + list.getFirst());
        System.out.println("Last value: " + list.getLast());
        System.out.println("Delete middle value: " + list.remove(list.size/2));
        System.out.println("Index of B: " + list.indexOf('b'));
        System.out.println("Index of C: " + list.indexOf('c'));
        System.out.println("Is the list contain C: " + list.contains('c'));

        list.clear();

        char[] charArray = {'h','e','l','l','o'};
        for(char e: charArray){
            list.add(e);
        }
        System.out.println("New List: ");
        list.print();


    }
}
