package org.example.utils;

public class MiddleElementUtils {

    public static void mainUtils(){
        final LinkedList list = new LinkedList();
        list.add(new LinkedList.Node("2"));
        list.add(new LinkedList.Node("5"));
        list.add(new LinkedList.Node("8"));
        list.add(new LinkedList.Node("12"));
        list.add(new LinkedList.Node("19"));
        list.add(new LinkedList.Node("45"));
        list.add(new LinkedList.Node("49"));

        LinkedList.Node current = list.head();
        LinkedList.Node middle = list.head();
        int length = 0;
        while(current.next() != null){
            length++;
            System.out.print(current.data() + " ") ;
            if(length % 2 == 0){
                middle = middle.next();
            }
            current = current.next();
        }

        if(length % 2 == 1){
            middle = middle.next();
        }

        System.out.println("middle element:" + middle.data());
    }




}
