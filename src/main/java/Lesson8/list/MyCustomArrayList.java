
//ИСПРАВИТЬ
package Lesson8.list;

import Lesson7.List.MyList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
public  class MyCustomArrayList implements MyList {
    private static final int INITIAL_CAPACITY = 4;
    private int [] data;
    private int size = 0; // "видимый" для пользователя размер массива

    public MyCustomArrayList()

    {
        data = new int[INITIAL_CAPACITY];
    }

    public static void main(String[] args) {
        MyCustomArrayList l = new MyCustomArrayList();
        l.add(1);
        l.add(3);
        // l.set(-5, 10);
        //l.set(0, 10);
        // l.set(3, 10);
        l.print();
        l.add(1, 2);
        l.print();

        List<String> s = new ArrayList<>();



        int [] a = new int[] {11,12,13,14,15,16,17,18,19,20};
        l.add(a);
        l.print();

    }

    private void add(int[] a) {
    }


    @Override
    public void set(int index, int value) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        data[index] = value;
    }

//    @Override
//    public void add(int index, int value) {
//
//    }

    @Override
    public int get(int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        return data[index];
    }


    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int position = 0;
            @Override
            public boolean hasNext() {
                return position++<size()-1;
            }
            @Override
            public void remove(){
                MyCustomArrayList.this.remove(position--); // вопрос на собеседование

            }

            @Override
            public Integer next() {
                if(position<size())
                    return get(position++);
                else
                return null;
            }
        };
    }

    @Override
    public void add(int value) {
        if(size == data.length)
            increaseCapacity();
        data[size++] = value;
    }

//    @Override
//    public void append(int[] a) {
//        for (int i = 0; i < a.length; i++) {
//            append(a[i]);
//        }
//    }

    private void increaseCapacity() {
        int [] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }



    @Override
    public void add(int index, int value) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        if(size == data.length)
            increaseCapacity();
        for (int i = size - 1; i >= index ; i--) {
            data[i+1] = data[i];
        }
        data[index] = value;
        size++;
    }

    @Override
    public void remove (int index) {
        if(index < 0 || index >= size)
            throw new IndexOutOfBoundsException();
        for (int i = index ; i < size - 1; i++) {
            data[i] = data[i+1];
        }
        size--;
    }


    public void print()
    {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i]+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(data));
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if(value == data[i])
                return true;
        }
        return false;
    }
}
