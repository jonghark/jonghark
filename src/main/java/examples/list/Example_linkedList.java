package examples.list;

import java.util.LinkedList;

public class Example_linkedList {
    public static void main(String[] args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        System.out.println(linkedList + "> 1 add ");
        linkedList.add(1,10);
        System.out.println(linkedList +">10 add after index 1");
        linkedList.addFirst(2);
        System.out.println(linkedList +">2 add at the first");
        linkedList.addLast(3);
        System.out.println(linkedList +">3 add at the last");

        linkedList.remove();
        linkedList.remove(1);
        linkedList.removeFirst();
        linkedList.removeLast();
    }
}
