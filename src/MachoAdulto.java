import java.text.SimpleDateFormat;
import java.util.Date;

public class MachoAdulto extends Ovelha {

    private CategoriaMacho categoria;

    public MachoAdulto(int id, String nome, Sexo sexo, String raca, Date nascimento, double peso, CategoriaMacho categoria) {
        super(id, nome, sexo, raca, nascimento, peso);
        this.categoria = categoria;
    }

    //mostra os dados do animal
    public String mostraDados(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return ("\tNome: " + getNome() + "\n\tSexo: " + getSexo() + "\n\tRaca: " + getRaca() +
                "\n\tCategoria: " + getCategoria() + "\n\tData Nascimento: " + sdf.format(getNascimento()) +
                "\n\tPeso: " + getPeso() + "Kg" + "\n");
    }

    public CategoriaMacho getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaMacho categoria) {
        this.categoria = categoria;
    }
}
