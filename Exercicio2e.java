import java.util.Scanner;

public class Exercicio2e{  //Area de 1 trapézio
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float area, baseMaior, baseMenor, altura;

    //Entrada
    System.out.println ("Digite o valor da base menor");
    baseMenor= teclado.nextFloat();

    System.out.println ("Digite o valor da base maior");
    baseMaior= teclado.nextFloat();

    System.out.println ("Digite o valor da altura");
    altura= teclado.nextFloat();

    //Processamento
    area = (baseMaior + baseMaior)* altura/2;

    //Saída
    System.out.println("O valor da area =" +area);

    }
}