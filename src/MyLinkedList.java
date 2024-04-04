import java.util.Collection;

public class MyLinkedList<T extends Comparable<T>> {
    private Node head;
    private int length;

    private class Node<T>{
        Node next;
        T value;

        Node(T data){
            this.value = data;
            this.next = null;
        }
    }

    MyLinkedList(){
        head = null;
        length = 0;
    }
    MyLinkedList(MyLinkedList collection){
        head = null;
        length = 0;
        this.addAll(collection);
    }

    public void add(T data){
        Node newNode = new Node<>(data);
        if (head == null){
            head = newNode;
        }
        else{
            Node iterator = head;
            while(iterator.next != null){
                iterator = iterator.next;
            }
            iterator.next = newNode;
        }
        length++;
    }

    public T get(int index) throws Exception {
        int count = 0;
        if (index < 0){
            throw new Exception("Отрицательный индекс");
        }
        if (index > length){
            throw new Exception("Индекс больше, чем длина массива");
        }

        Node<T> iterator = head;
        while(count != index){
            iterator = iterator.next;
            count++;
        }
        return iterator.value;
    }

    public void remove(int index) throws Exception {
        int count = 0;
        if (index < 0){
            throw new Exception("Отрицательный индекс");
        }
        if (index > length){
            throw new Exception("Индекс больше, чем длина массива");
        }

        Node<T> iterator = head;
        while(count != index - 1){
            iterator = iterator.next;
            count++;
        }
        iterator.next = iterator.next.next;
    }

    public void addAll(MyLinkedList collection){
        Node<T> iterator = head;
        while(iterator != null){
            iterator = iterator.next;
        }
        Node<T> iterator2 = collection.head;
        while(iterator2 != null){
            this.add(iterator2.value);
            iterator2 = iterator2.next;
        }
    }


    public void myBubbleSort(){
        Node<T> iterator1 = head;
        Node<T> iterator2;
        Boolean sorted = true;
        while (iterator1 != null){
            iterator2 = iterator1.next;
            while (iterator2 != null){
                if (iterator1.value.compareTo(iterator2.value) > 0){
                    T nodeValue = iterator1.value;
                    iterator1.value = iterator2.value;
                    iterator2.value = nodeValue;
                    sorted = false;
                }
                iterator2 = iterator2.next;
            }
            if (sorted == true){
                return;
            }
            iterator1 = iterator1.next;
        }
    }

    public static <T extends Comparable<T>> void myBubbleSortStatic(MyLinkedList<T> collection){
        MyLinkedList<T>.Node<T> iterator1 = collection.head;
        MyLinkedList<T>.Node<T> iterator2;
        Boolean sorted = true;
        while (iterator1 != null){
            iterator2 = iterator1.next;
            while (iterator2 != null){
                if (iterator1.value.compareTo(iterator2.value) > 0){
                    T nodeValue = iterator1.value;
                    iterator1.value = iterator2.value;
                    iterator2.value = nodeValue;
                    sorted = false;
                }
                iterator2 = iterator2.next;
            }
            if (sorted == true){
                return;
            }
            iterator1 = iterator1.next;
        }
    }



    public String print(){
        StringBuilder listString = new StringBuilder("[");
        Node iterator = head;
        while (iterator != null){
            listString.append(iterator.value);
            listString.append(", ");
            iterator = iterator.next;
        }
        listString.delete(listString.length() - 2, listString.length());
        listString.append("]");
        return listString.toString();
    }
}
