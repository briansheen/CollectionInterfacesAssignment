package com.example;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Created by bsheen on 4/13/17.
 */
public class Queue<E> {
    //    private LinkedList<E> q = new LinkedList<>();

    Comparator comparator = new TicketComparator();
    private PriorityQueue<E> q = new PriorityQueue<E>(100, comparator);

    public void add(E e) {
        q.add(e);
    }

    public void remove(E e) {
        q.remove(e);
    }

    public void offer(E e) {
        q.offer(e);
    }

    public E poll() {
        return q.poll();
    }

    @Override
    public String toString() {
        return "Queue{" +
                "q=" + q +
                '}';
    }
}
