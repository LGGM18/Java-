import java.util.Scanner;

    public class uri002{
        public static void main (String Args[]){
        Scanner teclado= new Scanner (System.in);

        double pi, raio, raio2, area;
        
        raio= teclado.nextDouble();
        pi= 3.14159;
        raio2= raio * raio;
        area= raio2 * pi;

        System.out.printf("A=%.4f\n",area);

    }

}