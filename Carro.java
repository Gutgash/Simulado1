public class Carro {
    private final String modelo;
    private float velocidade;
    private float preco;

    public Carro(String modelo, float velocidade, float preco) {
        this.modelo = modelo;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
