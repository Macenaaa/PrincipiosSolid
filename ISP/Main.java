package ISP;

public class Main {

    public static void main(String[] args) {

        Papagaio papagaio = new Papagaio();

        papagaio.setLocalizacao();
        papagaio.setAltitude();
        papagaio.renderizar();

        Pinguim pinguim = new Pinguim();

        pinguim.setLocalizacao();
        pinguim.renderizar();
    
    }    
}
