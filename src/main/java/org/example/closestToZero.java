package org.example;


//    implement closestToZero to return the integer in the array insts that is closest to zero
//
//        if there are two integers equally close to zero, consider the positive element to be closer to zero(exemple: if ints contains -5 an 5, return 5).
//        if insts is null or empty, return 0.
//
//        input: integers in ints have values ranging from -2147483647 to 2147483647


public class closestToZero {
    public static int closestToZero(int[] ints) {
        if (ints == null && ints.length == 0) {
            return 0;
        }

        int closest = Integer.MAX_VALUE;
        for (int i : ints) {
            if (Math.abs(i) < Math.abs(closest)) {
                closest = i;
            } else if (Math.abs(i) == Math.abs(closest) && i > 0) {
                closest = i;
            }
        }

        return closest;
    }


    public static void main(String[] args) {
        int[] ints = {-9, 8, 2, -5, 7};
        System.out.println(closestToZero(ints));
    }

}

