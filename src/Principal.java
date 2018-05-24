import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Principal {

    static ListaOvelhas ovelhas = new ListaOvelhas();
    static ListaComprador compradores = new ListaComprador();
    static boolean programaAtivo = true;

    public static void main(String[] args) {
        while(programaAtivo) {
            telaPrincipal();
        }
    }

    public static void telaPrincipal(){
        try {
            String entrada = JOptionPane.showInputDialog("Digite a opção desejada:\n" + "1 - Cadastro de ovelhas\n" +
                    "2 - Cadastro de compradores\n" + "3 - Vendas\n" + "4 - Relatórios de animais\n" + "5 - Relatórios gerenciais\n" +
                    "6 - Sair\n");
            if(entrada == null) {
                programaAtivo = false;
                return;
            }
            int opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1:
                    telaCadastroOvelha();
                    break;
                case 2:
                    telaCadastroCompradores();
                    break;
                case 3:
                    telaVendas();
                    break;
                case 4:
                    telaRelatorioAnimais();
                    break;
                case 5:
                    telaRelatoriosGerenciais();
                    break;
                case 6:
                    programaAtivo = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaCadastroOvelha() {
        try {
            String entrada = JOptionPane.showInputDialog("Digite a opção desejada:\n" + "1 - Adicionar macho\n" +
                    "2 - Adicionar fêmea\n" + "3 - Adicionar borrego\n" + "4 - Voltar\n");
            if(entrada == null) {
                return;
            }
            int opcao = Integer.parseInt(entrada);

            switch (opcao) {
                case 1:
                    telaCadastroMacho();
                    break;
                case 2:
                    telaCadastroFemea();
                    break;
                case 3:
                    telaCadastroBorrego();
                    break;
                case 4:
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaCadastroMacho() {
        try {
            String id = JOptionPane.showInputDialog("Digite um ID para o animal:\n");
            if(id == null) {
                return;
            }
            int intId = Integer.parseInt(id);
            if(ovelhas.checaExisteId(intId)) {
                JOptionPane.showMessageDialog(null, "O ID já existe!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o NOME:\n");
            if(nome == null || nome == "") {
                return;
            }

            String raca = JOptionPane.showInputDialog("Digite a RAÇA:\n");
            if(raca == null || raca == "") {
                return;
            }

            String nascimento = JOptionPane.showInputDialog("Digite a DATA DE NASCIMENTO (dd/mm/aaaa):\n");
            if(nascimento == null) {
                return;
            }
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date data;
            data = (Date)formatter.parse(nascimento);

            String peso = JOptionPane.showInputDialog("Digite o PESO:\n");
            if(peso == null) {
                return;
            }
            double dPeso = Double.parseDouble(peso);

            String categoria = JOptionPane.showInputDialog("Digite a CATEGORIA:\n" + "1 - Reprodutor\n" + "2 - Corte\n");
            if(categoria == null) {
                return;
            }
            int intCategoria = Integer.parseInt(categoria);

            MachoAdulto macho;

            switch (intCategoria) {
                case 1:
                    macho = new MachoAdulto(intId, nome, Sexo.macho, raca, data, dPeso, CategoriaMacho.reprodutor);
                    break;
                case 2:
                    macho = new MachoAdulto(intId, nome, Sexo.macho, raca, data, dPeso, CategoriaMacho.corte);
                    break;
                default:
                    macho = new MachoAdulto(intId, nome, Sexo.macho, raca, data, dPeso, CategoriaMacho.corte);
                    break;
            }
            ovelhas.addOvelha(macho);
            JOptionPane.showMessageDialog(null, "Macho cadastrado!");
        }
        catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaCadastroFemea(){
        try {
            String id = JOptionPane.showInputDialog("Digite um ID para o animal:\n");
            if(id == null) {
                return;
            }
            int intId = Integer.parseInt(id);
            if(ovelhas.checaExisteId(intId)) {
                JOptionPane.showMessageDialog(null, "O ID já existe!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o NOME:\n");
            if(nome == null || nome == "") {
                return;
            }

            String raca = JOptionPane.showInputDialog("Digite a RAÇA:\n");
            if(raca == null || raca == "") {
                return;
            }

            String nascimento = JOptionPane.showInputDialog("Digite a DATA DE NASCIMENTO (dd/mm/aaaa):\n");
            if(nascimento == null) {
                return;
            }
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date data = (Date)formatter.parse(nascimento);

            String peso = JOptionPane.showInputDialog("Digite o PESO:\n");
            if(peso == null) {
                return;
            }
            double dPeso = Double.parseDouble(peso);

            FemeaAdulta femea = new FemeaAdulta(intId, nome, Sexo.femea, raca, data, dPeso);

            int opcao = JOptionPane.showConfirmDialog(null, "Deseja adicionar filho(s) para esta fêmea?", null, JOptionPane.YES_NO_OPTION);
            if(opcao == 0) {
                int maisFilhos = 0;
                while(maisFilhos == 0) {
                    String nomeFihlo = JOptionPane.showInputDialog("Digite o nome do filho:\n");
                    if(nomeFihlo == null) {
                        return;
                    }
                    femea.addFilho(nomeFihlo);
                    maisFilhos = JOptionPane.showConfirmDialog(null, "Deseja adicionar mais filhos para esta fêmea?", null, JOptionPane.YES_NO_OPTION);
                }
            }
            ovelhas.addOvelha(femea);
            JOptionPane.showMessageDialog(null, "Fêmea cadastrada!");
        }
        catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaCadastroBorrego(){
        try {
            String id = JOptionPane.showInputDialog("Digite um ID para o animal:\n");
            if(id == null) {
                return;
            }
            int intId = Integer.parseInt(id);
            if(ovelhas.checaExisteId(intId)) {
                JOptionPane.showMessageDialog(null, "O ID já existe!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o NOME:\n");
            if(nome == null || nome == "") {
                return;
            }

            String raca = JOptionPane.showInputDialog("Digite a RAÇA:\n");
            if(raca == null || nome == "") {
                return;
            }

            String nascimento = JOptionPane.showInputDialog("Digite a DATA DE NASCIMENTO (dd/mm/aaaa):\n");
            if(nascimento == null) {
                return;
            }
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date data;
            data = (Date)formatter.parse(nascimento);

            String peso = JOptionPane.showInputDialog("Digite o PESO:\n");
            if(peso == null) {
                return;
            }
            double dPeso = Double.parseDouble(peso);

            String sexo = JOptionPane.showInputDialog("Digite o SEXO:\n" + "1 - Macho\n" + "2 - FÊMEA\n");
            if(sexo == null) {
                return;
            }
            int intSexo = Integer.parseInt(sexo);

            String mae = JOptionPane.showInputDialog("Digite o nome da MÃE:\n");
            if(mae == null || mae == "") {
                return;
            }

            String pai = JOptionPane.showInputDialog("Digite o nome do PAI:\n");
            if(pai == null || pai == "") {
                return;
            }

            Borrego borrego;

            switch (intSexo) {
                case 1:
                    borrego = new Borrego(intId, nome, Sexo.macho, raca, data, dPeso, mae, pai);
                    break;
                case 2:
                    borrego = new Borrego(intId, nome, Sexo.femea, raca, data, dPeso, mae, pai);
                    break;
                default:
                    borrego = new Borrego(intId, nome, Sexo.macho, raca, data, dPeso, mae, pai);
                    break;
            }
            ovelhas.addOvelha(borrego);
            JOptionPane.showMessageDialog(null, "Borrego cadastrado!");
        }
        catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaRelatorioAnimais() {
        try {
            String entrada = JOptionPane.showInputDialog("Digite a opção desejada:\n" + "1 - Lista todos animais do rebanho\n" +
                    "2 - Lista todos machos\n" + "3 - Lista todas fêmeas\n" + "4 - Lista machos reprodutores \n" + "5 - Lista machos de corte\n" +
                    "6 - Lista todos borregos\n" + "7 - Busca Ovelha pelo ID\n" + "8 - Lista de filhos de uma fêmea");
            if(entrada == null) {
                return;
            }
            int opcao = Integer.parseInt(entrada);
            String relatorio = "";

            switch (opcao) {
                case 1:
                    relatorio = "Lista de todo o rebanho:\n\n";
                    LinkedList<Ovelha> listaRebanho = ovelhas.listaOvelhas();
                    for (int i = 0; i < listaRebanho.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaRebanho.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 2:
                    relatorio = "Lista de todo os machos:\n\n";
                    LinkedList<MachoAdulto> listaMachos = ovelhas.listaMachos();
                    for (int i = 0; i < listaMachos.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaMachos.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 3:
                    relatorio = "Lista de todas as fêmeas:\n\n";
                    LinkedList<FemeaAdulta> listaFemeas = ovelhas.listaFemeas();
                    for (int i = 0; i < listaFemeas.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaFemeas.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 4:
                    relatorio = "Lista de todos machos reprodutores:\n\n";
                    LinkedList<MachoAdulto> listaReprodutores = ovelhas.listaReprodutor();
                    for (int i = 0; i < listaReprodutores.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaReprodutores.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 5:
                    relatorio = "Lista de todos machos reprodutores:\n\n";
                    LinkedList<MachoAdulto> listaCorte = ovelhas.listaCorte();
                    for (int i = 0; i < listaCorte.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaCorte.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 6:
                    relatorio = "Lista de todos borregos:\n\n";
                    LinkedList<Borrego> listaBorregos = ovelhas.listaBorregos();
                    for (int i = 0; i < listaBorregos.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaBorregos.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 7:
                    String id = JOptionPane.showInputDialog("Digite o ID do animal:");
                    if(id == null) {
                        return;
                    }
                    int intId = Integer.parseInt(id);
                    Ovelha ovelha = ovelhas.buscaPorId(intId);
                    if(ovelha == null) {
                        JOptionPane.showMessageDialog(null, "Ovelha não encontrada.");
                        return;
                    }
                    JOptionPane.showMessageDialog(null, ovelha.mostraDados());
                    break;

                case 8:
                    String idFemea = JOptionPane.showInputDialog("Digite o ID da fêmea:");
                    if(idFemea == null) {
                        return;
                    }
                    int intIdFemea = Integer.parseInt(idFemea);
                    Ovelha ovelhaFemea = ovelhas.buscaPorId(intIdFemea);
                    if(ovelhaFemea == null) {
                        JOptionPane.showMessageDialog(null, "Ovelha não encontrada.");
                        return;
                    }
                    if(ovelhaFemea.getSexo() != Sexo.femea || ovelhaFemea instanceof Borrego) {
                        JOptionPane.showMessageDialog(null, "ID não corresponde a uma fêmea");
                        return;
                    }
                    FemeaAdulta femea = (FemeaAdulta)ovelhaFemea;
                    LinkedList<String> filhos = femea.listaFilhos();
                    String relatorioFilhos = "Lista de filhos da ovelha (" + intIdFemea + "):\n";
                    for (int i = 0; i < filhos.size(); i++) {
                        relatorioFilhos = relatorioFilhos + filhos.get(i) + "\n";
                    }
                    JOptionPane.showMessageDialog(null, relatorioFilhos);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaCadastroCompradores() {
        try {
            String id = JOptionPane.showInputDialog("Digite um ID para o comprador:\n");
            if(id == null) {
                return;
            }
            int intId = Integer.parseInt(id);
            if(compradores.checaExisteId(intId)) {
                JOptionPane.showMessageDialog(null, "O ID já existe!");
                return;
            }

            String nome = JOptionPane.showInputDialog("Digite o NOME:\n");
            if(nome == null || nome == "") {
                return;
            }

            Comprador comprador = new Comprador(intId, nome);
            compradores.cadastraComprador(comprador);
            JOptionPane.showMessageDialog(null, "Comprador cadastrado!");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaVendas(){
        try {
            String idComprador = JOptionPane.showInputDialog("Digite o ID do comprador:\n");
            if(idComprador == null) {
                return;
            }
            int intIdComprador = Integer.parseInt(idComprador);

            Comprador comprador = compradores.retornaCompradorPorId(intIdComprador);
            if(comprador == null) {
                JOptionPane.showMessageDialog(null, "Comprador não encontrado.");
                return;
            }

            String idOvelha = JOptionPane.showInputDialog("Digite o ID da ovelha a ser vendida:\n");
            if(idOvelha == null) {
                return;
            }
            int IntIdOvelha = Integer.parseInt(idOvelha);

            if(ovelhas.buscaPorId(IntIdOvelha) == null) {
                JOptionPane.showMessageDialog(null, "Ovelha não encontrada.");
                return;
            }

            String preco = JOptionPane.showInputDialog("Digite o PREÇO:\n");
            if(preco == null) {
                return;
            }
            double dPreco = Double.parseDouble(preco);

            String data = JOptionPane.showInputDialog("Digite a DATA da venda (dd/mm/yyyy):\n");
            if(data == null) {
                return;
            }
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Date dataVenda = (Date)formatter.parse(data);

            comprador.addVenda(IntIdOvelha, dPreco, dataVenda);
            ovelhas.venderOvelha(IntIdOvelha);
            JOptionPane.showMessageDialog(null, "Venda adicionada ao comprador!");
        }
        catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

    public static void telaRelatoriosGerenciais(){
        try {
            String entrada = JOptionPane.showInputDialog("Digite a opção desejada:\n" + "1 - Ovelhas a venda\n" +
                    "2 - Ovelhas vendidas\n" + "3 - Vendas feita a um determinado comprador\n" + "4 - Valor total gasto por um comprador \n" +
                    "5 - Valor total vendido\n");
            if(entrada == null) {
                return;
            }
            int opcao = Integer.parseInt(entrada);
            String relatorio = "";

            switch (opcao) {
                case 1:
                    relatorio = "Ovelhas a venda:\n\n";
                    LinkedList<Ovelha> listaRebanho = ovelhas.listaOvelhas();
                    for (int i = 0; i < listaRebanho.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaRebanho.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 2:
                    relatorio = "Ovelhas vendidas:\n\n";
                    LinkedList<Ovelha> ovelhasVendidas = ovelhas.listaOvelhasVendidas();
                    for (int i = 0; i < ovelhasVendidas.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + ovelhasVendidas.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 3:
                    String idComprador1 = JOptionPane.showInputDialog("Digite o ID do comprador:\n");
                    if(idComprador1 == null) {
                        return;
                    }
                    int intIdComprador1 = Integer.parseInt(idComprador1);
                    Comprador comprador1 = compradores.retornaCompradorPorId(intIdComprador1);
                    if(comprador1 == null) {
                        JOptionPane.showMessageDialog(null, "Comprador não encontrado.");
                        return;
                    }
                    LinkedList<Venda> listaCompras = comprador1.listaCompras();
                    relatorio = "Vendas feitas para " + comprador1.getNome() + ":\n";
                    for (int i = 0; i < listaCompras.size(); i++) {
                        relatorio = relatorio + (i+1) + " - \n" + listaCompras.get(i).mostraDados();
                    }
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 4:
                    String idComprador2 = JOptionPane.showInputDialog("Digite o ID do comprador:\n");
                    if(idComprador2 == null) {
                        return;
                    }
                    int intIdComprador2 = Integer.parseInt(idComprador2);
                    Comprador comprador2 = compradores.retornaCompradorPorId(intIdComprador2);
                    if(comprador2 == null) {
                        JOptionPane.showMessageDialog(null, "Comprador não encontrado.");
                        return;
                    }
                    relatorio = compradores.valorCompras(intIdComprador2) + "";
                    JOptionPane.showMessageDialog(null, relatorio);
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, compradores.valorTotalVendas());
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "O valor informado está com o formato inválido!");
        }
    }

}