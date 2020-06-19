import java.util.Scanner;

public class Exercicio2a{ //Area do Quadrado
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float area, lado;

    //Entrada
    System.out.println ("Digite o valor da lado do quadrado");
    lado= teclado.nextFloat();

    //Processamento
    area = lado * lado;

    //Saída
    System.out.println("O valor da area =" +area);

    }
}