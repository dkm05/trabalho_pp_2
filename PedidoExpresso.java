import java.time.LocalDate;

class PedidoExpresso extends Pedido {
        PedidoExpresso(int numero, LocalDate data, Cliente cliente, double preco) {
                super(numero, data, cliente,  preco * 1.2);
        }

        @Override
        public boolean noPrazo() {
                return true;
        }
}
