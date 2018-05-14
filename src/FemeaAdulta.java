import java.util.Iterator;
import java.util.LinkedList;

public class FemeaAdulta extends Ovelha {

    //private String[] filho;
    private LinkedList<Borrego> filhos; //lista da classe borregos que podem ser filhos da mae
    private Data cobertura, paricao;

    public FemeaAdulta(int id, String nome, Sexo sexo, String raca, Data nascimento) {
        super(id, nome, Sexo.femea, raca, nascimento); //verificar se pode fazer isso de setar o sexo da femea aqui
        filhos = new LinkedList<Borrego>();
        //sexo = Sexo.femea;
    }
    /*
    public String[] getFilho() {
        return filho;
    }

    public void setFilho(String[] filho) {
        this.filho = filho;
    }
    */
    public Data getCobertura() {
        return cobertura;
    }

    public void setCobertura(Data cobertura) {
        this.cobertura = cobertura;
    }

    public Data getParicao() {
        return paricao;
    }

    public void setParicao(Data paricao) {
        this.paricao = paricao;
    }

    //mostra os dados do animal para relatorio geral
    public void mostraDados(){
        System.out.println("Dados da Femea Adulta:");
        System.out.print("Nome: " + getNome() + " Sexo: " + getSexo() + " Raça: " + getRaca() +
                " Data Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
    }

    //adiciona um filho pra mae
    public void addFilho(Borrego filho) {
        filhos.add(filho);
    }

    //mostra os filhos da mae
    public void mostraFilhos() {
        String filho = null;
        Iterator i = filhos.iterator();

        Borrego b;

        System.out.println("Lista de filhos: ");
        while (i.hasNext()) {
            b = (Borrego) i.next();
            if (b instanceof Borrego) {
                System.out.println("Nome: " + b.getNome() +
                        " Data Nascimento: " + b.getNascimento().getDia() + "/" + b.getNascimento().getMes() + "/" + b.getNascimento().getAno());
            }
        }
    }

    public void prenhez() {

    }
}
