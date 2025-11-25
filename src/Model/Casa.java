package Model;

public class Casa extends Financiamento {
    private double areaConstruida;

    public Casa(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double areaConstruida) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.areaConstruida = areaConstruida;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    @Override
    public String getInfo() {
        return "Casa - Área construída: " + areaConstruida + " m²";
    }
}