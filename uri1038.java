import java.util.Scanner;

    public class uri1038{
        public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            
            int codigo, qtdade;
            float conta = 0;

             
            codigo = input.nextInt();
            qtdade = input.nextInt();
            
            if (codigo == 1){
                conta = qtdade * 4.00f;
            }

                else{
                    if (codigo == 2){
                    conta = qtdade * 4.50f;
                    }
                
                    else{
                        if (codigo == 3){
                        conta = qtdade * 5.00f;
                        }
                           
                        else{
                            if (codigo == 4){
                            conta = qtdade * 2.00f;
                            }
                 
                            else{
                                if (codigo == 5){
                                conta = qtdade * 1.50f;
                                }
                            }
                        }
                    }
                }   
            
            System.out.printf("Total: R$ %.2f\n",conta);
        }
    }                    