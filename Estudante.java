public class Estudante{
    //Atributos da classe
    int codigo;
    String nome;
    String dataNascimento;
    String email;
    String senha;
    Cidade cidade;
    
    //Constructor
    public Estudante(int cod, String nom, String datNasc, String e_mail, String sen, Cidade cida){
        codigo = cod;
        nome = nom;
        dataNascimento = datNasc;
        email = e_mail;
        senha = sen;
        cidade = cida;
    }
    //Métodos GET
    public int getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public String getDataNascimento(){
        return dataNascimento;
    }
    public String getEmail(){
        return email;
    }
    public String getSenha(){
        return senha;
    }
    public Cidade getCidade(){
        return cidade;
    }
    //Método SET
    public void setCodigo(int cod){
        codigo = cod;
    }
    public void setNome(String nom){
        nome = nom;
    }
    public void setDataNascimento(String datNasc){
        dataNascimento = datNasc;
    }
    public void setEmail(String e_mail){
        email = e_mail;
    }
    public void setSenha(String sen){
        senha = sen;
    }
    public void setCidade(Cidade cid){
        cidade = cid;
    }
    public void exibeDados(){
        System.out.println("Codigo:"+codigo);
        System.out.println("Nome do aluno"+nome);
        System.out.println("Data de nascimento"+dataNascimento);
        System.out.println("Email"+email);
        System.out.println("Senha"+senha);
        System.out.println("Cidade"+cidade);
    }
}