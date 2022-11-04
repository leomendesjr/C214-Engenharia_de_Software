package test;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TesteBuscaInimigo {

    @Test
    public void testeBuscaInimigoSkeleton() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(10);

        Assert.assertEquals("Skeleton", skeleton.getNome());
        Assert.assertEquals(200.0, skeleton.getQtdVida(), 0.1);
        Assert.assertEquals("Espada do Skeleton", skeleton.getArma());
    }

    @Test
    public void testeBuscaInimigoPadrao() {
        InimigoService service = new MockInimigoService();
        BuscaInimigo buscaInimigo = new BuscaInimigo(service);

        Inimigo skeleton = buscaInimigo.buscaInimigo(99);

        Assert.assertEquals("Aranha", skeleton.getNome());
        Assert.assertEquals(20, skeleton.getQtdVida(), 0.1);
        Assert.assertEquals("Teia", skeleton.getArma());
    }
}
