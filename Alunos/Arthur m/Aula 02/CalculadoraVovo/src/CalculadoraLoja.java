public class CalculadoraLoja {

    public double calcularPrecoTotal(int quantidade, double precoUnitario) {
        return quantidade * precoUnitario;
    }

    public double calcularTroco(double valorRecebido, double valorTotal) {
        return valorRecebido - valorTotal;
    }

}