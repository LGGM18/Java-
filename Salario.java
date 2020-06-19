// definição da classe salario 
public class Salario{ 

// definição dos atributos "blindados"/encapsulados 
// estes atributos só tem acesso dentro da classe 
    
    private String nome;       
    private String cargo; 
    private double salario; 
    

    // método construtor para que eu, ao dar "new" num novo objeto, 
    // seja obrigado a passar as 3 informações para ele nesta sequencia 
    // nome, cargo e salario 
     
    public Salario(String no, String ca, double sa){ 
        nome      = no; 
        cargo     = ca; 
        salario   = sa; 
    } 

 
// métodos GET e SET para cada atributo  
// GET = método para consultar, ou seja, retorna o valor armazenado no atributo 
// SET = método para alterar/atribuir novo valor 
    
    public void setNome(String no){ 
        nome = no; 
    } 
    public String getNome(){ 
        return nome; 
    } 
    public void setCargo(String ca){ 
        cargo = ca; 
    } 
    public String getCargo(){ 
        return cargo; 
    } 
    public void setSalario(double sa){ 
        salario = sa; 
    } 
    public double getSalario(){ 
        return salario; 
    } 
    public void setAumento(double perc){ 
        aumento = salario + (perc * salario); 
    } 
    public double getAumento(){ 
        return aumento; 
    } 

 
    // perfumaria do ISIDRO 
    // um método que já retorna uma STRING compondo todas as infos da pessoa 
   
    public String imprimir(){ 
        return nome+" "+cargo+" salario: R$ "+salario; 
    } 
} 