import java.util.Scanner;

public class exer6desafio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //variaveis
        double volumeCi, areaCI, alturaCI, raioCI;

        //entrada
        System.out.println("digite a base do cilindro:");
        raioCI = sc.nextDouble();
        System.out.println("Digite a altura do cilindro");
        alturaCI =sc.nextDouble();

        //processamento cilintro
        areaCI = (2.0 * Math.PI * raioCI )* (raioCI + alturaCI) ;
        volumeCi = (Math.PI * Math.pow(raioCI, 2.0)) * alturaCI;

        //processamento cone

    }
}
