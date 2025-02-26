import java.util.Scanner;
import java.lang.Math;

public class exer5desafio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //variaveis
        double a, b, c, delta, x1p, x2n;

        //entrada
        System.out.println("escreva o numero A da função:");
        a = sc.nextDouble();
        System.out.println("escreva o numero B da função");
        b = sc.nextDouble();
        System.out.println("escreva o numero c da função");
        c = sc.nextDouble();

        //processamento
        delta = Math.pow(b, 2.0) - 4 * a * c;
        x1p = (- b + Math.sqrt(delta))/(2.0*a);
        x2n = (- b - Math.sqrt(delta))/(2.0*a);

        //saida
        System.out.println("delta sendo " + delta + " então " + "x1 positivo " + x1p + " x2 negativo " + x2n);
    }
}