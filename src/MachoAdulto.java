

public class MachoAdulto extends Ovelha {

    public MachoAdulto(int id, String nome, Sexo sexo, String raca, Data nascimento) {
        super(id, nome, sexo, raca, nascimento);
    }

    public void mostraDados(){
        System.out.println("Dados do Macho Adulto:");
        System.out.print("Nome: " + getNome() + " Sexo: " + getSexo() + " Raça: " + getRaca() +
                " Data Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
    }
}
