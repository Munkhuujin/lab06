package edu.cmu.cs.cs214.rec04;

/**
 * Main class for Recitation 5. This can be used as sandbox to experiment in.
 * @author Nora Shoemaker
 *
 */
public class Main {

    public static void main(String[] args) {

        // Өөрийн хэрэгжүүлсэн классуудыг зарлах
        DelegationSortedIntList list1 = new DelegationSortedIntList();
        InheritanceSortedIntList list2 = new InheritanceSortedIntList();

        // Эхний жагсаалтад 5 элемент нэмэх
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        // Жагсаалтыг хэвлэх (Энд printList ашиглагдаж байгаа тул сануулга арилна)
        System.out.print("List 1 (Delegation): ");
        printList(list1);
        System.out.println("Total added to List 1: " + list1.getTotalAdded());

        // Хоёр дахь жагсаалтад 2 элемент нэмэх
        list2.add(3);
        list2.add(0);

        // Эхний жагсаалтыг (5 элемент) хоёр дахь жагсаалт руу (2 элемент) нэмэх
        list2.addAll(list1);

        System.out.print("List 2 (Inheritance) after addAll: ");
        printList(list2);
        System.out.println("Total added to List 2: " + list2.getTotalAdded());
    }

    /**
     * A helper function that prints out the contents of an IntegerList.
     * @param list IntegerList to be printed out.
     */
    private static void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            System.out.print(", ");
        }
        System.out.println();
    }
}