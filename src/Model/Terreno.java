package Model;

public class Terreno extends Financiamento {
    private double metragem;

    public Terreno(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, double metragem) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.metragem = metragem;
    }

    public double getMetragem() {
        return metragem;
    }

    @Override
    public String getInfo() {
        return "Terreno - Metragem: " + metragem + " m²";
    }
}