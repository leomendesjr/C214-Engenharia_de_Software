package br.inatel.teste;

import br.inatel.Algoritmo;
import br.inatel.OrdenaBubbleSort;
import br.inatel.OrdenaInsertionSort;
import br.inatel.OrdenaSelectionSort;
import br.inatel.func.impl.Bubble_Sort;
import br.inatel.func.impl.Insertion_Sort;
import br.inatel.func.impl.Selection_Sort;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TesteOrdenacao {

    Algoritmo algoritmo;

    @Test
    public void testeOrdenaBubble() {
        algoritmo = new OrdenaBubbleSort();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        input.add(22);
        input.add(10);
        input.add(21);
        input.add(3);
        input.add(9);
        expected.add(3);
        expected.add(9);
        expected.add(10);
        expected.add(21);
        expected.add(22);

        algoritmo.ordenaVetor(input);
        assertTrue(algoritmo.getOrdenador() instanceof Bubble_Sort);
        assertEquals(expected, input);
    }

    @Test
    public void testeOrdenaInsertion() {
        algoritmo = new OrdenaInsertionSort();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        input.add(9);
        input.add(10);
        input.add(21);
        input.add(3);
        input.add(22);
        expected.add(3);
        expected.add(9);
        expected.add(10);
        expected.add(21);
        expected.add(22);

        algoritmo.ordenaVetor(input);
        assertTrue(algoritmo.getOrdenador() instanceof Insertion_Sort);
        assertEquals(expected, input);
    }

    @Test
    public void testeOrdenaSelection() {
        algoritmo = new OrdenaSelectionSort();
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();

        input.add(9);
        input.add(10);
        input.add(21);
        input.add(3);
        input.add(22);
        expected.add(3);
        expected.add(9);
        expected.add(10);
        expected.add(21);
        expected.add(22);

        algoritmo.ordenaVetor(input);
        assertTrue(algoritmo.getOrdenador() instanceof Selection_Sort);
        assertEquals(expected, input);
    }
}
