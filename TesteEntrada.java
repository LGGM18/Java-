import java.util.Scanner;

public class TestEntrada{
    public static void main (String args{}){
        Scanner teclado = new Scanner(System.in);
        int a,b,c;
        float d=3.14f;

        System.out.println("Digite os valores de A e B");
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = a + b;

        //Processamento
        c = a + b;

        //Saída
        System.out.println("Valor de a =" +a);
        System.out.println("Valor de b =" +b);
        System.out.println("Valor de c =" +c);
        
        System.out.printf("Valor de d = %.2f\n", +d);
        
    
}

}