import java.time.LocalDate;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
        public static void main(String[] args) {
                SortedSet<Pedido> pedidos = new TreeSet<>();

                Cliente fulano = new Cliente("Fulano", "Rua A", 9999);
                Cliente ciclano = new Cliente("Ciclano", "Rua B", 8888);

                Pedido simples = new Pedido(0, new LocalDate.now(), fulano, 500);
                PedidoExpresso expresso = new PedidoExpresso(1, LocalDate.now(), ciclano, 500);
                pedidos.add(simples);
                pedidos.add(expresso);

                System.out.println(simples);
                System.out.println(expresso);
        }
}
