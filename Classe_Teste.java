public class Classe_Teste{
    public static void main (String args[]){
        //Cria a primeira cidade, usando o construtor da classe
        System.out.println("Cadastre a cidade 1");
        Cidade c1 = new Cidade(Teclado.leInt("Informe o código"),Teclado.leString("Informe a descricao"),
        Teclado.leString("Informe a UF"), Teclado.leInt("Informe a quantidade de estudantes"));

        //Cria a segunda cidade
        System.out.println("Cadastre a cidade");
        Cidade c2 = new Cidade(Teclado.leInt("Informe o codigo"), Teclado.leString("Informe a descricao"),
        Teclado.leString("Informe a UF"), Teclado.leInt("Informe a quantidade de estudantes"));
        
        //Cria o primeiro estudante (cidade 1)
        System.out.println("Cadastre o primeiro estudante");
        Estudante e1 = new Estudante(Teclado.leInt("Insira o codigo do estudante"), Teclado.leString("Insira o nome do estudante"),
        Teclado.leString("Insira a data de nascimento"), Teclado.leString("Insira o email"), Teclado.leString("Insira a senha"), c1);

        //Cria o segundo estudante (cidade 1)
        System.out.println("Cadastre o segundo estudante");
        Estudante e2 = new Estudante(Teclado.leInt("Insira o codigo do estudante"), Teclado.leString("Insira o nome do estudante"), 
        Teclado.leString("Insira a data de nascimento"), Teclado.leString("Insira o email"), Teclado.leString("Insira a senha"), c1);
        
        //Cria o terceiro estudante (cidade 2)
        System.out.println("Cadastre o terceiro estudante");
        Estudante e3 = new Estudante(Teclado.leInt("Insira o codigo do estudante"), Teclado.leString("Insira o nome do estudante"), 
        Teclado.leString("Insira a data de nascimento"), Teclado.leString("Insira o email"), Teclado.leString("Insira a senha"), c2);
        
        //Cria o quarto estudante (cidade 2)
        System.out.println("Cadastre o quarto estudante");
        Estudante e4 = new Estudante(Teclado.leInt("Insira o codigo do estudante"), Teclado.leString("Insira o nome do estudante"), 
        Teclado.leString("Insira a data de nascimento"), Teclado.leString("Insira o email"), Teclado.leString("Insira a senha"), c2);
        
        //Entrada de dados e1
        System.out.println("Atualize os dados,"+ e1.getNome());
        String senhaAnterior;
        String novaSenha;
        String confirmaSenha;
        int tamanhoSenha;
        System.out.println(e1.getNome() + "atualize a sua senha");
        senhaAnterior = Teclado.leString("Digite sua senha anterior");
        novaSenha = Teclado.leString("Digite a sua nova senha");
        confirmaSenha = Teclado.leString("Confirme sua senha");
        tamanhoSenha = novaSenha.length();
        System.out.println(tamanhoSenha);
        //Validacao dos dados e1
        if ((e1.getSenha().equals(senhaAnterior)) && (novaSenha.equals(confirmaSenha)) && tamanhoSenha >= 8){
            e1.setSenha(confirmaSenha);
            System.out.println("Senha atualizada com sucesso!");
        }else{
            System.out.println("ERRO: As senhas nao coincidem!");
        }

        //Entrada de dados e2
        System.out.println("Atualize os dados"+ e2.getNome());
        System.out.println(e2.getNome()+", atualize sua senha!");
        senhaAnterior = Teclado.leString("Digite sua senha anterior:");
        novaSenha = Teclado.leString("Digite sua nova senha:");
        confirmaSenha = Teclado.leString("Confirme a nova senha:");
        tamanhoSenha = novaSenha.length();
        //Validacao dos dados e2
        if ((e2.getSenha().equals(senhaAnterior)) && (novaSenha.equals(confirmaSenha)) && tamanhoSenha >= 8){
            e2.setSenha(confirmaSenha);
            System.out.println("Senha atualizada com sucesso!");
        }else{
            System.out.println("ERRO: As senhas nao coincidem!");
        }
        

        //Entrada de dados e3
        System.out.println("Atualize os dados, "+ e3.getNome());
        System.out.println("Atualize sua senha!" + e3.getNome());
        senhaAnterior = Teclado.leString("Senha anterior:");
        novaSenha = Teclado.leString("Nova senha:");
        confirmaSenha = Teclado.leString("Confirme nova senha:");

        //Validacao dos dados e3
        if ((e3.getSenha().equals(senhaAnterior)) && (novaSenha.equals(confirmaSenha)) && tamanhoSenha >= 8){
            e3.setSenha(confirmaSenha);
            System.out.println("Senha atualizada com sucesso!");
        }else{
            System.out.println("ERRO: As senhas nao coincidem!");
        }

        //Entrada de dados e4
        System.out.println("Atualize os seus dados"+ e4.getNome());
        System.out.println("Atualize sua senha!" + e4.getNome());
        senhaAnterior = Teclado.leString("Digite a sua senha anterior");
        novaSenha = Teclado.leString("Digite a nova senha");
        confirmaSenha = Teclado.leString("Confirme a nova senha");
        tamanhoSenha = novaSenha.length();
        //Validacao dos dados e4
        if (e4.getSenha().equals(senhaAnterior) && (novaSenha.equals(confirmaSenha)) && tamanhoSenha >= 8){
            e4.setSenha(confirmaSenha);
            System.out.println("Senha atualizada com sucesso!");
        }else{
            System.out.println("ERRO: As senhas nao coincidem!");
        }

        System.out.println("Exibindo dados dos estudantes");
        System.out.println("Cidade 1");
        c1.exibeDados();
        e1.exibeDados();
        e2.exibeDados();
        System.out.println("Cidade 2");
        c2.exibeDados();
        e3.exibeDados();
        e4.exibeDados();
    }
}
