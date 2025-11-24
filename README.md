# Sistema de Financiamentos Imobiliários em Java  
Atividade Somativa – Fundamentos da Programação Orientada a Objetos – PUCPR  
Autora: **Francine Basagni**

---

## 1. Sobre o Projeto


Este projeto foi desenvolvido como parte da atividade avaliativa da disciplina de POO e tem como propósito colocar em prática, de forma clara e objetiva, os principais conceitos de orientação a objetos usando Java.

A aplicação simula financiamentos imobiliários reais, permitindo calcular valores, organizar diferentes tipos de imóveis e salvar essas informações em arquivos.  
A ideia central foi criar um sistema simples, mas bem estruturado, que demonstrasse domínio do conteúdo da disciplina e pudesse ser facilmente evoluído depois.

---

## 2. Objetivo da Implementação


A construção do sistema foi guiada por alguns objetivos principais:

- Representar diferentes tipos de imóveis com características próprias.  
- Utilizar herança e polimorfismo para tratar todos os financiamentos de forma unificada.  
- Realizar cálculos financeiros reais, como valor total do financiamento e pagamento mensal.  
- Demonstrar persistência de dados tanto em arquivo texto quanto serializado.  
- Manter o código claro, organizado e de fácil leitura.

O resultado é um projeto funcional, didático e que reflete bem a proposta da atividade.

---

## 3. Conceitos de POO Aplicados


### **Abstração**  
A classe `Financiamento` concentra atributos e comportamentos básicos comuns a qualquer financiamento.

### **Herança**  
As classes `Casa`, `Apartamento` e `Terreno` estendem `Financiamento` e adicionam detalhes específicos de cada tipo de imóvel.

### **Polimorfismo**  
Uma única lista (`ArrayList<Financiamento>`) é capaz de armazenar diferentes tipos de imóveis e tratá-los de forma uniforme.

### **Encapsulamento**  
Acesso controlado aos atributos e métodos para manter a integridade dos dados.

Esses pilares aparecem de forma prática ao longo de todo o código.

---

## 4. Persistência dos Dados


O sistema salva e recupera dados de duas formas:

- **Arquivo texto (`financiamentos.txt`)**  
  Ideal para leitura rápida e visualização simples.

- **Arquivo serializado (`financiamentos.ser`)**  
  Garante que todos os objetos retornem exatamente como foram gravados.

A classe `ArquivoUtil` centraliza toda a lógica de leitura e escrita, mantendo o projeto organizado.

---

## 5. Estrutura do Projeto


```plaintext
FundamentosdaProgramacaoOrientadaaObjetos-EntregaAtividadeSomativa2/
├── src/
│   ├── Main/
│   │   └── Main.java
│   ├── Model/
│   │   ├── Financiamento.java
│   │   ├── Casa.java
│   │   ├── Apartamento.java
│   │   └── Terreno.java
│   └── Util/
│       └── ArquivoUtil.java

```

## 6. Como Executar


Pela IDE

  1. Importe o projeto para sua IDE de preferência.
  2. Configure a pasta src como diretório de código-fonte.
  3. Abra Main.java em src/Main.
  4. Execute o método main.


Pelo terminal

```plaintext

javac -d out src/Main/Main.java src/Model/*.java src/Util/*.java
cd out
java Main.Main

```
## 7. Funcionalidades do Sistema


 - Criação de diferentes tipos de financiamento.
 - Cálculo de parcelas mensais usando juros compostos.
 - Cálculo do custo total do financiamento.
 - Organização dos financiamentos em uma lista.
 - Salvamento e leitura de arquivos de texto.
 - Serialização e recuperação da lista completa de financiamentos.

## 8. O que este Projeto Representa


Este trabalho reúne, de forma prática, os principais pontos estudados durante a disciplina:
modelagem com classes, organização em pacotes, uso de coleções, abstração, herança, polimorfismo e persistência.

Além de cumprir todos os requisitos da atividade, ele também serve como uma boa base para projetos maiores — basta incluir novos tipos de financiamento, novas regras de cálculo ou até uma interface gráfica.
├── financiamentos.txt
└── financiamentos.ser
