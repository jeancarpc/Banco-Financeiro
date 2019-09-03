public class Principal {
    public static void main(String[] args){
        ContaCorrenteSimplificada conta1, conta2;
        conta1 = new ContaCorrenteSimplificada();
        
        PessoaFisica p1 = new PessoaFisica();
        
        conta1.setAgencia("123");
        conta1.setnroConta("55789-6");
                
        /*p1.setAgencia("123");
        p1.setnroConta("1234-5");
        p1.setcpf("333,555,222-56");
        p1.setrg("11225556");
        p1.setnomeDoCorrentista("jean");
        */
        p1.setCpf("123.456.789-22");
        p1.setRg("55789-6");
        p1.setNomeCompleto("JOÃO DA SILVA SAURO");
        
        conta1.setPessoa(p1);
        
        
        double valor = conta1.depositar(200.50);
        double saldoFinal = conta1.sacar(10.25);
        System.out.println(saldoFinal);
        
        System.out.println("=================================================");
        conta1.ExibirDados();
        
        System.out.println("=================================================");
        
        

        
        conta2 = conta1;
        PessoaFisica p2 = new PessoaFisica();
        p2.setNomeCompleto("MARIA DA SILVA SAURO");
        p2.setCpf("222.333.444-15");
        p2.setRg("789456-2");
        /*
        conta2.setnomeDoCorrentista("MARIA PEREIRA DA SILVA SAURO");
        conta2.ExibirDados();
        */
        
        System.out.println("=================================================");
        conta1.ExibirDados();
        
        
    }
    
}
