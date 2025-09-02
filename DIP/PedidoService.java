package DIP;

public class PedidoService {
    private BancoDeDados db;

    public PedidoService(BancoDeDados db) {
        this.db = db;
    }

    public void salvar(Pedido pedido) {
        db.salvar(pedido);
    }
}