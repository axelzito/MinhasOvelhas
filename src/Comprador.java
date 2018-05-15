import java.util.LinkedList;

public class Comprador {

    private int idComprador;
    private String nome;
    LinkedList<Venda> ovelhasCompradas;

    public Comprador(int idComprador, String nome, LinkedList<Venda> ovelhasCompradas) {
        this.idComprador = idComprador;
        this.nome = nome;
        this.ovelhasCompradas = ovelhasCompradas;
    }

    public int getIdComprador() {
        return idComprador;
    }

    public void setIdComprador(int idComprador) {
        this.idComprador = idComprador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVenda(Venda venda){

        ovelhasCompradas.add(venda);
    }

    public LinkedList<Venda> listaCompras(){

        return ovelhasCompradas;
    }
}
