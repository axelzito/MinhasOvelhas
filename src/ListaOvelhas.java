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

    void removeOvelha(Ovelha ovelha) {
        ovelhas.remove(ovelha);
    }

    //lista todos os animais do rebanho
    public void listaOvelhas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados de todos os animais do rebanho: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            o.mostraDados();
        }
    }

    //lista apenas os machos
    public void listaMachos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados de todos os machos: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto) {
                o.mostraDados();
            }
        }
    }

    public void listaReprodutor(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados dos machos reprodutores: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto && (((MachoAdulto) o).getCategoria() == CategoriaMacho.reprodutor)) {
                o.mostraDados();
            }
        }
    }

    public void listaCorte(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados dos machos de corte: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto && (((MachoAdulto) o).getCategoria() == CategoriaMacho.corte)) {
                o.mostraDados();
            }
        }
    }

    //lista apenas as femeas
    public void listaFemeas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados de todas as femeas: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof FemeaAdulta) {
                o.mostraDados();
            }
        }
    }

    //lista apenas os borregos
    public void listaBorregos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Dados de todos os borregos: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof Borrego) {
                o.mostraDados();
            }
        }
    }
}
