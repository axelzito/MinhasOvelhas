import java.util.LinkedList;

public interface Listas {

    public void imprimeOvelhas();
    public LinkedList<Ovelha> listaOvelhas();
    public LinkedList<MachoAdulto> listaMachos();
    public LinkedList<MachoAdulto> listaReprodutor();
    public LinkedList<MachoAdulto> listaCorte();
    public LinkedList<FemeaAdulta> listaFemeas();
    public LinkedList<Borrego> listaBorregos();
    public Ovelha buscaPorId();
    public void venderOvelha();
}
