import java.util.Scanner;

public class Exercicio2f{  //Volume do Paralelepipedo
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float volume, altura, largura, profundidade;

    //Entrada
    System.out.println ("Digite o valor da altura");
    altura= teclado.nextFloat();

    System.out.println ("Digite o valor da largura");
    largura= teclado.nextFloat();

    System.out.println ("Digite o valor da profundidade");
    profundidade= teclado.nextFloat();

    //Processamento
    volume = altura * largura * profundidade;

    //Saída
    System.out.println("O valor do volume =" +volume);

    }
}