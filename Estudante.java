package org.example;

public class Estudante {
    private String nome;
    private double notaFinal;

    public Estudante(String nome, double notaFinal) {
        this.nome = nome;
        setNotaFinal(notaFinal);
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public double getNotaFinal() {
        return notaFinal;
    }


    public void setNotaFinal(double notaFinal) {
        if (notaFinal < 0 || notaFinal > 100) {
            throw new IllegalArgumentException("A nota deve estar entre 0 e 100.");
        }
        this.notaFinal = notaFinal;
    }


    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Nota Final: " + notaFinal);
    }

}

