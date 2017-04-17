package com.example;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main3 {

    private static String[] names = {"Zula", "Irving", "Chanelle", "Terra", "Newton", "Jeraldine", "Liane", "Helen", "Willette", "Myra", "Jeramy", "Paulita", "Mollie", "Evelyne", "Alberto", "Carina", "Zana", "Kassie", "Brian", "Jeb", "Matt", "Gil"};
    private static Queue<Ticket> q = new Queue<>();
    private static Random random = new Random();

    public static void main(String[] args) {

        while (true) {

            addToQ();
            System.out.println(q + "\n");

            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                System.out.println("error sleeping!");
            }

            removeFromQ();
            System.out.println(q + "\n");

            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                System.out.println("error sleeping!");
            }
        }

    }

    private static void addToQ() {
        int addRandom = random.nextInt(10) + 1;

        System.out.println("number to add in line: " + addRandom);

        for (int i = 0; i < addRandom; ++i) {
            Ticket ticket = new Ticket();
            ticket.setPriority(random.nextInt(100));
            ticket.setName(names[random.nextInt(names.length)]);
            q.offer(ticket);
        }
    }

    private static void removeFromQ() {
        int remRandom = random.nextInt(10) + 1;

        System.out.println("number to remove from line: " + remRandom);

        for (int i = 0; i < remRandom; ++i) {
            Ticket ticket = q.poll();
            System.out.println("removing: " + ticket);
        }
    }


}


