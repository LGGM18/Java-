import java.util.Scanner;

public class Exercicio2b{ //Area do Retangulo
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float area, base, altura;

    //Entrada
    System.out.println ("Digite o valor da Base");
    base= teclado.nextFloat();

    System.out.println ("Digite o valor da Altura");
    altura= teclado.nextFloat();

    //Processamento
    area = base * altura;

    //Saída
    System.out.println("O valor da area =" +area);

    }
}