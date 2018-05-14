public class TesteOvelhas {

    public static void main(String[] args) {


        ListaOvelhas l = new ListaOvelhas();

        MachoAdulto m1 = new MachoAdulto(1, "Forlan", Sexo.macho, "romanov", new Data(01,01,2017));
        l.addOvelha(m1);
        MachoAdulto m2 = new MachoAdulto(1, "Forlan2", Sexo.macho, "romanov", new Data(01,01,2017));
        l.addOvelha(m2);
        MachoAdulto m3 = new MachoAdulto(1, "Forlan3", Sexo.macho, "romanov", new Data(01,01,2017));
        l.addOvelha(m3);
        MachoAdulto m4 = new MachoAdulto(1, "Forlan4", Sexo.macho, "romanov", new Data(01,01,2017));
        l.addOvelha(m4);

        FemeaAdulta f1 = new FemeaAdulta(5, "Branquinha", Sexo.femea, "romaov", new Data(01,01,2017));
        l.addOvelha(f1);
        FemeaAdulta f2 = new FemeaAdulta(5, "Branquinha2", Sexo.femea, "romaov", new Data(01,01,2017));
        l.addOvelha(f2);
        FemeaAdulta f3 = new FemeaAdulta(5, "Branquinha3", Sexo.femea, "romaov", new Data(01,01,2017));
        l.addOvelha(f3);

        Borrego b1 = new Borrego(8, "Costelinha", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
        l.addOvelha(b1);
        Borrego b2 = new Borrego(8, "Costelinha2", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
        l.addOvelha(b2);
        Borrego b3 = new Borrego(8, "Costelinha3", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
        l.addOvelha(b3);
        Borrego b4 = new Borrego(8, "Costelinha4", Sexo.macho, "f1 romanov santa ines", new Data(05,04,2018), "Branquinha", "Forlan");
        l.addOvelha(b4);

        l.listaOvelhas();

        f1.addFilho(b1);
        f1.addFilho(b2);
        f1.addFilho(b3);
        f1.addFilho(b4);

        System.out.println("\n\n");
        f1.mostraFilhos();

        System.out.println("\n\n");
        f1.mostraDados();

        System.out.println("\n\n");
        l.listaFemeas();
    }
}
