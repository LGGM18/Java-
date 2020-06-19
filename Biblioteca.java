public class Biblioteca{ 

    private String      tituloLivro;       
    private String      autor; 
    private String      anoPublicacao; 
    private String      categoria; 
    private String      estante;
    private String      prateleira;
    private Boolean     emprestado; 

     
    public Biblioteca(String tit, String aut, String ano, String categ, String est, String pra, Boolean emp){ 
        tituloLivro     = tit; 
        autor           = aut; 
        anoPublicacao   = ano; 
        categoria       = categ;
        estante         = est;
        prateleira      = pra;
        emprestado      = emp;
    } 
 
    
    public void setTituloLivro(String tit){ 
        tituloLivro = tit; 
    } 
    public String getTituloLivro(){ 
        return tituloLivro; 
    } 
    public void setAutor(String aut){ 
        autor = aut; 
    } 
    public String getAutor(){ 
        return autor; 
    } 
    public void setAnoPublicacao(String ano){ 
        anoPublicacao = ano; 
    } 
    public String getAnoPublicacao(){ 
        return anoPublicacao; 
    } 
    public void setCategoria(String categ){ 
        categoria = categ; 
    } 
    public String getCategoria(){ 
        return categoria;
    }
    public void setEstante(String est){ 
        estante = est; 
    } 
    public String getEstante(){ 
        return estante;
    }
    public void setPrateleira(String pra){ 
        prateleira = pra; 
    } 
    public String getPrateleira(){ 
        return prateleira;
    }
    public void setEmprestado(Boolean emp){ 
        emprestado = emp; 
    } 
    public Boolean getEmprestado(){ 
        return emprestado;
    }

    
    public String imprimir(){ 
        return "Titulo: "+tituloLivro+" - Autor: "+autor+" - Ano de Publicacao: "+anoPublicacao+" - Categoria: "+categoria+" - Posicao  Estante: "+estante+" - Prateleira: "+prateleira+ " - Status: " +emprestado;
    } 
} 