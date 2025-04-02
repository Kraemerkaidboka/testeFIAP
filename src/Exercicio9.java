import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int valor, DF, DM, DT, Inverte;

        System.out.println("digite o valor");
        valor = sc.nextInt();


        DF = valor / 100;
        DM = valor % 100 / 10;
        DT = valor % 10;

        System.out.println(" o valor invertido é " + DT + DM + DF);
    }
}
