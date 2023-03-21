import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int number = num.nextInt();

        for (int i = 1; i <= number; i++) {
            int aux = i;
            String res = "";
            while (aux > 0) {
                res += i;
                aux--;
            }

            System.out.println(res);
        }

    }
}