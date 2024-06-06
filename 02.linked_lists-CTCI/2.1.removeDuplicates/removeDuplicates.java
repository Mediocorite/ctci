import java.util.LinkedList;

public class removeDuplicates {

    public static void printList(LinkedList<T> head) {

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.add(3);
        list.add(5);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(7);

        System.out.println("Original List:");
        list.printList();


        System.out.println("List after removing duplicates:");
        list.printList();
    }
}
