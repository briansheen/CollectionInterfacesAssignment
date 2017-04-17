package com.example;


import java.util.Comparator;

/**
 * Created by bsheen on 4/17/17.
 */
public class TicketComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket o1, Ticket o2) {
        if (o1 != null && o2 != null) {
            if (o1.getPriority() == o2.getPriority()) {
                return 0;
            }
            if (o1.getPriority() > o2.getPriority()) {
                return 1;
            }
            return -1;
        }
        return 0;
    }
}
