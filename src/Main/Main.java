package Main;

import Model.*;
import Util.ArquivoUtil;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Financiamento> financiamentos = new ArrayList<>();

        // Adicionando financiamentos variados
        financiamentos.add(new Apartamento(200000, 30, 0.07, 5));
        financiamentos.add(new Casa(300000, 25, 0.08, 120));
        financiamentos.add(new Terreno(150000, 20, 0.09, 360));
        financiamentos.add(new Casa(250000, 15, 0.1, 100));

        double totalImoveis = 0;
        double totalFinanciamentos = 0;

        for (Financiamento f : financiamentos) {
            totalImoveis += f.getValorImovel();
            totalFinanciamentos += f.calcularTotalPagamento();
        }

        System.out.printf("Total de todos os imóveis: R$ %.2f%n", totalImoveis);
        System.out.printf("Total de todos os financiamentos (com juros): R$ %.2f%n", totalFinanciamentos);

        // Salvando em .txt e .ser
        ArquivoUtil.salvarTexto(financiamentos, "financiamentos.txt");
        ArquivoUtil.lerTexto("financiamentos.txt");
        ArquivoUtil.salvarSerializado(financiamentos, "financiamentos.ser");
        ArquivoUtil.lerSerializado("financiamentos.ser");
    }
}