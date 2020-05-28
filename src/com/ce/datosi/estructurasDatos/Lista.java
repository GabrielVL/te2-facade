package com.ce.datosi.estructurasDatos;

/**
 *
 * @param <T>
 */
public class Lista<T> {

    private Nodo<T> head;

    public Nodo<T> getHead() {
        return head;
    }

    public Nodo<T> getLast() {
        Nodo<T> lastNode = this.head;
        while (lastNode.getNext() != null) {
            lastNode = lastNode.getNext();
        }
        return lastNode;
    }

    public void add(T data) {
        // Create a new node with given data
        Nodo<T> newNode = new Nodo<>(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            // Else traverse till the last node and insert the newNode there
            Nodo<T> lastNode = getLast();
            // Insert the newNode at last node
            lastNode.setNext(newNode);
        }
    }

    public void print() {
        Nodo<T> currentNode = this.head;

        System.out.print("\n[");

        // Traverse through the LinkedList
        while (currentNode != null) {

            // Print the data at current node
            System.out.print(currentNode.getData());

            if (currentNode.getNext() != null) {
                System.out.print(", ");
            }

            // Go to next node
            currentNode = currentNode.getNext();
        }
        System.out.println("]\n");
    }

}
