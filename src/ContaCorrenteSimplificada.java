public class ContaCorrenteSimplificada {
        
        private String agencia;
        private String nroConta;
        private double saldo;
        // Alteração Dia 03/09/2019
        private Pessoa pessoa;
       /** private String nomeDoCorrentista;
        private String rg;
        private String cpf;
    **/
        // Alteração Dia 03/09/2019
        public void setPessoa(Pessoa pessoa){
            this.pessoa = pessoa;
        }
        public Pessoa getPessoa(){
            return this.pessoa;
        }
    public void ExibirDados(){
         // Alteração Dia 03/09/2019
         System.out.println("AGENCIA: "+ this.agencia);
         System.out.println("CONTA-CORRENTE: "+ this.nroConta);
         if(this.pessoa instanceof PessoaFisica){
         System.out.println("NOME: "+ ((PessoaFisica)this.pessoa).getNomeCompleto());
         System.out.println("RG: "+ ((PessoaFisica)this.pessoa).getRg());
         System.out.println("CPF: "+ ((PessoaFisica)this.pessoa).getCpf());
             
         }else if(this.pessoa instanceof PessoaJuridica){
             System.out.println("NOME-FANTASIA: "+((PessoaJuridica)this.pessoa).getNomeFantasia());
             System.out.println("RAZÃO-SOCIAL: "+((PessoaJuridica)this.pessoa).getRazaoSocial());
             System.out.println("CNPJ: "+((PessoaJuridica)this.pessoa).getCnpj());
    }
         System.out.println("SALDO: "+this.saldo);

        /*System.out.println("AGENCIA: "+ this.agencia);
        System.out.println("CONTA-CORRENTE: "+ this.nroConta);
        System.out.println("NOME: "+ this.nomeDoCorrentista);
        System.out.println("RG "+ this.rg);
        System.out.println("CPF "+ this.cpf);
        System.out.println("SALDO: "+ this.saldo);
        */
    }
    public double depositar(double valor){
        this.saldo = this.saldo + valor;
        return this.saldo;
    }
    
    public double sacar(double valor){
        
        if( saldo < valor  ){        
            System.out.println("Saldo insulficiente");
        }else{
            this.saldo = this.saldo - valor;
        }     
            return this.saldo;
    }
    
    
    public void setAgencia(String agencia){
        this.agencia = agencia;
    }
    
    public String getAgencia(){
        return this.agencia;
    }
    
    public void setnroConta(String nroConta){
        this.nroConta = nroConta;
    }
    
    public String getnroConta(){
        return this.nroConta = nroConta;
    }
    /*
    public void setnomeDoCorrentista(String nomeDoCorrentista){
        this.nomeDoCorrentista = nomeDoCorrentista;
    }
    
    public String getnomeDoCorrentista(){
        return this.nomeDoCorrentista = nomeDoCorrentista;
    }
    
    public void setrg(String rg){
        this.rg = rg;
    }
    
    public String getrg(){
        return this.rg = rg;
    }
    
    public void setcpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getcpf(){
        return this.cpf = cpf;
    }
    
    
    */
}
