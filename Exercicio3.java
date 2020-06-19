import java.util.Scanner;

public class Exercicio3{  //KW gasto pela residencia
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float salarioMinimo, qtdadeKw, valorKw, valorPagamento, valorDesconto ;
    
    //Entrada
    System.out.println ("Digite o valor do Salario Minimo");
    salarioMinimo= teclado.nextFloat();

    System.out.println ("Digite a quantidade de KW gasto pela residencia");
    qtdadeKw= teclado.nextFloat();
    
       
    //Processamento
    valorKw = (salarioMinimo / 7) / 100;
    valorPagamento = valorKw * qtdadeKw;
    valorDesconto = valorPagamento - (valorPagamento/10);


    //Saída
    System.out.printf("O valor em reais de cada Kw = R$ %.2f\n", valorKw);
    System.out.printf("O valor em reais a ser pago = R$ %.2f\n", valorPagamento);
    System.out.printf("O valor em reais a ser pago com 10% de desconto = R$ %.2f\n", valorDesconto);

    }
}