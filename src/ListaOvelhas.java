import java.util.Iterator;
import java.util.LinkedList;

public class ListaOvelhas {

    private LinkedList<Ovelha> ovelhas;
    private LinkedList<Ovelha> ovelhasVendidas;

    public ListaOvelhas(){
        ovelhas = new LinkedList<Ovelha>();
    }

    void addOvelha(Ovelha ovelha){
        ovelhas.add(ovelha);
    }

    void removeOvelha(Ovelha ovelha) {
        ovelhas.remove(ovelha);
    }

    //lista apenas os machos
    public void imprimeOvelhas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        System.out.println("Lista de todo o rebanho: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto) {
               o.mostraDados();
            }
        }
    }

    //lista todos os animais do rebanho
    public LinkedList<Ovelha> listaOvelhas(){

        return ovelhas;
    }

    //lista apenas os machos
    public LinkedList<MachoAdulto> listaMachos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();
        LinkedList<MachoAdulto> aux = new LinkedList<MachoAdulto>();

        Ovelha o;

        //System.out.println("Dados de todos os machos: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto) {
                MachoAdulto m = (MachoAdulto) o;
                aux.add(m);
            }
        }

        return aux;
    }

    public LinkedList<MachoAdulto> listaReprodutor(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();
        LinkedList<MachoAdulto> aux = new LinkedList<MachoAdulto>();

        Ovelha o;

        //System.out.println("Dados dos machos reprodutores: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto && (((MachoAdulto) o).getCategoria() == CategoriaMacho.reprodutor)) {
                MachoAdulto m = (MachoAdulto) o;
                aux.add(m);
            }
        }

        return aux;
    }

    public LinkedList<MachoAdulto> listaCorte(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();
        LinkedList<MachoAdulto> aux = new LinkedList<MachoAdulto>();

        Ovelha o;

        //System.out.println("Dados dos machos de corte: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof MachoAdulto && (((MachoAdulto) o).getCategoria() == CategoriaMacho.corte)) {
                MachoAdulto m = (MachoAdulto) o;
                aux.add(m);
            }
        }

        return aux;
    }

    //lista apenas as femeas
    public LinkedList<FemeaAdulta> listaFemeas(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();
        LinkedList<FemeaAdulta> aux = new LinkedList<FemeaAdulta>();

        Ovelha o;

        //System.out.println("Dados de todas as femeas: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof FemeaAdulta) {
                FemeaAdulta m = (FemeaAdulta) o;
                aux.add(m);
            }
        }

        return aux;
    }

    //lista apenas os borregos
    public LinkedList<Borrego> listaBorregos(){

        String ovelha = null;
        Iterator i = ovelhas.iterator();
        LinkedList<Borrego> aux = new LinkedList<Borrego>();

        Ovelha o;

        //System.out.println("Dados de todos os borregos: ");
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(o instanceof Borrego) {
                Borrego m = (Borrego) o;
                aux.add(m);
            }
        }

        return aux;
    }

    public Ovelha buscaPorId(int id){

        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(id == o.getIdOvelha()){
                return o;
            }
        }
        return null;
    }

    public void venderOvelha(int id) {
        String ovelha = null;
        Iterator i = ovelhas.iterator();

        Ovelha o;

        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(id == o.getIdOvelha()){
                ovelhasVendidas.add(o);
                removeOvelha(o);
            }
        }
    }
}
