package DIP;

public class Main {

  public static void main(String[] args) {

    BancoDeDados db = new NoSQLDatabase();

    PedidoService pedidoService = new PedidoService(db);

    Pedido pedido = new Pedido();

    pedidoService.salvar(pedido);


  }
   
}
