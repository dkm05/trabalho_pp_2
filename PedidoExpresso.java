import java.time.LocalDate;

class PedidoExpresso extends Pedido {
        private static double limite_frete = 50;
        PedidoExpresso(int numero, LocalDate data, Cliente cliente, double preco, Produto produto) {
                super(numero, data, cliente, produto.getPreco() * 1.2, produto);
        }
        @Override
        public boolean noPrazo() {
                if (produto.getFreteBase() < limite_frete)
                        return true;
                return false;
        }
}
