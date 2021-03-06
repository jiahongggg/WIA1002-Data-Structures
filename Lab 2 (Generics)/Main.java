public class Main {

    public static void main(String[] args) {

        StorePairGeneric<Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric<Integer> b = new StorePairGeneric<>(2, 2);
        StorePairGeneric<Integer> c = new StorePairGeneric<>(6, 3);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));

        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        System.out.println(a.equals(c));

        MyGeneric<String> strObj = new MyGeneric<>("Java");
        MyGeneric<Integer> intObj = new MyGeneric<>(123);

        System.out.println(strObj.getE());
        System.out.println(intObj.getE());
    }
}
