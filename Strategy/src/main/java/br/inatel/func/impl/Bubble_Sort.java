package br.inatel.func.impl;

import java.util.ArrayList;
import java.util.List;

import br.inatel.Ordenador;

public class Bubble_Sort implements Ordenador {

    @Override
    public ArrayList ordenacao(ArrayList<Integer> listaInt) {
        for (int i = 0; i < listaInt.size() - 1; i++) {
            for (int j = 0; j < listaInt.size() - 1 - i; j++) {
                if (listaInt.get(j) > listaInt.get(j + 1)) {
                    int aux = listaInt.get(j);
                    listaInt.set(j, listaInt.get(j+1));
                    listaInt.set(j+1, aux);
                }
            }
        }
        return listaInt;
    }
}