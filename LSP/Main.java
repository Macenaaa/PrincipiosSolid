package LSP;

public class Main {


    public static void printarTipo(Ave ave){
        System.out.println(ave.getClass().toString());
    }

    public static void main(String[] args) {

        Ave galinha = new Galinha();
        Ave pinguim = new Pinguim();

        printarTipo(galinha);
        printarTipo(pinguim);

    }
        

}
