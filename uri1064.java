import java.util.Scanner;

public class uri1064{ 
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);

        float num, soma = 0, media = 0;
        int quantidade = 0;

        for (int cont = 1; cont <= 6; cont ++){
            num = input.nextFloat();
        
            if (num >0){
                quantidade = quantidade+1;
                soma = soma + num;
            }
        }  
        media = soma / quantidade;

        System.out.println(quantidade +" valores positivos");
        System.out.printf("%.1f\n", media);
               
    }        
}                