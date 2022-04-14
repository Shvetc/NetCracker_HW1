package com.netcracker.projects.tasks.horstmann.chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lottery {
    public static List<Integer> getTickets() {
        int countTickets = 49;
        List<Integer> tickets = new ArrayList<>();
        for (int i = 0; i < countTickets; i++) {
            tickets.add(i + 1);
        }
        return tickets;
    }

    static Integer getRandomIndex(Integer countTickets) {
        Integer randomIndex = (int) Math.floor(Math.random() * countTickets);
        return randomIndex;
    }

    public static List<Integer> getRandomTickets(List<Integer> theTickets) {
        List<Integer> randomTickets = new ArrayList<>();
        for (int j = 0; j < 6; j++) {
            Integer currentRandomTicket = getRandomIndex(theTickets.size());
            if (!randomTickets.contains(currentRandomTicket)) {
                randomTickets.add(currentRandomTicket);
                theTickets.remove(currentRandomTicket);
            }
        }
        Collections.sort(randomTickets);

        return randomTickets;
    }
}
