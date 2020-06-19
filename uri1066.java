import java.util.Scanner;

public class uri1066{ 
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);

        float num;
        int positivo = 0, negativo = 0, par=0, impar=0;
        int quantidade = 0;

        for (int cont = 1; cont <= 5; cont ++){
            num = input.nextInt();

            if (num >0){
                positivo = positivo + 1;
            }
            
            if (num <0){
                negativo = negativo + 1;
            }

            if (num %2 == 0){
                par = par + 1;
            }

            if (num %2 != 0){
                impar = impar + 1;
            }
        }
        
        System.out.println(par+ " valor(es) par(es)");
        System.out.println(impar+ " valor(es) impar(es)");
        System.out.println(positivo+ " valor(es) positivo(s)");
        System.out.println(negativo+ " valor(es) negativo(s)");
               
    }        
}               