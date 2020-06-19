import java.util.Scanner;

public class Exercicio2d{  //Area de 1 losango
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float area, diagonal1, diagnoal2;

    //Entrada
    System.out.println ("Digite o valor da Diagonal 1");
    diagonal1= teclado.nextFloat();

    System.out.println ("Digite o valor da Diagonal 2");
    diagnoal2= teclado.nextFloat();

    //Processamento
    area = diagonal1 * diagnoal2;

    //Saída
    System.out.println("O valor da area =" +area);

    }
}