package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- Удамшил ашиглан нэмэгдсэн элементийн тоог хянах класс.
 * Энэ класс нь SortedIntList-ийн бүх шинжийг өвлөж авна.
 */
public class InheritanceSortedIntList extends SortedIntList {
    // Нийт нэмэгдсэн элементийн тоог хадгалах хувьсагч
    private int totalAdded = 0;

    public InheritanceSortedIntList() {
        super(); // Эцэг классын байгуулагч функцийг дуудах
    }

    /**
     * Ганц элемент нэмэх функцийг override хийх.
     * Элемент нэмэх оролдлого бүрт тоолуурыг нэмэгдүүлнэ.
     */
    @Override
    public boolean add(int num) {
        totalAdded++; // Тоолуурыг 1-ээр нэмэгдүүлэх
        return super.add(num); // Эцэг классын жинхэнэ нэмэх үйлдлийг дуудах
    }

    /**
     * Олон элемент нэмэх функцийг override хийх.
     * AbstractIntList.addAll нь дотроо add() функцийг давталтаар дууддаг тул
     * энд тоолуурыг гараар нэмэх шаардлагагүй (Double counting-ээс сэргийлнэ).
     */
    @Override
    public boolean addAll(IntegerList list) {
        return super.addAll(list);
    }

    /**
     * Нийт нэмэгдсэн элементийн тоог буцаах функц.
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}