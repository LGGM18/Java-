public class BibliotecaTeste{ 
    public static void main(String args[]){ 
       
   
        Biblioteca l1, l2, l3, l4, l5; 

      
        l1 = new Biblioteca("Livro 1","Azul da Silva","2010","Tecnologia","2","4",false);
        l2 = new Biblioteca("Livro 2","Amarelo da Silva","2011","Artes","2","5",false);    
        l3 = new Biblioteca("Livro 3","Vermelho Vermelhao","2015","Religião","3","2",false);
        l4 = new Biblioteca("Livro 4","Laranja de Souza","2019","Historia","3","3",false);
        l5 = new Biblioteca("Livro 5","Cinza Grafite","2020","Matematica","2","6",false);
 
        System.out.println(l1.imprimir()); 
        System.out.println(l2.imprimir()); 
        System.out.println(l3.imprimir()); 
        System.out.println(l4.imprimir()); 
        System.out.println(l5.imprimir()); 
       

        l1.setEmprestado(true);
        System.out.println(l1.imprimir());   
    } 
} 