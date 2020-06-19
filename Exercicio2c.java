import java.util.Scanner;

public class Exercicio2c{ //Area do Triangulo
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float area, base, altura;

    //Entrada
    System.out.println ("Digite o valor da Base");
    base= teclado.nextFloat();

    System.out.println ("Digite o valor da Altura");
    altura= teclado.nextFloat();

    //Processamento
    area = (base * altura)/2;

    //Saída
    System.out.println("O valor da area =" +area);

    }
}