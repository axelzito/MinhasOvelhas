import java.util.Iterator;
import java.util.LinkedList;

public class ListaOvelhas {

    private LinkedList<Ovelha> ovelhas;

    public ListaOvelhas(){
        ovelhas = new LinkedList<Ovelha>();
    }

    void addOvelha(Ovelha ovelha){
        ovelhas.add(ovelha);
    }

    //lista todos os animais do rebanho
    public void listaOvelhas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            System.out.println("Nome: " + o.getNome() + " Sexo: " + o.getSexo() + " Raça: " + o.getRaca() +
                    " Data Nascimento: " + o.getNascimento().getDia() + "/" + o.getNascimento().getMes() + "/" + o.getNascimento().getAno());
        }
    }

    //lista apenas os machos
    public void listaMachos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto) {
                System.out.println("Nome: " + o.getNome() + " Sexo: " + o.getSexo() + " Raça: " + o.getRaca() +
                        " Data Nascimento: " + o.getNascimento().getDia() + "/" + o.getNascimento().getMes() + "/" + o.getNascimento().getAno());
            }
        }
    }

    //lista apenas as femeas
    public void listaFemeas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof FemeaAdulta) {
                System.out.println("Nome: " + o.getNome() + " Sexo: " + o.getSexo() + " Raça: " + o.getRaca() +
                        " Data Nascimento: " + o.getNascimento().getDia() + "/" + o.getNascimento().getMes() + "/" + o.getNascimento().getAno());
            }
        }
    }

    //lista apenas os borregos
    public void listaBorregos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof Borrego) {
                System.out.println("Nome: " + o.getNome() + " Sexo: " + o.getSexo() + " Raça: " + o.getRaca() +
                        " Data Nascimento: " + o.getNascimento().getDia() + "/" + o.getNascimento().getMes() + "/" + o.getNascimento().getAno());
            }
        }
    }


}
