import java.time.LocalDate;

class Pedido {
        private int numero;
        private LocalDate data;
        private Cliente cliente;
        private double preco;

        public Pedido(int numero, LocalDate data, Cliente cliente, double preco) {
                if (numero >= 0)
                        this.numero = numero;
                this.data = data;
                this.cliente = cliente;
                if (preco >= 0)
                        this.preco = preco;
        }

        public boolean noPrazo() {
                return false;
        }

        public String toString() {
                return "Nome: "    + this.cliente.nome +
                     "\nPreço: "   + this.preco        +
                     "\nEntregue no prazo: " + noPrazo();
        }

}

