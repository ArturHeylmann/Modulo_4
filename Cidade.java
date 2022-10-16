public class Cidade {
    //Atributos da classe
    int codigo;
    String descricao;
    String unidadeFederativa;
    int quantEstud;
    //Construtor
    public Cidade(int cod, String descr, String uF, int qE){
        codigo = cod;
        descricao = descr;
        unidadeFederativa = uF;
        quantEstud = qE;     
    }
    //Metodos GET
    public int getCodigo(){
        return codigo;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getUnidadeFederativa(){
        return unidadeFederativa;
    }
    public int getQuantEstud(){
        return quantEstud;
    }
    //Metodo SET
    public void setCodigo(int cod){
        codigo = cod;
    }
    public void setDescricao(String descr){
        descricao = descr;
    }
    public void setUnidadeFederativa(String uF){
        unidadeFederativa = uF;
    }
    public void setQuantEstud(int qE){
        quantEstud = qE;
    }
    //Adicionar novos estudantes
    public void adicionaEstudante(){
        quantEstud++;
    }
    //Exibe os dados
    public void exibeDados(){
        System.out.println("Codigo"+codigo);
        System.out.println("Codigo"+descricao);
        System.out.println("Unidade Federativa"+unidadeFederativa);
        System.out.println("Quantidade de estudantes"+quantEstud);
    }

}
