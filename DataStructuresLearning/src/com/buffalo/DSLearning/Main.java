package com.buffalo.DSLearning;

public class Main {

    public static void main(String[] args) {
        Node first = new Node();
        first.setValue(3);
        Node middle = new Node();
        middle.setValue(6);
        first.setNext(middle);
        Node last = new Node();
        last.setValue(9);
        middle.setNext(last);

        PrintList(first);

    }
    public static void PrintList(Node node){
        while(node!=null){
            System.out.print(node.getValue() + "-->" );
            node=node.getNext();
        }
        System.out.println("NULL");
    }
}
