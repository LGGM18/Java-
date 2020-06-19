import java.util.Scanner;

public class Exercicio5{  //Consumo
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float tempo, velocidade, distancia, consumo;
    
    //Entrada
    System.out.println ("Digite o tempo da viagem");
    tempo= teclado.nextFloat();

    System.out.println ("Digite a velocidade media");
    velocidade= teclado.nextFloat();
    
          
    //Processamento
    distancia = tempo * velocidade;
    consumo = distancia / 12;


    //Saída
    System.out.printf("Voce percorreu %.3f km\n a uma velocidade de %.3f km/h \n e consumiu %.3f litros",distancia, velocidade, consumo);
    

    }
}