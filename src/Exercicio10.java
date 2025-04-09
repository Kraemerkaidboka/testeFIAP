import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DecimalFormat dc = new DecimalFormat("00,0");

        int numero_binario, numero_convertido, N1, N2, N3, N4;

        System.out.println("coloque o numero binario aqui");
        numero_binario = sc.nextInt();

        N4 = numero_binario / 1000;
        N3 = numero_binario / 100 % 10;
        N2 = numero_binario %100 / 10;
        N1 = numero_binario % 10;

        numero_convertido = N4 * 8 + N3 * 4 + N2 * 2 + N1;



        System.out.println(numero_convertido);



    }
}
