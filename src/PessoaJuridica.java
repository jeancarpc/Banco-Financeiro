public class PessoaJuridica extends Pessoa{
    
    protected String nomeFantasia;
    protected String razaoSocial;
    protected String cnpj;
    /*private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;
    */
    public void setnomeFantasia(String nomeFantasia){
        this.nomeFantasia = nomeFantasia;
    }
    public String getNomeFantasia(){
        return this.nomeFantasia;
    }
    public void setRazaoSocial(String razaoSocial){
        this.razaoSocial = razaoSocial;
    }
    public String getRazaoSocial(){
        return this.razaoSocial;
    }
    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }
    public String getCnpj(){
        return this.cnpj;
    }
    
    
}
