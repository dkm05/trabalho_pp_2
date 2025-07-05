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

class Pedido {
        private int numero;
        private LocalDate data;
        private Cliente cliente;
        private double preco;
        public Produto produto; // pode ser uma lista
        public static PriorityQueue<Pedido> pedidos = new PriorityQueue<>(new Comp());

        public Pedido(int numero, LocalDate data, Cliente cliente, double preco, Produto produto) {
                if (numero >= 0)
                        this.numero = numero;
                this.data = data;
                this.cliente = cliente;
                this.preco = produto.getPreco();
                this.produto = produto;
                this.pedidos.add(this);
        }

        public boolean noPrazo() {
                return false;
        }

        public double getPreco() {
                return this.preco;
        }

        public String toString() {
                return "Nome: "    + this.cliente.nome +
                     "\nPreço: "   + this.preco        +
                     "\nEntregue no prazo: " + noPrazo() + "\n";
        }
}
