import java.util.Iterator;
import java.util.LinkedList;

public class GerenciaComprador {

    private LinkedList<Comprador> compradores;

    public GerenciaComprador() {
        this.compradores = new LinkedList<Comprador>();
    }

    public void cadastraComprador (Comprador comprador){
        compradores.add(comprador);
    }

    public Comprador retornaCompradorPorId (int id){

        String comprador = null;
        Iterator i = compradores.iterator();

        Comprador c;

        while (i.hasNext()) {
            c = (Comprador) i.next();
            if(id == c.getIdComprador()){
                return c;
            }
        }
        return null;
    }

    public double valorCompra(int id){
        String comprador = null;
        Iterator i = compradores.iterator();
        double valor = 0;

        Comprador c;

        while (i.hasNext()) {
            c = (Comprador) i.next();
            if(id == c.getIdComprador()){
                Iterator j = c.ovelhasCompradas.iterator();
                Venda v;
                while(j.hasNext()){
                    v = (Venda) j.next();
                    valor += v.getPreco();
                }
            }
        }
        return valor;
    }

    public double valorTotalVendas(){

        double valor = 0;

        for(int i = 0; i < compradores.size(); i++){

            LinkedList<Venda> c = compradores.get(i).listaCompras();
            for(int j = 0; j < c.size(); j++){
                valor += c.get(j).getPreco();
            }
        }

        return valor;
    }
}
