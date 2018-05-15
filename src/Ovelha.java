public class Ovelha {

    /*
    Sistema gerenciador de rebanho de ovinos, onde é possível adicionar e excluir animais, prever cio, prever data de parir.
    Ao adicionar animais recém nascidos perguntar quem é a mãe (obrigatório) e o pai caso conhecido.
    Gerar relatório com todos os animais do rebanho, podendo pedir relatório específico de machos (reprodutores ou corte), fêmeas e borregos.
    Adicionar árvore genealógica e gerar aviso de consanguinidade de primeiro grau.
    Efetuar venda/compra de animais e dar baixa/alta.
    Permitir indicar a data de cobertura de uma ovelha e gerar previsão da data de parir e próximo cio..
    Permitir que clientes consultem o preço dos animais à venda.
     */

    //Ovelhas tem idOvelha, nome, sexo, raça e data de nascimento (caso desconhecida adicionar aproximada)

    private int idOvelha;
    private String nome, raca;
    private Sexo sexo;
    private Data nascimento;

    public Ovelha(int idOvelha, String nome, Sexo sexo, String raca, Data nascimento) {
        this.idOvelha = idOvelha;
        this.nome = nome;
        this.raca = raca;
        this.sexo = sexo;
        this.nascimento = nascimento;
    }

    public int getIdOvelha() {
        return idOvelha;
    }

    public void setIdOvelha(int idOvelha) {
        this.idOvelha = idOvelha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String mostraDados(){
        return "";
    }

}
