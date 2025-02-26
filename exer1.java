import java.util.Scanner;

public class exer1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //criando variaveis
        double num1, num2, soma, subtracao, multiplicacao, divisao;

        //entrada
        System.out.println("Escreva o primeiro numero:");
        num1 = sc.nextDouble();
        System.out.println("Escreva o segundo numero:");
        num2 = sc.nextDouble();

        //processamento
        soma = num1 + num2;
        subtracao = num1 - num2;
        multiplicacao = num1 * num2;
        divisao = num1 / num2;

        //saida
        System.out.println("soma: " + soma + "\n" + "subtração: " + subtracao + "\n" + "multiplicação: " + multiplicacao
                + "\n" + "divisão: " + divisao );
    }
}
