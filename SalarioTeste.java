public class SalarioTeste{ 
    public static void main(String args[]){ 
       
        // apenas declarei as referencias 
        Salario p1, p2, p3; 

        double X = 150;
        double aumento;
 
        // aqui vou criar os objetos 
        p1 = new Salario("Azul","pai", 4000); 
        p2 = new Salario("Amarelo","filho", 3000); 
        p3 = new Salario("Laranja","mae", 4500); 

 
        System.out.println(p1.imprimir()); 
        System.out.println(p2.imprimir()); 
        System.out.println(p3.imprimir()); 

        aumento = x / 100;

        p1.setAumento(aumento);

        System.out.println(p1.imprimir());   
    } 
} 