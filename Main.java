import java.time.LocalDate;
import java.util.PriorityQueue;
import java.util.Comparator;

class Comp implements Comparator<Pedido> {
        // pode comparar por data tb...
        @Override
        public int compare(Pedido p1, Pedido p2) {
                int ret = compare_no_prazo(p1.noPrazo(), p2.noPrazo());
                if (ret >= 0)
                        ret = compare_preco(p1.getPreco(), p2.getPreco());
                return ret;
        }

        private int compare_no_prazo(boolean a, boolean b) {
                if (a && !b)
                        return -1;
                else if (a && b || (!a && !b))
                        return 0;
                else
                        return 1;
        }

        private int compare_preco(double a, double b) {
                if (a < b)
                        return -1;
                else if (a - b < 10e-8)
                        return 0;
                else
                        return 1;
        }
}

public class Main {
        public static void main(String[] args) {
                PriorityQueue<Pedido> pedidos = new PriorityQueue<>(new Comp());

                Cliente fulano = new Cliente("Fulano", "Rua A", 9999);
                Cliente ciclano = new Cliente("Ciclano", "Rua B", 8888);

                Pedido simples = new Pedido(0, LocalDate.now(), fulano, 500);
                PedidoExpresso expresso = new PedidoExpresso(1, LocalDate.now(), ciclano, 500);
                pedidos.add(simples);
                pedidos.add(expresso);

                System.out.println(simples);
                System.out.println(expresso);
                System.out.println(pedidos);
        }
}
