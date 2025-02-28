import org.example.AvaliadorDeNotas;
import org.example.Estudante;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class EstudanteTest {

    @Test
    public void testCriacaoEstudanteValido() {
        Estudante estudante = new Estudante("Maria", 85);
        Assertions.assertEquals("Maria", estudante.getNome());
        Assertions.assertEquals(85, estudante.getNotaFinal());
    }

    @Test
    public void testNotaInvalidaAbaixoDeZero() {
        try {
            new Estudante("Carlos", -5);
            fail("Esperava-se uma IllegalArgumentException, mas não foi lançada.");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("A nota deve estar entre 0 e 100.", e.getMessage());
        }
    }

    @Test
    public void testNotaInvalidaAcimaDeCem() {
        try {
            new Estudante("Ana", 105);
            fail("Esperava-se uma IllegalArgumentException, mas não foi lançada.");
        } catch (IllegalArgumentException e) {
            Assertions.assertEquals("A nota deve estar entre 0 e 100.", e.getMessage());
        }
    }

    @Test
    void testClassificacaoExcelente() {
        Estudante estudante = new Estudante("Lucas", 95);
        Assertions.assertEquals("Excelente", AvaliadorDeNotas.classificarNota(estudante));
    }

    @Test
    void testClassificacaoBom() {
        Estudante estudante = new Estudante("Julia", 80);
        Assertions.assertEquals("Bom", AvaliadorDeNotas.classificarNota(estudante));
    }

    @Test
    void testClassificacaoRegular() {
        Estudante estudante = new Estudante("Pedro", 60);
        Assertions.assertEquals("Regular", AvaliadorDeNotas.classificarNota(estudante));
    }

    @Test
    void testClassificacaoInsuficiente() {
        Estudante estudante = new Estudante("Fernanda", 40);
        Assertions.assertEquals("Insuficiente", AvaliadorDeNotas.classificarNota(estudante));
    }

    @Test
    void testClassificacaoReprovado() {
        Estudante estudante = new Estudante("Rafael", 20);
        Assertions.assertEquals("Reprovado", AvaliadorDeNotas.classificarNota(estudante));
    }
}

