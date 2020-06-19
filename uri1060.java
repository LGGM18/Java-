import java.util.Scanner;

public class uri1060{ 
    public static void main(String args[]){ 
        Scanner input = new Scanner(System.in);

        float num;
        int quantidade = 0; 
        
        for (int cont =1; cont <= 6; cont ++){
        
            num = input.nextFloat();
            if (num >0){
                quantidade = quantidade+1;
            }
        }  
        System.out.println(quantidade + " valores positivos");
               
    }        
}                