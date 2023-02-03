import java.util.Scanner;

public class dioteste {
        public static void main(String[] args) {

            Scanner reader = new Scanner(System.in);
            int year;

            year = reader.nextInt();
            // year to be checked

            boolean leap = false;

            // if the year is divided by 4
            if (year % 4 == 0) {

                // if the year is century
                if (year % 100 == 0) {

                    // if year is divided by 400
                    // then it is a leap year
                    if (year % 400 == 0)
                        leap = true;
                    else
                        leap = false;
                }

                // if the year is not century
                else
                    leap = true;
            }

            else
                leap = false;

            if (leap)
                System.out.println("Leap year");
            else
                System.out.println("Not leap year");
        }
    }

