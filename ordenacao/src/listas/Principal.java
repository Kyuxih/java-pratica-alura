package listas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Java");
        listaArrayList.add("Python");
        listaArrayList.add("JavaScript");
        System.out.println("ArrayList: " + listaArrayList);

        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Java");
        listaLinkedList.add("Python");
        listaLinkedList.add("JavaScript");
        System.out.println("LinkedList: " + listaLinkedList);
    }
}
