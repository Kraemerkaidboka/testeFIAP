import java.text.DecimalFormat;
import java.util.Scanner;

public class giovannatalarica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0,000.00");

        double valorhora, horastrabalhadasmes, inss, SalarioBruto, Salarioliquido, valordescontado;

        System.out.println("quanto voce ganha de horas trabalhadas");
        valorhora = sc.nextDouble();

        System.out.println("quantas horas voce trabalhou?");
        horastrabalhadasmes = sc.nextDouble();

        SalarioBruto = valorhora * horastrabalhadasmes;

        System.out.println("quanto % de inss?");
        inss = sc.nextDouble();

        valordescontado = SalarioBruto * inss / 100;

        Salarioliquido = SalarioBruto - valordescontado;


        System.out.println("seu salario bruto é:" + df.format(SalarioBruto) );
        System.out.println(" O valor descontado é de " + df.format(valordescontado));
        System.out.println("seu salario liquido é de: " + df.format(Salarioliquido));



    }
}
