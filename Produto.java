// https://stackoverflow.com/questions/2670982/using-pairs-or-2-tuples-in-java
class Tripla<X, Y, Z> {
        public final X x;
        public final Y y;
        public final Z z;
        
        public Tripla(X x, Y y, Z z) {
                this.x = x;
                this.y = y;
                this.z = z;
        }
}

class Produto {
        String nome;
        double preco;
        double peso;
        Tripla<Double, Double, Double> dimensao; // não é usado...
        double frete_base;

        public Produto(String nome, double preco, double peso) {
                this.nome  = nome;
                this.preco = preco;
                this.peso  = peso;  // em gramas
                this.setFreteBase();
        }

        public double getPreco() {
                return this.preco;
        }

        public void setFreteBase() {
                this.frete_base = (0.1 * this.preco);
        }

        public double getFreteBase() {
                return this.frete_base;
        }
}
