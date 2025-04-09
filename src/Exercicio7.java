import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");


        double x, y;

        System.out.println("informe o valor de x ");
        x = sc.nextDouble();

        y = Math.sqrt(1 + Math.pow( (Math.pow(x, 4) - 1)/ (2 *
                Math.pow( x, 2)), 2))  - Math.pow(x, 2)/ 2;

        System.out.println( df.format(y));

    }
}
