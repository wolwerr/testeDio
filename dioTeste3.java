import java.util.Scanner;

public class dioTeste3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int V = 0;

        while (V <= R) {
            V = scanner.nextInt();
        }
        int soma = 0;
        int cont = 0;
        while (soma <= V) {
            soma += R;
            R++;
            cont++;
        }
        System.out.println(cont);
    }
}

