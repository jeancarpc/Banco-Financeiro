public class PessoaFisica extends Pessoa{
    private String nomeCompleto;
    private String cpf;
    private String rg;
    
    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public String getCpf(){
        return this.cpf;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return this.rg;
    }
}
