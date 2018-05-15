public class Venda {

    private int id;
    private double preco;
    private Data dataVenda;

    public Venda(int id, double preco, Data dataVenda) {
        this.id = id;
        this.preco = preco;
        this.dataVenda = dataVenda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Data dataVenda) {
        this.dataVenda = dataVenda;
    }
}
