import java.util.Scanner;

public class exer2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //criando variaveis
        double num1, num2, num3, mediaGeometrica;

        //entrada
        System.out.println("Escreva o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo numero: ");
        num2 = sc.nextDouble();
        System.out.println("Escreva o terceiro numero: ");
        num3 = sc.nextDouble();

        //processamento
        mediaGeometrica = Math.pow(num1 * num2 * num3, 1.0/3.0);
        //mediaGeometrica = Math.cbrt(num1 * num2 * num3);

        //saida
        System.out.println("A média Geografica é " + mediaGeometrica);
    }
}