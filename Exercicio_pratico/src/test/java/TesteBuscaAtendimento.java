import org.junit.Test;

import static org.junit.Assert.*;

public class TesteBuscaAtendimento {

    // -------------------------------Teste de sucesso
        @Test
        public void testeBuscaAtendimentoDouglas() {
            AtendimentoService service = new MockAtendimentoService();
            BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

            Atendimento douglas = buscaAtendimento.buscaAtendimento("douglas");

            assertEquals("Douglas", douglas.getNomeDoProfessor());
            assertEquals(19, douglas.getHorarioDeAtendimento(), 0.1);
            assertEquals("noturno", douglas.getPeriodo());
        }

        @Test
        public void testeBuscaAtendimentoFernanda() {
            AtendimentoService service = new MockAtendimentoService();
            BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

            Atendimento fernanda = buscaAtendimento.buscaAtendimento("fernanda");

            assertEquals("Fernanda", fernanda.getNomeDoProfessor());
            assertEquals(15, fernanda.getHorarioDeAtendimento(), 0.1);
            assertEquals("integral", fernanda.getPeriodo());
        }


    @Test
    public void testeValidacaoHoraioDeAtendimentoDouglas() {

        AtendimentoService service = new MockAtendimentoService();
        BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

        Atendimento douglas_novo = buscaAtendimento.buscaAtendimento("Douglas");
        boolean douglas = buscaAtendimento.validacaohorarioDeAtendimento(douglas_novo.getHorarioDeAtendimento());

        assertTrue(douglas);
    }


    @Test
    public void validaoperiodoDeAtendimentoDouglas() {

        AtendimentoService service = new MockAtendimentoService();
        BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

        Atendimento douglas_novo = buscaAtendimento.buscaAtendimento("douglas");
        boolean douglas = buscaAtendimento.validaoperiodoDeAtendimento(douglas_novo.getPeriodo());
        assertTrue(douglas);
    }

    // -------------------------------Teste de falha

    @Test
    public void validaoperiodoDeAtendimentoFabio() {

        AtendimentoService service = new MockAtendimentoService();
        BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

        Atendimento fabio_novo = buscaAtendimento.buscaAtendimento("fabio");
        boolean fabio = buscaAtendimento.validaoperiodoDeAtendimento(fabio_novo.getPeriodo());
        assertFalse(fabio);
    }

    @Test
    public void testeValidacaoHoraioDeAtendimentoFabio() {

        AtendimentoService service = new MockAtendimentoService();
        BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

        Atendimento fabio_novo = buscaAtendimento.buscaAtendimento("Fabio");
        boolean fabio = buscaAtendimento.validacaohorarioDeAtendimento(fabio_novo.getHorarioDeAtendimento());

        assertFalse(fabio);
    }

    @Test
    public void testeBuscaAtendimentoFabio() {
        AtendimentoService service = new MockAtendimentoService();
        BuscaAtendimento buscaAtendimento = new BuscaAtendimento(service);

        Atendimento fabio = buscaAtendimento.buscaAtendimento("Fabio");

        assertEquals("Fabio", fabio.getNomeDoProfessor());
        assertNotEquals(10, fabio.getHorarioDeAtendimento(), 0.1);
        assertNotEquals("integral", fabio.getPeriodo());
    }
}
