package com.netcracker.projects.tasks.horstmann.chapter3;

public class IntSequence implements IntSequanceable {
    public static IntSequence innerIntSequence = new IntSequence() {
        @Override
        public String of(int... values) {
            return super.of(values);
        }
    };

    @Override
    public String of(int... values) {
        StringBuilder resSeq = new StringBuilder();
        for (int number : values) {
            resSeq.append(number + " ");
        }
        return resSeq.toString();
    }

    public static void constant(int constanta) {
        int ind = 0;
        while (ind++ <= 500) {
            System.out.print(constanta + " ");
        }
    }
}
