
// Borrego é um tipo de ovelha, são os recem-nascidos / jovens

import java.text.SimpleDateFormat;
import java.util.Date;

public class Borrego extends Ovelha {

    private String mae, pai; //recem nascimos tem obrigatoriamente mae, mas nao necessariamente o pai é conhecido

    public Borrego(int id, String nome, Sexo sexo, String raca, Date nascimento, double peso, String mae, String pai) {
        super(id, nome, sexo, raca, nascimento, peso);
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

    public String mostraDados(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        //System.out.println("Dados do Borrego:");
        return ("Nome: " + getNome() + "\nSexo: " + getSexo() + "\nRaça: " + getRaca() +
                "\nData Nascimento: " + sdf.format(getNascimento()) + " \nPeso: " + getPeso() + "Kg" + "\nNome da mae: " + getMae() +
                "\nNome do pai: " + getPai() + "\n");
    }
}
