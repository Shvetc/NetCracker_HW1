package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter1.Lottery;

import java.util.List;

public class MainEx13 {
    public static void main(String[] args) {
        List<Integer> aTickets = Lottery.getTickets();
        List<Integer> randomTickets = Lottery.getRandomTickets(aTickets);
        System.out.println(randomTickets);
    }
}
