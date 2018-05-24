import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class FemeaAdulta extends Ovelha {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    //private LinkedList<Borrego> filhos; //lista da classe borregos que podem ser filhos da mae
    private LinkedList<String> filhos;
    private Date cobertura, paricao, cio;

    public FemeaAdulta(int id, String nome, Sexo sexo, String raca, Date nascimento, double peso) {
        super(id, nome, Sexo.femea, raca, nascimento, peso); //verificar se pode fazer isso de setar o sexo da femea aqui
        filhos = new LinkedList<String>();
        //filhos = new LinkedList<Borrego>();
        //sexo = Sexo.femea;
    }

    public Date getCobertura() {
        return cobertura;
    }

    public void setCobertura(Date cobertura) {
        this.cobertura = cobertura;
    }

    public Date getParicao() {
        return paricao;
    }

    public void setParicao(Date paricao) {
        this.paricao = paricao;
    }

    public Date getCio() {
        return cio;
    }

    public void setCio(Date cio) {
        this.cio = cio;
    }

    //mostra os dados do animal para relatorio geral
    public String mostraDados(){
        return  ("\tNome: " + getNome() + "\n\tSexo: " + getSexo() + "\n\tRaca: " + getRaca() +
                "\n\tData de Nascimento: " + sdf.format(getNascimento()) + "\n\tPeso: " + getPeso() + "Kg" + "\n");
    }

    /*
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
    */

    //adiciona o nome de um novo filho
    public void addFilho(String nomeFilho) {
        filhos.add(nomeFilho);
    }

    //retorna lista de filhos
    public LinkedList<String> listaFilhos() {
        return this.filhos;
    }

    public String prenhez(Date data) {

        //int x = 5, y=12, z=2018;

        //implementar calculo da data
        Date parir = new Date();

        return sdf.format(parir);
    }

    public String cio(Data data) {

        //int x = 5, y=12, z=2018;

        //implementar calculo da data
        Date proxCio = new Date();

        return sdf.format(proxCio);
    }
}
