package Model;

public class Apartamento extends Financiamento {
    private int andar;

    public Apartamento(double valorImovel, int prazoFinanciamento, double taxaJurosAnual, int andar) {
        super(valorImovel, prazoFinanciamento, taxaJurosAnual);
        this.andar = andar;
    }

    public int getAndar() {
        return andar;
    }

    @Override
    public String getInfo() {
        return "Apartamento - Andar: " + andar;
    }
}