import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        double y, x;

        System.out.println("Qual o valor de x? ");
        x = sc.nextDouble();

        y = Math.sqrt(Math.cbrt(x - 1/2));

        System.out.println(" y é " + y );

    }
}
