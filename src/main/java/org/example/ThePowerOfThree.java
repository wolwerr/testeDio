package org.example;

import java.util.Scanner;

public class ThePowerOfThree {
    public static void main(String[] args) {


        //TODO: Create the necessary conditions so that the print program in the console gives the right answer;
            Scanner inputReader = new Scanner(System.in);
            int n = inputReader.nextInt();
        if((n<3) && (Math.pow(n,3) != 0)) {
            System.out.println(false);
        }
        if(n%3 != 0){
            System.out.println(true);
        }
    }
}

//        public static boolean isPowerOfThree ( int n){
//            //TODO 2:Create the condition for the program to return true or false;
//
//            if (isPowerOfThree(n))
//                System.out.println(n + "true");
//            else
//                System.out.println(n + "false");
//
//        }
//

