
// Borrego é um tipo de ovelha, são os recem-nascidos / jovens

public class Borrego extends Ovelha {

    private String mae, pai; //recem nascimos tem obrigatoriamente mae, mas nao necessariamente o pai é conhecido

    public Borrego(int id, String nome, Sexo sexo, String raca, Data nascimento, String mae, String pai) {
        super(id, nome, sexo, raca, nascimento);
        this.mae = mae;
        this.pai = pai;
    }

    public String getMae() {
        return mae;
    }

    public void setMae(String mae) {
        this.mae = mae;
    }

    public String getPai() {
        return pai;
    }

    public void setPai(String pai) {
        this.pai = pai;
    }

    public void mostraDados(){
        //System.out.println("Dados do Borrego:");
        System.out.println("Nome: " + getNome() + " Sexo: " + getSexo() + " Raça: " + getRaca() +
                " Data Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
    }
}
