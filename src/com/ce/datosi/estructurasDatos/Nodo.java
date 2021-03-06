package com.ce.datosi.estructurasDatos;

public  class Nodo<T> {

    private T data;
    private Nodo<T> next;

    public Nodo(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }
}
