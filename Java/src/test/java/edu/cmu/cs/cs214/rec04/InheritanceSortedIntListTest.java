package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    /**
     * Тест бүрийн өмнө шинэ жагсаалтуудыг үүсгэнэ.
     */
    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    /**
     * add() функцийг шалгах тест.
     */
    @Test
    public void testAdd() {
        // 5 элемент нэмэх
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        
        // Нийт нэмэгдсэн тоо 5 байгаа эсэхийг шалгах
        assertEquals(5, list1.getTotalAdded());
        
        System.out.print("List 1 contents: ");
        printList(list1);
    }

    /**
     * addAll() функцийг шалгах тест.
     */
    @Test
    public void testAddAll() {
        // Эхний жагсаалтад 5 элемент
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);
        assertEquals(5, list1.getTotalAdded());

        // Хоёр дахь жагсаалтад 2 элемент
        list2.add(3);
        list2.add(0);
        assertEquals(2, list2.getTotalAdded());

        // 5 элементийг 2 элементтэй жагсаалт руу нэмэх
        list2.addAll(list1);

        // Нийт 7 элемент нэмэгдсэн байх ёстой
        assertEquals(7, list2.getTotalAdded());
        
        System.out.print("List 2 after addAll: ");
        printList(list2);
    }

    /**
     * Жагсаалтын агуулгыг хэвлэх туслах функц.
     */
    private void printList(IntegerList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + (i == list.size() - 1 ? "" : ", "));
        }
        System.out.println();
    }
}