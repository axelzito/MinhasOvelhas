
public class Comprador {

    private int id, idAnimal;
    private double valor;
    private String nome;

    public Comprador(String nome, int id, int idAnimal, double valor) {
        this.id = id;
        this.idAnimal = idAnimal;
        this.valor = valor;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void compraAnimal(){
        
    }
}
