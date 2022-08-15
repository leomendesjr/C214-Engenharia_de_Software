import org.junit.Test;

public class TesteBuscaInimigo {

    @Test
    public void testeBuscaInimigoSkeleton() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(10);

        assertEquals("Skeleton", skeleton.getNome());
        assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        assertEquals("Espada do Skeleton", skeleton.getArma());
    }

    @Test
    public void testeBuscaInimigoPadrao() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(99);

        assertEquals("Aranha", skeleton.getNome());
        assertEquals(20, skeleton.getQtdVida(), 0.1);
        assertEquals("Teia", skeleton.getArma());
    }
}
