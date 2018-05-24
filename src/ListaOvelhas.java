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

    //lista todos os animais do rebanho
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

    //lista todos os animais vendidos
    public LinkedList<Ovelha> listaOvelhasVendidas(){
        return this.ovelhasVendidas;
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

    //lista de machos reprodutores
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

    //lista de machos de corte
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

    //busca ovelha pelo id
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

    //vende uma ovelha, adiciona ela na lista de vendidas e remove da lista de ovelhas do rebanho
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

    //Checa se o id já existe
    public boolean checaExisteId(int id) {
        Iterator<Ovelha> i = this.ovelhas.iterator();
        Ovelha o;
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(id == o.getIdOvelha()){
                return true;
            }
        }
        i = this.ovelhasVendidas.iterator();
        while (i.hasNext()) {
            o = (Ovelha) i.next();
            if(id == o.getIdOvelha()){
                return true;
            }
        }
        return false;
    }
}
