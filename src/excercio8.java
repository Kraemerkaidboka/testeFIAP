import java.util.Scanner;

public class excercio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Valor, dezena;

        System.out.println("informe o valor");
        Valor= sc.nextInt();

        dezena = Valor % 10;

        System.out.println("sua dezena é " + dezena);

    }
}
