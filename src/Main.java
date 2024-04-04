import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        MyLinkedList myLinkedList  = new MyLinkedList();
        //add
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        //print
        System.out.println(myLinkedList.print());
        System.out.println();

        //get
        System.out.println(myLinkedList.get(1));
        System.out.println();

        //remode
//        myLinkedList.remove(1);
//        System.out.println(myLinkedList.print());

        MyLinkedList myLinkedList2  = new MyLinkedList();
        myLinkedList2.add(0);

        //addAll
        myLinkedList2.addAll(myLinkedList);
        System.out.println(myLinkedList2.print());
        System.out.println();



        MyLinkedList myLinkedList3  = new MyLinkedList();
        myLinkedList3.add(0);
        myLinkedList3.add(-3);
        myLinkedList3.add(9);
        myLinkedList3.add(1);
        myLinkedList3.add(6);
        System.out.println(myLinkedList3.print());
        System.out.println();

        // сортировки
        myLinkedList.myBubbleSort();
        System.out.println(myLinkedList.print());
        System.out.println();

        myLinkedList3.myBubbleSort();
        System.out.println(myLinkedList3.print());
        System.out.println();


        // Дополнительное задание
        MyLinkedList myLinkedList4 = new MyLinkedList(myLinkedList);
        System.out.println(myLinkedList4.print());
        System.out.println();

        myLinkedList4.addAll(myLinkedList3);
        System.out.println(myLinkedList4.print());
        System.out.println();

        MyLinkedList.myBubbleSortStatic(myLinkedList4);
        System.out.println(myLinkedList4.print());
        System.out.println();
    }
}