import java.text.SimpleDateFormat;
import java.util.Date;

public class Venda {

    private int id;
    private double preco;
    private Date dataVenda;

    public Venda(int id, double preco, Date dataVenda) {
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

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }

    public String mostraDados(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ("ID Ovelha: " + getId() + "\nPre?o vendido: " + getPreco() + "\nData da Venda: " + sdf.format(getDataVenda()) + "\n");
    }
}
