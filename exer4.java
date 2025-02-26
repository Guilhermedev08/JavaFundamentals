import java.text.DecimalFormat;
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //variaveis
        double raio, area;

        //entrada
        System.out.println("Digite o raio do círculo em milímetros: ");
        DecimalFormat df = new DecimalFormat("#.00");
         raio = scanner.nextDouble();

        //processamento
         area = Math.PI * Math.pow(raio, 2);

        //saida
        System.out.println("A área do círculo é: " + df.format(area) + " mm²");
    }
}