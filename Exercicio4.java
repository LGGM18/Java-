import java.util.Scanner;

public class Exercicio4{  //Salario Liquido
    public static void main(String args[]){
    Scanner teclado= new Scanner (System.in);
    Float salarioLiquido, valorHora, horas, percInss, inss, salarioBruto;
    
    //Entrada
    System.out.println ("Digite o valor da Hora Trabalhada");
    valorHora= teclado.nextFloat();

    System.out.println ("Digite a quantidade de horas trabalhadas");
    horas= teclado.nextFloat();
    
    System.out.println ("Digite o percentual de desconto do INSS");
    percInss= teclado.nextFloat();
       
    //Processamento
    salarioBruto = horas * valorHora;
    inss = salarioBruto * (percInss/100f);
    salarioLiquido = salarioBruto - inss;


    //Saída
    System.out.printf("O valor em reais do salario liquido = R$ %.2f\n", salarioLiquido);
    

    }
}