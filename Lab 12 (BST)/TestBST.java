public class TestBST {

    public static void main(String[] args) {

        Integer[] numbers = {45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14};
        BST<Integer> intTree = new BST<Integer>(numbers);
        System.out.print("\nInput Data : 45, 88, 54, 76, 98, 1, 2, 20, 6, 53, 42, 100, 86, 32, 28, 65, 14 ");
        System.out.print("\nInorder (sorted): ");
        intTree.inorder();
        System.out.print("\nPostorder: ");
        intTree.postorder();
        System.out.print("\nPreorder: ");
        intTree.preorder();
        System.out.print("\nHeight of BST: " + intTree.height());

        System.out.print("\nRoot for BST is : " + intTree.getRoot());
        System.out.print("\nCheck whether 10 is in the tree? " + intTree.search(10));
        System.out.print("\nDelete 53");
        intTree.delete(53);
        System.out.print("\nUpdated Inorder data (sorted): ");
        intTree.inorder();
        System.out.print("\nMin Value :" + intTree.minValue());
        System.out.print("\nMax Value :" + intTree.maxValue());
        System.out.print("\nA path from the root to 6 is: ");
        java.util.ArrayList<TreeNode<Integer>> path = intTree.path(6);
        for (int i = 0; path != null && i < path.size(); i++)
            System.out.print(path.get(i).element + " ");

    }
}
