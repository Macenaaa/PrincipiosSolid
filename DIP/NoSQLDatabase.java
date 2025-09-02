package DIP;

public class NoSQLDatabase implements BancoDeDados {

    public void salvar (Pedido pedido) {
        System.out.println("Usando NoSQL");
    }
    
}
