package ejemplo.atributos.objectos;
/**
 * @author jborrajorodriguez
 */
public class Persoa {
    private String nome;
    private String dni;
    
    public Persoa(){//constructor por defecto
        
    }
    public Persoa(String nome,String dni){//constructor con valores
        this.nome=nome;
        this.dni=dni;
    }   
    
    public void setNome(String persoa){
        this.nome=nome;
    }
    public String getNome(){
        return nome;
    }
    public void setDni(String dni){
        this.dni=dni;
    }
    public String getDni(){
        return dni;
    }
     public String toString(){
         return("Nome : "+nome+"/nDNI : "+dni);
     }
    
}
