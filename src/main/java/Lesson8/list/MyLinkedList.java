package Lesson8.list;

import Lesson7.List.MyList;

import java.util.Iterator;

public class MyLinkedList implements MyList { // implements - реализация
    //Lists implemenations.LinkedList.
private Node head; // первый элемент списка

    public String toString()
    {
        StringBuilder b = new StringBuilder();
        Node n = head;
        b.append("[");
        while(n!=null)
        {
            b.append(n.getValue());
            n = n.getNext();
            if(n!=null)
            {
                b.append(",");
            }
        }
        b.append("]");
        return b.toString();
    }

    @Override
    public void add(int value) {
        //идти начиная с head до последнего (пока getNext ()!=null)
        if (head==null)
        {
            head=new Node(value);
            return;
        }
        Node n = head;
        while (n.getNext()!=null)
        {
            n=n.getNext();
        }
        n.setNext(new Node(value));

    }

    @Override
    public void set(int index, int value) {
        Node n = head ;
        while(n!=null)
        {
            if(index == 0){
                n.setValue(value);
                return;
            }
            index --;
            n=n.getNext();
        }

    }

    @Override
    public void add(int index, int value) {
        Node n=head;
        Node one = null;
        Node two = null;
        while (n !=null)
        {
            if(index==1)
            {
                one = n;
                two = n.getNext();
                break;
            }
                index --;
            n=n.getNext();
        }
        if(one !=null)
        {
            Node nw = new Node(value,two);

           one.setNext(//new Node(value,two));
                   nw
           );

        }

    }

    @Override
    public boolean contains(int value) {
        Node n = head;
        while (n!=null)
        {
            if(n.getValue()==value)
                return true;
            n=n.getNext();
        }
        return false;
    }

    @Override
    public int get(int index) {
        Node n = head;
        while(n!=null)
        {
            if(index==0)
                return n.getValue();
            index--;
            n=n.getNext();
        }
        return 0;
    }

    @Override
    public void remove(int index) { //delete //HW
         //ДЗ
        //0 - удаляем head
        //другие
        Node n = head;
        if(index==0&&head != null)
        {
            head = n.getNext();
            return;
        }
        while(n!=null) // что такое head
        {
            if(index ==1) //считаем до предыдушего элемента
            {
                Node toRemove = n.getNext();
                if(toRemove == null)
                    return;
                Node next = toRemove.getNext();
                n.setNext(next);
                return;
            }
            index--;
            n=n.getNext();
        }


    }

    @Override
    public int size() {
    int sz = 0;//size
        Node n = head;
        while (n!=null)
        {
            sz++;
            n=n.getNext();
        }
        return sz;
    }

    @Override
    public Iterator<Integer> iterator() { //что такое итератор
        return new Iterator<Integer>() {
            private int position = -1;

            @Override
            public boolean hasNext() {
                //надо убедиться что следующая позиция после position лежит внутри size
                //после этой операции двинуть позицию вперед
                return position++ +1 <size();
            }

            @Override
            public Integer next() {
                return get(position);
            }

            @Override
            public void remove() {
                MyLinkedList.this.remove(position--);


            }
        };
    }

    public int getFirst()
    {
        return get(0);
    }
    void removeFirst()
    {
        remove(0);
    }

    void addFirst(int value)
    {
        add(0,value);
    }

    static class Node{
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

    public static void main(String[] args) {
        //Node n = new MyLinkedList().new Node();//внутренний не статический класс
        //Node n = new MyLinkedList.Node();//внутренний статический
        MyLinkedList l = new MyLinkedList();
        System.out.println(l);
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l);
    }
}
