package Util;

import Model.Financiamento;
import java.io.*;
import java.util.ArrayList;

public class ArquivoUtil {
    public static void salvarTexto(ArrayList<Financiamento> lista, String nomeArquivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Financiamento f : lista) {
                writer.write(String.format("%.2f;%.2f;%.2f;%d;%s%n",
                    f.getValorImovel(),
                    f.calcularTotalPagamento(),
                    f.getTaxaJurosAnual(),
                    f.getPrazoFinanciamento(),
                    f.getInfo()));
            }
        } catch (IOException e) {
            System.err.println("Erro ao salvar arquivo texto: " + e.getMessage());
        }
    }

    public static void lerTexto(String nomeArquivo) {
        System.out.println("\nConteúdo do arquivo texto:");
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler arquivo texto: " + e.getMessage());
        }
    }

    public static void salvarSerializado(ArrayList<Financiamento> lista, String nomeArquivo) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomeArquivo))) {
            oos.writeObject(lista);
        } catch (IOException e) {
            System.err.println("Erro ao salvar objeto serializado: " + e.getMessage());
        }
    }

    public static void lerSerializado(String nomeArquivo) {
        System.out.println("\nConteúdo do arquivo serializado:");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomeArquivo))) {
            ArrayList<Financiamento> lista = (ArrayList<Financiamento>) ois.readObject();
            for (Financiamento f : lista) {
                System.out.println(f.getInfo() + " | Valor total: R$ " + f.calcularTotalPagamento());
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler objeto serializado: " + e.getMessage());
        }
    }
}