import java.time.LocalDate;

public class Main {
        public static void main(String[] args) {

                Cliente fulano = new Cliente("Fulano", "Rua A", 9999);
                Cliente ciclano = new Cliente("Ciclano", "Rua B", 8888);

                Produto abacaxi = new Produto("abacaxi", 99.00, 1000.00);
                Produto iphone = new Produto("iphone 11", 4000.00, 200.00);

                Pedido simples = new Pedido(0, LocalDate.now(), fulano, iphone.getPreco(), iphone);
                PedidoExpresso expresso = new PedidoExpresso(1, LocalDate.now(), ciclano, abacaxi.getPreco(), abacaxi);

                System.out.println(simples);
                System.out.println(expresso);
                System.out.println(Pedido.pedidos);
        }
}
