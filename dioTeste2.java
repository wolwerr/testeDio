import java.util.Scanner;

public class dioTeste2 {
    /* Function to get product of digits */
    static int getProduct(int n)
    {
        int product = 1;

        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
        return product;
    }

static int getSum(int n)
    {
        int sum = 0;

        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        return sum;
    }

    // Driver program
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        System.out.println(getProduct(n)-getSum(n));
    }
}

