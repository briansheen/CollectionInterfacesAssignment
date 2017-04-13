package com.example;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by bsheen on 4/13/17.
 */
public class Queue<E> {
    private List<E> q = new LinkedList<>();

    public void add(E e) {
        q.add(e);
    }

    public E remove(){
        if(q.isEmpty()){
            return null;
        }
        return q.remove(0);
    }


    @Override
    public String toString() {
        return "Queue{" +
                "q=" + q +
                '}';
    }
}
