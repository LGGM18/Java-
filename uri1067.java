import java.util.Scanner;

public class uri1067{ 
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);

        int num, impar;
        
        num = input.nextInt();

        for (impar = 1; impar <= num; impar = impar+2){
            System.out.println(impar);
        }
               
    }        
}               