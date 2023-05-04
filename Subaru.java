public class Subaru extends Carro{
        private String ano;

        public Subaru(String modelo, float velocidade, float preco, String ano) {
            super(modelo, velocidade, preco);
            this.ano = ano;
        }
        public void setAno(String ano) {
            this.ano = ano;
        }

        public String getAno() {
            return ano;
        }
}
