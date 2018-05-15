import java.util.Iterator;
import java.util.LinkedList;

public class FemeaAdulta extends Ovelha {

    private LinkedList<Borrego> filhos; //lista da classe borregos que podem ser filhos da mae
    private Data cobertura, paricao, cio;

    public FemeaAdulta(int id, String nome, Sexo sexo, String raca, Data nascimento) {
        super(id, nome, Sexo.femea, raca, nascimento); //verificar se pode fazer isso de setar o sexo da femea aqui
        filhos = new LinkedList<Borrego>();
        //sexo = Sexo.femea;
    }

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

    public Data getCio() {
        return cio;
    }

    public void setCio(Data cio) {
        this.cio = cio;
    }

    //mostra os dados do animal para relatorio geral
    public String mostraDados(){
        //System.out.println("Dados da Femea Adulta:");
        return  ("Nome: " + getNome() + " Sexo: " + getSexo() + " Raça: " + getRaca() +
                " Data Nascimento: " + getNascimento().getDia() + "/" + getNascimento().getMes() + "/" + getNascimento().getAno());
    }

    //adiciona um filho pra mae
    public void addFilho(Borrego filho) {
        filhos.add(filho);
    }

    //mostra os filhos da mae
    public LinkedList<Borrego> mostraFilhos() {
        String filho = null;
        Iterator i = filhos.iterator();
        LinkedList<Borrego> son = new LinkedList<Borrego>();

        Borrego b;

        //System.out.println("Lista de filhos: ");
        while (i.hasNext()) {
            b = (Borrego) i.next();
            if (b instanceof Borrego) {
                //b.mostraDados();
                son.add(b);
            }
        }

        return son;
    }

    public Data prenhez(Data data) {

        int x = 5, y=12, z=2018;

        //implementar calculo da data

        return new Data(x, y, z);
    }

    public Data cio(Data data) {

        int x = 5, y=12, z=2018;

        //implementar calculo da data

        return new Data(x, y, z);
    }
}
