public class Principal {
    public static void main(String[] args){
        ContaCorrenteSimplificada conta1, conta2 = null;
        conta1 = new ContaCorrenteSimplificada();
        
        PessoaFisica p1 = new PessoaFisica();
       // PessoaFisica p2 = new PessoaFisica();
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
        
        
        PessoaFisica p2 = new PessoaFisica();         
        conta2 = conta1;
        conta2.setPessoa(p2);
        p2.setNomeCompleto("MARIA DA SILVA SAURO");
        p2.setCpf("222.333.444-15");
        p2.setRg("789456-2");
        /*
        conta2.setnomeDoCorrentista("MARIA PEREIRA DA SILVA SAURO");
        conta2.ExibirDados();
        */
        
        System.out.println("=================================================");
        conta1.ExibirDados();
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.setnomeFantasia("ITEGO");
        pessoaJuridica.setRazaoSocial("ITEGO SEBASTIÃO SIQUEIRA");
        pessoaJuridica.setCnpj("123.852.789/001-25");
        
        ContaCorrenteSimplificada conta3 = new ContaCorrenteSimplificada();
        conta3.depositar(1000);
        conta3.setPessoa(pessoaJuridica);
        conta3.setAgencia("789-92");
        conta3.setnroConta("446677-92");
        conta3.ExibirDados();
        System.out.println("=================================================");
        System.out.println("\n 04/09/2019");
        
        // Alteração Dia 04/09/2019
        PessoaFisica p3 = new PessoaFisica();                 
        //conta1 = conta1;
        conta1.setPessoa(p3);
        p3.setNomeCompleto("JOÃOZINHO DA SILVA");
        p3.setCpf("567.852.147-96");
        p3.setRg("78541-3");
        
        
        
        PessoaJuridica p4 = new PessoaJuridica();
        p4.setnomeFantasia("ITEGO-GO");
        p4.setRazaoSocial("ITEGO SEBASTIÃO");
        p4.setCnpj("123.852.789/001-25");
        
        
        conta1.depositar(1000);
        conta1.setPessoa(pessoaJuridica);
        conta1.setAgencia("789-92");
        conta1.setnroConta("446677-92");

        
        conta1.AdicionarCorrentista(p3);
        conta1.AdicionarCorrentista(p4);
        conta1.ExibirDados();
        
        System.out.println("=================================================");
        System.out.println("\n 04/09/2019");
        
        
        
    }
    
}
