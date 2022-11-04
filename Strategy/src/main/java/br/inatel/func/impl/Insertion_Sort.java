package br.inatel.func.impl;
import br.inatel.Ordenador;
import java.util.ArrayList;

public class Insertion_Sort implements Ordenador {

    @Override
    public ArrayList ordenacao(ArrayList<Integer> listaInt) {
        for(int k=1; k<listaInt.size()-1; k++)   {
            int temp = listaInt.get(k);
            int j= k-1;
            while(j>=0 && temp <= listaInt.get(j))   {
                listaInt.set(j+1, listaInt.get(j));
                j = j-1;
            }
            listaInt.set(j+1, temp);
        }
        return listaInt;
    }
}
