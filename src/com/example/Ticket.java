package com.example;

/**
 * Created by bsheen on 4/13/17.
 */
public class Ticket {

    private static int instanceCounter = 0;
    private String name;
    private int priority;
    private int instanceNumber;

    public Ticket() {
        instanceNumber = ++instanceCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ticket ticket = (Ticket) o;

        if (priority != ticket.priority) return false;
        return name != null ? name.equals(ticket.name) : ticket.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + priority;
        return result;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                ", instanceNumber=" + instanceNumber +
                '}';
    }
}
