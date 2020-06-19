import java.util.Scanner;

public class Exercicio2h{  //Volume do Cilindro
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float raio, altura, volume;
    
    //Entrada
    System.out.println ("Digite o valor do raio");
    raio= teclado.nextFloat();

    System.out.println ("Digite o valor do altura");
    altura= teclado.nextFloat();
    
    Float pi=3.14f;
    
    //Processamento
    volume = pi * raio * raio * altura;

    //Saída
    System.out.printf("O valor do volume = %.2f\n", volume);


    }
}