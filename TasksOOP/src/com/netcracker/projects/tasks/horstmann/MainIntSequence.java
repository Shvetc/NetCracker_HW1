package com.netcracker.projects.tasks.horstmann;

import com.netcracker.projects.tasks.horstmann.chapter3.IntSequence;

public class MainIntSequence {
    public static void main(String[] args) {
        System.out.println(IntSequence.innerIntSequence.of(1, 2, 3, 4, 5, 6));
        IntSequence.constant(1);
    }
}
