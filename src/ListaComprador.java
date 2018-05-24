import java.util.Iterator;
import java.util.LinkedList;

public class ListaComprador {

    private LinkedList<Comprador> compradores;

    public ListaComprador() {
        this.compradores = new LinkedList<Comprador>();
    }

    //adiciona comprador na lista de compradorez
    public void cadastraComprador (Comprador comprador){
        this.compradores.add(comprador);
    }

    //busca e retorna um comprador pelo deu ID
    public Comprador retornaCompradorPorId (int id){
        Iterator<Comprador> i = this.compradores.iterator();
        Comprador c;

        while (i.hasNext()) {
            c = (Comprador) i.next();
            if(id == c.getIdComprador()){
                return c;
            }
        }
        return null;
    }

    //retorna o valor total em compras ja feitas pelo comprador
    public double valorCompras(int idComprador){
        Iterator<Comprador> i = this.compradores.iterator();
        double valor = 0;
        Comprador c;

        while (i.hasNext()) {
            c = (Comprador) i.next();
            if(idComprador == c.getIdComprador()){
                Iterator<Venda> j = c.listaCompras().iterator();
                Venda v;
                while(j.hasNext()){
                    v = (Venda) j.next();
                    valor += v.getPreco();
                }
            }
        }
        return valor;
    }

    //retorna o valor da soma total de todas as vendas
    public double valorTotalVendas(){
        double valor = 0;
        for(int i = 0; i < this.compradores.size(); i++){
            LinkedList<Venda> c = this.compradores.get(i).listaCompras();
            for(int j = 0; j < c.size(); j++){
                valor += c.get(j).getPreco();
            }
        }
        return valor;
    }

    public boolean checaExisteId(int id) {
        Iterator<Comprador> i = this.compradores.iterator();
        Comprador o;
        while (i.hasNext()) {
            o = (Comprador) i.next();
            if(id == o.getIdComprador()){
                return true;
            }
        }
        return false;
    }
}