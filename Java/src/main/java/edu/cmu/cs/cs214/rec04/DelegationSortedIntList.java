package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- Бүрдмэл (Delegation) аргаар тоог хянах класс.
 * Энэ класс нь IntegerList интерфэйсийг хэрэгжүүлж, үйлдлээ дотоод объект руу дамжуулна.
 */

public class DelegationSortedIntList implements IntegerList {
    // Жинхэнэ жагсаалтын үйлдлүүдийг гүйцэтгэх дотоод объект
    private final SortedIntList innerList = new SortedIntList();
    // Нийт нэмэгдсэн элементийн тоог хадгалах хувьсагч
    private int totalAdded = 0;
     /**
     * Элемент нэмэх үйлдэл. Тоолуурыг нэмээд, үйлдлийг innerList-р хийлгэнэ.
     */
    @Override
    public boolean add(int num) {
        totalAdded++;
        return innerList.add(num);
    }
     /**
     * Олон элемент нэмэх үйлдэл. 
     * innerList.addAll нь энэ классын add()-ыг дууддаггүй тул 
     * тоолуурыг жагсаалтын хэмжээгээр шууд нэмж өгнө.
     */
    @Override
    public boolean addAll(IntegerList list) {
        totalAdded += list.size();
        return innerList.addAll(list);
    }
      // Доорх аргууд нь ямар нэгэн өөрчлөлтгүйгээр innerList рүү дамжигдана (Delegation)
    @Override
    public int get(int index) {
        return innerList.get(index);
    }

    @Override
    public boolean remove(int num) {
        return innerList.remove(num);
    }

    @Override
    public boolean removeAll(IntegerList list) {
        return innerList.removeAll(list);
    }

    @Override
    public int size() {
        return innerList.size();
    }
     /**
     * Нийт нэмэгдсэн элементийн тоог буцаах функц.
     */
    public int getTotalAdded() {
        return totalAdded;
    }
}
