

public class MachoAdulto extends Ovelha {

    private CategoriaMacho categoria;

    public MachoAdulto(int id, String nome, Sexo sexo, String raca, Data nascimento, CategoriaMacho categoria) {
        super(id, nome, sexo, raca, nascimento);
        this.categoria = categoria;
    }

    public String mostraDados(){
        //System.out.println("Dados do Macho Adulto:");
        return ("Nome: " + getNome() + " Sexo: " + getSexo() + " Raça: " + getRaca() +
                " Categoria: " + getCategoria() + " Data Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
    }

    public CategoriaMacho getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaMacho categoria) {
        this.categoria = categoria;
    }
}
