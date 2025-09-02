package DIP;

public class MySQLDatabase implements BancoDeDados {
    public void salvar (Pedido pedido) {
        System.out.println("Usando MySQL");
    }
    
}