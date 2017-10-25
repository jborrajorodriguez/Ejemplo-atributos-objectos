package ejemplo.atributos.objectos;
/**

 * @author jborrajorodriguez
 */
public class Conta {
    private Persoa titular;
    private double saldo;
    
    public Conta(){                                 //constructor por defecto
        titular=new Persoa();
    }
    public Conta(String nome,String dni,double saldo){
        titular=new Persoa();
        titular.setNome(nome);
        titular.setDni(dni);
        this.saldo=saldo;
    }
    //Metodos de acceso.
    public void setTitular(Persoa titular){
       this.titular=titular;
    }
    public Persoa getTitular(){
       return titular;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    
    public double getSaldo(){
        return saldo;   
    }
    @Override
    public String toString(){
        return("Nome : "+titular.getNome()+"\nDNI : "+titular.getDni()+"\nSaldo : "+saldo);
    }
    
}
