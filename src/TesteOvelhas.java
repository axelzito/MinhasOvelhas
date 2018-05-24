//import javax.swing.*;
//import java.util.LinkedList;
//import java.util.Scanner;
//
//public class TesteOvelhas {
//
//    //variaveis globais para nao sobreescrever na lista se chamar o metodo de novo.
//    public static int id=1; //variavel global do ID pra armazenar o id automaticamente quando adiciona um animal.
//    public static ListaOvelhas l = new ListaOvelhas();
//    public static LinkedList<Ovelha> ovelhas = new LinkedList<Ovelha>();
//
//    public static void main(String[] args) {
//        /*
//        String nome = JOptionPane.showInputDialog("Digite o nome: ");
//        String sobreNome = JOptionPane.showInputDialog("Digite o sobrenome: ");
//
//        String nomeCompleto = nome + " " + sobreNome;
//
//        JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto, "Informação", JOptionPane.INFORMATION_MESSAGE);
//        */
//
//        Scanner leitor = new Scanner(System.in);
//        //System.out.print("Selecione uma das opções abaixo: ");
//        janelaGeral();
//        System.out.print("\nDigite sua opção: ");
//        int x = leitor.nextInt();
//
//        while (x!=0) {
//            switch (x) {
//                case 1:
//                    addAnimal();
//                    janelaGeral();
//                    x = leitor.nextInt();
//                    break;
//                case 2:
//                    addCliente();
//                    janelaGeral();
//                    x = leitor.nextInt();
//                    break;
//                case 3:
//                    vendeAnimal();
//                    janelaGeral();
//                    x = leitor.nextInt();
//                    break;
//                case 4:
//                    relatorioAnimal();
//                    janelaGeral();
//                    x = leitor.nextInt();
//                    break;
//                case 5:
//                    relatorioGerencia();
//                    janelaGeral();
//                    x = leitor.nextInt();
//                    break;
//                case 0:
//                    limpaTela();
//                    System.out.println("\t\t\tObrigado por usar nosso sistema!!!!");
//                    break;
//                default:
//                    System.out.print("Opção invalida, favor entre com um numero valido: ");
//                    x = leitor.nextInt();
//            }
//        }
//    }
//
//    public static void janelaGeral() {
//        System.out.println("\n\t\t\tSISTEMA GERENCIADOR DO SEU REBANHO!");
//
//        System.out.println("\n\tSelecione uma das opções:");
//        System.out.println("\t1 - Adicionar animais");
//        System.out.println("\t2 - Adiciona Cliente");
//        System.out.println("\t3 - Vender animais");
//        System.out.println("\t4 - Relatorios de animais");
//        System.out.println("\t5 - Relatorios Gerenciais");
//        System.out.println("\t0 - Sair");
//    }
//
//    public static void addAnimal(){
//        Scanner leitor = new Scanner(System.in);
//        //janelaGeral();
//        System.out.println("\tSelecione uma das opções:");
//        System.out.println("\t1 - Adicionar Macho reprodutor");
//        System.out.println("\t2 - Adicionar Macho de corte");
//        System.out.println("\t3 - Adicionar Femea");
//        System.out.println("\t4 - Adicionar Borrego");
//        System.out.println("\t5 - Adicionar Filhos a uma femea");
//        System.out.println("\t6 - Voltar ao menu anterior");
//        // usar isso pode bugar, melhor so voltar pro menu anterior usando o de cima
//        //System.out.println("\t0 - Sair");
//
//        // ver variaveis globais para os codigos comentados abaixo
//        //ListaOvelhas l = new ListaOvelhas();
//        //LinkedList<Ovelha> ovelhas = new LinkedList<Ovelha>();
//        //int id = 1;
//        String nome, raca, mae, pai;
//        int dia, mes, ano;
//        int sexo;
//        int idFilho, idMae;
//        int x = leitor.nextInt();
//
//        switch (x) {
//            case 1:
//                System.out.println("\tAdicione os dados do macho reprodutor:");
//                System.out.print("Insira nome: ");
//                nome = leitor.next();
//                System.out.print("\nInsira a raça: ");
//                raca = leitor.next();
//                System.out.print("\nInsira a data de nascimento:\ndia: ");
//                dia = leitor.nextInt();
//                System.out.print(" mes: ");
//                mes = leitor.nextInt();
//                System.out.print(" ano: ");
//                ano = leitor.nextInt();
//
//                MachoAdulto m1 = new MachoAdulto(id, nome, Sexo.macho, raca, new Data(dia,mes,ano), CategoriaMacho.reprodutor);
//                l.addOvelha(m1);
//                id++;
//
//                break;
//            case 2:
//                System.out.println("\tAdicione os dados do macho de corte:");
//                System.out.print("Insira nome: ");
//                nome = leitor.next();
//                System.out.print("\nInsira a raça: ");
//                raca = leitor.next();
//                System.out.print("\nInsira a data de nascimento:\ndia: ");
//                dia = leitor.nextInt();
//                System.out.print(" mes: ");
//                mes = leitor.nextInt();
//                System.out.print(" ano: ");
//                ano = leitor.nextInt();
//
//                MachoAdulto m2 = new MachoAdulto(id, nome, Sexo.macho, raca, new Data(dia,mes,ano), CategoriaMacho.corte);
//                l.addOvelha(m2);
//                id++;
//
//                break;
//            case 3:
//                System.out.println("\tAdicione os dados da femea:");
//                System.out.print("Insira nome: ");
//                nome = leitor.next();
//                System.out.print("\nInsira a raça: ");
//                raca = leitor.next();
//                System.out.print("\nInsira a data de nascimento:\ndia: ");
//                dia = leitor.nextInt();
//                System.out.print(" mes: ");
//                mes = leitor.nextInt();
//                System.out.print(" ano: ");
//                ano = leitor.nextInt();
//
//                FemeaAdulta f1 = new FemeaAdulta(id, nome, Sexo.femea, raca, new Data(dia,mes,ano));
//                l.addOvelha(f1);
//                id++;
//
//                break;
//            case 4:
//                System.out.println("\tAdicione os dados do borrego:");
//                System.out.print("Insira nome: ");
//                nome = leitor.next();
//                System.out.print("\nInsira a raça: ");
//                raca = leitor.next();
//                System.out.print("\nInsira o sexo (1 - macho | 2 - femea): ");
//                sexo = leitor.nextInt();
//                System.out.print("Insira nome da mae: ");
//                mae = leitor.next();
//                System.out.print("\nInsira o nome do pai(se desconhecido, deixe um espaço em branco): ");
//                pai = leitor.next();
//                System.out.print("\nInsira a data de nascimento:\ndia: ");
//                dia = leitor.nextInt();
//                System.out.print(" mes: ");
//                mes = leitor.nextInt();
//                System.out.print(" ano: ");
//                ano = leitor.nextInt();
//
//                if(sexo==1){
//                    Borrego b1 = new Borrego(id, nome, Sexo.macho, raca, new Data(dia,mes,ano), mae, pai);
//                    l.addOvelha(b1);
//                    id++;
//                } else if(sexo ==2){
//                    Borrego b1 = new Borrego(id, nome, Sexo.femea, raca, new Data(dia,mes,ano), mae, pai);
//                    l.addOvelha(b1);
//                    id++;
//                }
//
//                break;
//            case 5:
//                System.out.print("Digite o id do filho que quer cadastrar: ");
//                idFilho = leitor.nextInt();
//                System.out.print("\nDigite o id da mae: ");
//                idMae = leitor.nextInt();
//
//                Borrego borrego;
//                FemeaAdulta femea;
//                borrego = (Borrego) l.buscaPorId(idFilho);
//                femea = (FemeaAdulta) l.buscaPorId(idMae);
//                femea.addFilho(borrego);
//
//                break;
//            case 6:
//                break;
//            default:
//                System.out.print("Opção invalida, favor entre com um numero valido: ");
//                x = leitor.nextInt();
//        }
//    }
//
//    public static void addCliente() {
//        Scanner leitor = new Scanner(System.in);
//        //janelaGeral();
//        System.out.println("\tSelecione uma das opções:");
//        System.out.println("\t1 - Adicionar Cliente");
//
//    }
//
//
//    public static void vendeAnimal(){
//        Scanner leitor = new Scanner(System.in);
//        //janelaGeral();
//        System.out.println("\tSelecione uma das opções:");
//        System.out.println("\t1 - Vender animal");
//        System.out.println("\t2 - ");
//        System.out.println("\t3 - ");
//
//        int dia, mes, ano;
//
//        // new Data(dia, mes, ano)
//    }
//
//    public static void relatorioAnimal(){
//        Scanner leitor = new Scanner(System.in);
//        //janelaGeral();
//        System.out.println("\tSelecione uma das opções:");
//        System.out.println("\t1 - Relatorio de todos os animais do rebanho");
//        System.out.println("\t2 - ");
//        System.out.println("\t3 - ");
//    }
//
//    public static void relatorioGerencia(){
//        Scanner leitor = new Scanner(System.in);
//        //janelaGeral();
//        System.out.println("\tSelecione uma das opções:");
//        System.out.println("\t1 - Relatorio de todos os clientes");
//        System.out.println("\t2 - ");
//        System.out.println("\t3 - ");
//    }
//
//    public static void limpaTela() {
//        for(int i=0; i<30; i++) {
//            System.out.println("\n");
//        }
//    }
//}
//
//*/
//
///*
//        main() com inserção manual para testes
//
//        //aux();
//
//        ListaOvelhas l = new ListaOvelhas();
//
//        MachoAdulto m1 = new MachoAdulto(1, "Forlan", Sexo.macho, "romanov", new Data(01,01,2017), CategoriaMacho.reprodutor);
//        l.addOvelha(m1);
//        MachoAdulto m2 = new MachoAdulto(1, "Forlan2", Sexo.macho, "romanov", new Data(01,01,2017), CategoriaMacho.corte);
//        l.addOvelha(m2);
//        MachoAdulto m3 = new MachoAdulto(1, "Forlan3", Sexo.macho, "romanov", new Data(01,01,2017), CategoriaMacho.reprodutor);
//        l.addOvelha(m3);
//        MachoAdulto m4 = new MachoAdulto(1, "Forlan4", Sexo.macho, "romanov", new Data(01,01,2017), CategoriaMacho.corte);
//        l.addOvelha(m4);
//
//        FemeaAdulta f1 = new FemeaAdulta(5, "Branquinha", Sexo.femea, "romaov", new Data(01,01,2017));
//        l.addOvelha(f1);
//        FemeaAdulta f2 = new FemeaAdulta(5, "Branquinha2", Sexo.femea, "romaov", new Data(01,01,2017));
//        l.addOvelha(f2);
//        FemeaAdulta f3 = new FemeaAdulta(5, "Branquinha3", Sexo.femea, "romaov", new Data(01,01,2017));
//        l.addOvelha(f3);
//
//        Borrego b1 = new Borrego(8, "Costelinha", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
//        l.addOvelha(b1);
//        Borrego b2 = new Borrego(8, "Costelinha2", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
//        l.addOvelha(b2);
//        Borrego b3 = new Borrego(8, "Costelinha3", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
//        l.addOvelha(b3);
//        Borrego b4 = new Borrego(56, "Costelinha4", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
//        l.addOvelha(b4);
//
//        //l.listaOvelhas();
//
//        f1.addFilho(b1);
//        f1.addFilho(b2);
//        f1.addFilho(b3);
//        f1.addFilho(b4);
//
//        LinkedList<MachoAdulto> macho = l.listaMachos();
//        for(int i=0; i < macho.size(); i ++){
//            String nome = macho.get(i).getNome();
//            CategoriaMacho cat = macho.get(i).getCategoria();
//            System.out.println("Nome: " + nome + " Categoria: " + cat);
//        }
//
//        System.out.println(" ");
//        f1.mostraFilhos();
//
//        System.out.println("\n\n");
//        f1.mostraDados();
//        l.listaReprodutor();
//
//        System.out.println("\n\n");
//        l.listaCorte();
//
//        System.out.println("\n\n");
//        l.listaMachos();
//
//        System.out.println(l.buscaPorId(56).mostraDados());
//
//        System.out.println(f1.prenhez(new Data(1,2,1992)).getDia() + "/" + f1.prenhez(new Data(1,2,1992)).getMes()
//                + "/" + f1.prenhez(new Data(1,2,1992)).getAno());
// */