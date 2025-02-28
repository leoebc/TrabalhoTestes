package org.example;

public class AvaliadorDeNotas {
    public static String classificarNota(Estudante estudante) {
        double nota = estudante.getNotaFinal();
        if (nota >= 90) {
            return "Excelente";
        } else if (nota >= 75) {
            return "Bom";
        } else if (nota >= 50) {
            return "Regular";
        } else if (nota >= 30) {
            return "Insuficiente";
        } else {
            return "Reprovado";
        }
    }
}
