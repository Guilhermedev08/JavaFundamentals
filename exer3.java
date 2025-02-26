import java.text.DecimalFormat;
import java.util.Scanner;

public class exer3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //variaveis
        double raio, p, perimetro;

        //entrada
        System.out.println("digite o raio:");
        DecimalFormat df = new DecimalFormat("#.0");
        raio = sc.nextDouble();

        //processamento
        p = 3.14;
        perimetro = 2 * p * raio;

        //saida
        System.out.println("o perimetro é " + df.format(perimetro));
    }
}
