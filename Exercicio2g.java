import java.util.Scanner;

public class Exercicio2g{  //Volume do Cubo
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float volume, lado;

    //Entrada
    System.out.println ("Digite o valor do lado");
    lado= teclado.nextFloat();

    //Processamento
    volume = lado * lado * lado;

    //Saída
    System.out.println("O valor do volume =" +volume);

    }
}